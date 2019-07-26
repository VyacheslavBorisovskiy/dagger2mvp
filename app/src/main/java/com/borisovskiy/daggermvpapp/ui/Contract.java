package com.borisovskiy.daggermvpapp.ui;

import java.util.List;

public interface Contract {

    interface IView{
        void setData(List<String> items);
    }

    interface IModel{
        List<String> getItems();
    }

    interface IPresenter {
        void onAttachUI();

        void onDetachUI();
    }
}
