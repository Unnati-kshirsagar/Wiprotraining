package com.wipro.springmvc.service;

import com.wipro.springmvc.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<String> getCarNames() {
        return carRepository.getCarList();
    }
}
