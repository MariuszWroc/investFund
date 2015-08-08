/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.persitence;

import java.util.List;

/**
 *
 * @author mariusz
 */
public interface IGenericDao<T> {

    void add(T entity);

    void clearSession();

    Long count();

    void delete(T entity);

    /**
     * Find all entities
     * @return
     */
    List<T> findAll();

    @SuppressWarnings(value = "unchecked")
    List<T> findAllByCriteria();

    T findById(Long id);

    @SuppressWarnings(value = "unchecked")
    List<T> findByQuery(String query);

    void flushSession();

    Long generateId();

    void merge(T entity);

    void refresh(T entity);

    void saveOrUpdate(T entity);

    void update(T entity);
    
}
