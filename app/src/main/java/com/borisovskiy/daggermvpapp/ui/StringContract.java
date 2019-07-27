package com.borisovskiy.daggermvpapp.ui;

import com.borisovskiy.daggermvpapp.ui.base.BaseContract;
import com.borisovskiy.daggermvpapp.ui.base.BasePresenter;

import java.util.List;

public interface StringContract {

    public interface IView extends BaseContract.IView {
        void setData(List<String> items);
    }

    public interface IModel extends BaseContract.IModel{
        List<String> getListOfStrings();
    }

    public interface IPresenter extends BaseContract.IPresenter<StringContract.IView, StringContract.IModel> {

    }
}
