package com.borisovskiy.daggermvpapp.ui;

import com.borisovskiy.daggermvpapp.ui.ContractIntegers.IModel;
import com.borisovskiy.daggermvpapp.ui.ContractIntegers.IView;

public class PresenterIntegers implements ContractIntegers.IPresenter {

    private IView view;
    private IModel model;

    public PresenterIntegers(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void onAttachUI() {
        view.setData(model.getItems());
    }

    @Override
    public void onDetachUI() {
        view = null;
    }
}
