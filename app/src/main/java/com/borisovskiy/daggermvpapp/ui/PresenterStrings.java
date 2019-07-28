package com.borisovskiy.daggermvpapp.ui;

import com.borisovskiy.daggermvpapp.ui.ContractStrings.IModel;
import com.borisovskiy.daggermvpapp.ui.ContractStrings.IView;

public class PresenterStrings implements ContractStrings.IPresenter {

    private IView view;
    private IModel model;

    public PresenterStrings(IView view, IModel model) { // тк конструктор принимает интерфейсы, то нужно создавать
        // PresenterStringModule с методом @Providers либо создавать метод в PresenterStringModule с @Binds.
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
