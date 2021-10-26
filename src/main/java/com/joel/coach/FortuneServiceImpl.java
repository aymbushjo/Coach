package com.joel.coach;

import org.springframework.stereotype.Service;

@Service
public class FortuneServiceImpl implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
