package com.joel.coach;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FootballCoachMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach FootballCoach = context.getBean("footballCoach", FootballCoach.class);

        System.out.println(FootballCoach.getWorkout());
        System.out.println(FootballCoach.getDailyFortune());
        System.out.println(FootballCoach.getEmailAddress());
        System.out.println(FootballCoach.getTeam());

        context.close();
    }

}