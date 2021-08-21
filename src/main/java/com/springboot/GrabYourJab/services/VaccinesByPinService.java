package com.springboot.GrabYourJab.services;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

@Service
public class VaccinesByPinService{
    
    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<String> getVaccinesByPin(String pincode, String date) throws Exception{
        String baseUri = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByPin?pincode="+pincode+"&date="+date;
        URI uri = new URI(baseUri);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept-Language", "hi_IN");
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> httpEntity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(uri,HttpMethod.GET,httpEntity,String.class);
        return response;
        
    }

}
