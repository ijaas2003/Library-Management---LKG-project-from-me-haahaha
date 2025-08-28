package com.library.persistance;

public interface PersistanceAPI {
  public boolean add();
  public boolean delete ();
  public boolean update();
  public <T> T get ();
}
