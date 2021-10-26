package com.joel.coach;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CricketCoachMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach CricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(CricketCoach.getWorkout());
        System.out.println(CricketCoach.getDailyFortune());
        System.out.println(CricketCoach.getEmailAddress());
        System.out.println(CricketCoach.getTeam());

        context.close();
    }

}