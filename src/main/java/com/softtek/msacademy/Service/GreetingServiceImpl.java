package com.softtek.msacademy.Service;

import com.softtek.msacademy.model.Greet;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingServiceImpl implements  GreetingService {


    public GreetingServiceImpl() {

    }

    public Greet getGreet(int count) {
        Greet greet  = new Greet();
        greet.setTime(LocalTime.now());
        greet.setGreeting("Saludos softtekian");
        greet.setCount(count);
        return greet;
    }
}
