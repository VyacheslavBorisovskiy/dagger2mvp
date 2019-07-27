package com.borisovskiy.daggermvpapp.ui;

import com.borisovskiy.daggermvpapp.ui.StringContract.IModel;
import com.borisovskiy.daggermvpapp.ui.StringContract.IView;
import com.borisovskiy.daggermvpapp.ui.base.BasePresenter;

public class PresenterString extends BasePresenter<StringContract.IView, StringContract.IModel>
        implements StringContract.IPresenter {

//    private IView view;
//    private IModel model;

//    public PresenterString(IView view, IModel model) {
//        super(view, model);
////        this.view = view1;
////        this.model = model1;
//    }


    public PresenterString(IView view, IModel model) {
        super(view, model);
    }

    @Override
    public void onAttachUI() {
        view.setData(model.getListOfStrings());
    }

    @Override
    public void onDetachUI() {
        view = null;
    }
}
