package org.cars.services;

import java.util.List;

public interface ServiceInterface <T> {
    List<T> getAll();

    T getById(long id);

    void saveOrUpdate(T model);

}
