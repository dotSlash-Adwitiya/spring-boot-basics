package com.adwitiya.springcorequalifier.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//* MARKING the class as @Component allows it to be scanned and injected by the spring container
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do bowling practice for 30 mins today!";
    }
}
