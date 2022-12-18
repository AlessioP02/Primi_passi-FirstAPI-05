package com.example.Primi_passiFirstAPI05.controllers;

import com.example.Primi_passiFirstAPI05.DTO.CarDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("/")
    public CarDTO getCar(){


        return new CarDTO();
    }


    @PostMapping("/")
    public String postCar(@Valid @RequestBody(required = false) CarDTO car, HttpStatus httpStatus){

        return car.toString() + httpStatus.CREATED;
    }

}
