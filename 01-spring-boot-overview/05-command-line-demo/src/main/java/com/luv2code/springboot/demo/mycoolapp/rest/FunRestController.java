package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for coach.name and team.name
    @Value("${coach.name}") // we inject these properties using @Value annotation
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for 'teaminfo'
    @GetMapping("/teaminfo")
    public String teamInfo() {
        return coachName + " " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Lucky day!";
    }

}
