package com.borisovskiy.daggermvpapp.ui;

import com.borisovskiy.daggermvpapp.ui.Contract.IModel;
import com.borisovskiy.daggermvpapp.ui.Contract.IView;

import javax.inject.Inject;

public class Presenter implements Contract.IPresenter {

    private IView view;
    private IModel model;


    public Presenter(IView view, IModel model) { // тк конструктор принимает интерфейсы, то нужно создавать
        // PresenterModule либо создавать метод в PresenterModule с @Binds
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
