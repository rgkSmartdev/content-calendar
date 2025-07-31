package dev.rgk0002.content_calendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class TestController {

    public TestController() {}

    @GetMapping("/test")
    public String test() {
        List<String> bikes = new ArrayList<String>();

        bikes.add("Suzuki");
        bikes.add("Yamaha");
        bikes.add("Apache");
        bikes.add("Pulsar");
        bikes.add("CBZ");
        bikes.add("Activa");
        bikes.add("Karizma");
        bikes.add("Jupiter");
        bikes.add("Kawasaki");
        System.out.println(bikes);
        return bikes.toString();
    }
}
