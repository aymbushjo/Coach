package com.joel.coach;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoachApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("coach", Coach.class);

        System.out.println(coach.getWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }

}
