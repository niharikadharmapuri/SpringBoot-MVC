package com.niharika.service;

import com.niharika.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();

    Vehicle findOne(String vin);

    Vehicle create(Vehicle emp);

    Vehicle update(String id, Vehicle emp);

    void delete(String id);
}
