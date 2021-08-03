package com.eureka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.entity.Countries;

public interface CountriesRepository extends JpaRepository<Countries,Integer> {

}
