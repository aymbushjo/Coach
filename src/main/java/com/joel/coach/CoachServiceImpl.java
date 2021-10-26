package com.joel.coach;

import org.springframework.stereotype.Service;

@Service
public class CoachServiceImpl implements CoachService {
    @Override
    public String getTeamDetails() {
        String baseDetails = "Chicago";
        String nameDetails - "Bulls";
        return baseDetails + nameDetails;
    }
}