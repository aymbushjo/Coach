package com.joel.coach;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Practice batting";
    }

    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune();
    }
}
