package com.borisovskiy.daggermvpapp.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class ModelStr implements StringContract.IModel {

    private List<String> listOfStrings = Arrays.asList(
            "Peter Piper picked a peck of pickled peppers\n" +
                    "A peck of pickled peppers Peter Piper picked\n" +
                    "If Peter Piper picked a peck of pickled peppers\n" +
                    "Where’s the peck of pickled peppers Peter Piper picked?",
            "She sells seashells by the seashore",
            "Create interfaces",
            "How can a clam cram in a clean cream can?",
            "I scream, you scream, we all scream for ice cream",
            "I saw Susie sitting in a shoeshine shop"
    );

    private List<Integer> listOfIntegers = new ArrayList<>();


    @Inject
    public ModelStr() {
    }

    @Override
    public List<String> getListOfStrings() {
        return listOfStrings;
    }

    public List<Integer> getListOfIntegers() {
        for (int i = 0; i < listOfIntegers.size(); i++) {
            listOfIntegers.add(i * 100);
        }
        return listOfIntegers;
    }
}
