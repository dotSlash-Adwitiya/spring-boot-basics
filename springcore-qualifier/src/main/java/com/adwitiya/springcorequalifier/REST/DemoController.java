package com.adwitiya.springcorequalifier.REST;

import com.adwitiya.springcorequalifier.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    //* Constructor injections
    @Autowired
    DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        this.myCoach = theCoach;
    }

    //* Defining the end-point
    @GetMapping("/dailyWorkout")
    public String getMethod() {
        return myCoach.getDailyWorkout();
    }
}
