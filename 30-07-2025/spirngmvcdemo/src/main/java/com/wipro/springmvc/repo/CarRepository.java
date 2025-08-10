package com.wipro.springmvc.repo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepository {

    public List<String> getCarList() {
        return Arrays.asList("Audi", "Mercedes", "BMW");
    }
}
