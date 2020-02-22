package com.softtek.msacademy.controller;

import com.softtek.msacademy.Service.GreetingServiceImpl;
import com.softtek.msacademy.model.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class Greetings {

    @Autowired
    GreetingServiceImpl greetingsService;

    public int count = 0;

    @GetMapping(
            value = "/alan/greetings",
            produces = {APPLICATION_JSON_VALUE}
    )
    public ResponseEntity Greetings() {
        count++;
        Greet greet = greetingsService.getGreet(count);
        return new ResponseEntity(greet,HttpStatus.OK);
    }
}
