package com.example.business.service;

import com.example.business.DataService;

public class DataServiceStub2 implements DataService {

  @Override
  public int[] retrieveAllData() {
    return new int[]{35};
  }

}