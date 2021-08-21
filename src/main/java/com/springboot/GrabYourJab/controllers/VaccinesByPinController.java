package com.springboot.GrabYourJab.controllers;

import com.springboot.GrabYourJab.services.VaccinesByPinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cowin")
public class VaccinesByPinController {
    
    @Autowired
    VaccinesByPinService vaccinesByPinService;

    @GetMapping("getByPin/pincode={pincode}&date={date}")
    public ResponseEntity<String> getVaccinesByPin(@PathVariable String pincode, @PathVariable String date ) throws Exception{
        return vaccinesByPinService.getVaccinesByPin(pincode, date);
    }

}
