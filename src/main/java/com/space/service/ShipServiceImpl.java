package com.space.service;

import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;
import com.space.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShipServiceImpl implements ShipService {

    @Autowired
    private ShipRepository shipRepository;

    @Override
    public List<Ship> getAllShips(String name, String planet, ShipType shipType,
                                  Long after, Long before, Boolean isUsed,
                                  Double minSpeed, Double maxSpeed, Integer minCrewSize,
                                  Integer maxCrewSize, Double minRating, Double maxRating) {
        return shipRepository.findAll();
    }

    @Override
    public List<Ship> pagingShips(List<Ship> ships, Integer pageNumber, Integer pageSize, ShipOrder shipOrder) {
        return shipRepository.findAll();
    }

    @Override
    public void add(Ship ship) {

    }

    @Override
    public void delete(Ship ship) {

    }

    @Override
    public void edit(Ship ship) {

    }

    @Override
    public Ship getById(Long id) {
        return null;
    }
}
