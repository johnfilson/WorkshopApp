package com.project.johns.funfacts;

import java.util.Random;

/**
 * Created by John's on 05/10/2014.
 */
public class FactBook {

    public String[] mFacts = {
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
    public String getFact(){



        // changing the fact for when the button is clicked

        String fact = "";

        // Randomly update app

        Random randomGenetor = new Random();//constructors new Random generator object
        int randomNumber = randomGenetor.nextInt(mFacts.length);
        fact += randomNumber;
        //this applies the random number expression to the  Facts Array
        fact= mFacts[randomNumber];

        return fact;

    }
}
