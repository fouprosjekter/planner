package org.easyplanner.rest;

import java.util.Objects;
import java.util.function.Function;

import javax.persistence.EntityManager;

import org.easyplanner.model.Deleteable;

public abstract class BaseResource<T extends Deleteable> {

    private EntityManager em;
    
    abstract Class<T> getEntityClass();
    
    private T performInTransaction(Function<EntityManager, T> perform) {
        
        boolean ok = false;
        
        final T result;
        
        try {
            em.getTransaction().begin();
            
            result = perform.apply(em);

            em.getTransaction().commit();

            ok = true;
        }
        finally {
            if (!ok) {
                em.getTransaction().rollback();
            }
        }

        return result;
    }
 
    final T createInDB(T data) {
        
        Objects.requireNonNull(data);
        
        performInTransaction(em -> {
                em.persist(data);

                return null;
            });
        
        return data;
    }
    
    final void updateInDB(T data) {

        Objects.requireNonNull(data);
        
        performInTransaction(em -> {
                em.persist(data);

                return null;
            });
   
    }

    final T getFromDB(long id) {

        return performInTransaction(em -> {
                return em.find(getEntityClass(), id);
            });
   
    }

    final void markDeleted(long id) {
        
        performInTransaction(em -> {
           
            final T deleteable = em.find(getEntityClass(), em);
            
            if (deleteable != null) {
                deleteable.setDeleted(true);
                
                em.persist(deleteable);
            }
            
            return null;
        });
    }
}
