package com.adwitiya.springcorequalifier.common;

import org.springframework.stereotype.Component;

//* MARKING the class as @Component allows it to be scanned and injected by the spring container
@Component
public class BadmintonCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "practice badminton in the court for an hour!";
    }
}
