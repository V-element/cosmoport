package com.space.service;

import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;

import java.util.List;

public interface ShipService {
    List<Ship> getAllShips(String name, String planet, ShipType shipType,
                           Long after, Long before, Boolean isUsed,
                           Double minSpeed, Double maxSpeed, Integer minCrewSize,
                           Integer maxCrewSize, Double minRating, Double maxRating);

    List<Ship> pagingShips(List<Ship> ships, Integer pageNumber, Integer pageSize, ShipOrder shipOrder);

    void add(Ship ship);
    void delete(Ship ship);
    void edit(Ship ship);
    Ship getById(Long id);
}
