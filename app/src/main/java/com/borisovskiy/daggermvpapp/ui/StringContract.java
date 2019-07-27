package com.borisovskiy.daggermvpapp.ui;

import com.borisovskiy.daggermvpapp.ui.base.BaseMvpFragmentContract;

import java.util.List;

public interface StringContract {

    interface IView extends BaseMvpFragmentContract.IView {
        void setData(List<String> items);
    }

    interface IModel extends BaseMvpFragmentContract.IModel{
        List<String> getListOfStrings();
    }

    interface IPresenter extends BaseMvpFragmentContract.IPresenter<StringContract.IView> {

    }
}
