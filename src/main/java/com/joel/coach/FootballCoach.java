package com.joel.coach;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    @Override
    public String getWorkout() {
        return "Practice batting";
    }

    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune();
    }

    public void setFortuneService(FortuneServiceImpl fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return this.team;
    }
}