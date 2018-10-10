package com.coddicted.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coddicted.cardatabase.domain.CarRepository;
import com.coddicted.cardatabase.entity.Car;

//@CrossOrigin(origins="http://localhost:3000", maxAge=3600)
@RestController
public class CarController {

  @Autowired private CarRepository repository;

  @RequestMapping("/cars")
  public ResponseEntity<Iterable<Car>> getCars() {
	  HttpHeaders headers = new HttpHeaders();
	  headers.set("Access-Control-Allow-Origin", "*");
    return new ResponseEntity<Iterable<Car>>(repository.findAll(), headers, HttpStatus.CREATED);
    		//repository.findAll();
  }
}
