package com.example.business.service;

import com.example.business.DataService;

public class DataServiceStub1 implements DataService {

  @Override
  public int[] retrieveAllData() {
    return new int[]{25, 15, 5};
  }

}
