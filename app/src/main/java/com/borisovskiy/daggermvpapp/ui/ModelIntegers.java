package com.borisovskiy.daggermvpapp.ui;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class ModelIntegers implements ContractIntegers.IModel {

    private List<Integer> items = Arrays.asList(100, 200, 300);

    @Inject
    public ModelIntegers() {
    }

    @Override
    public List<Integer> getItems() {
        return items;
    }
}
