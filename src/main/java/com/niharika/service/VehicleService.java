package com.niharika.service;

import com.niharika.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();

    Vehicle findOne(String vin);

    Vehicle create(Vehicle emp);

    Iterable<Vehicle> update(List<Vehicle> vList);

    void delete(String id);
}