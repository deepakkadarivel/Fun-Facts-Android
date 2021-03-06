package com.example.deepak.funfacts;

import java.util.Random;

public class FactBook {

    // Member Variables - Properties of FactBook
    private final String[] mFacts = new String[]{
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };

    // Actions - The actions the properties can take
    public String getFact() {
        // Randomly generate Facts
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        String fact = "";
        fact = mFacts[randomNumber];

        return fact;
    }
}
