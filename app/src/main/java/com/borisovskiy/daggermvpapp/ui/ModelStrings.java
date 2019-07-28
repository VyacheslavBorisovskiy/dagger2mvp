package com.borisovskiy.daggermvpapp.ui;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class ModelStrings implements ContractStrings.IModel {

    private List<String> items = Arrays.asList(
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

    @Inject
    public ModelStrings() {
    }

    @Override
    public List<String> getItems() {
        return items;
    }
}
