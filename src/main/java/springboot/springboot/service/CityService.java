/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springboot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.springboot.entities.City;
import springboot.springboot.repository.CityRepository;

/**
 *
 * @author WINDOWS 10
 */
@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

}
