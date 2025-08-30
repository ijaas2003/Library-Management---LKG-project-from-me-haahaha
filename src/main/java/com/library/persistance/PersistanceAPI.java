package com.library.persistance;

public interface PersistanceAPI<T> {
    boolean add(T obj);
    boolean update(T obj);
    boolean delete(int id);  // delete by id
    T get(int id);
}
