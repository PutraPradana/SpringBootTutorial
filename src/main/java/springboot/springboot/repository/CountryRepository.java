/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springboot.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.springboot.entities.Country;

/**
 *
 * @author WINDOWS 10
 */
@Repository
public interface CountryRepository extends CrudRepository<Country, Short> {
    
}
