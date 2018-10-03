package com.niharika.service;

import com.niharika.entity.Vehicle;
import com.niharika.exceptions.ResourceNotFoundException;
import com.niharika.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository repository;//property based DI


    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {

        return (List<Vehicle>) repository.findAll();
    }

    @Transactional(readOnly = true)
    public Vehicle findOne(String vin) {
        Optional<Vehicle> existing =repository.findById(vin); // crudrepository returns optional
        if(!existing.isPresent()){
            throw new ResourceNotFoundException("Vehicle with "+vin+"doesnt exist");
        }
        return existing.get(); //extract the vehicle from optional and return it
    }

    @Transactional(readOnly = true)
    public Vehicle create(Vehicle emp) {
        return repository.save(emp);
    }

    @Transactional(readOnly = true)
    public Vehicle update(String vin, Vehicle emp) {
        Optional<Vehicle> existing =repository.findById(vin); // same function as for findById
        if(!existing.isPresent()){
            throw new ResourceNotFoundException("Vehicle with "+vin+"doesnt exist");
        }
        return repository.save(emp);  // then save

    }

    @Transactional(readOnly = true)
    public void delete(String vin) {
        Optional<Vehicle> existing =repository.findById(vin); // find the vehicle using the id
        if(!existing.isPresent()){
            throw new ResourceNotFoundException("Vehicle with "+vin+"doesn't exist");
        }
        repository.delete(existing.get());  // delete the vehicle


    }
}
