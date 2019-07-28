package com.borisovskiy.daggermvpapp.ui;

import java.util.List;

public interface ContractIntegers {

    interface IView{
        void setData(List<Integer> items);
    }

    interface IModel{
        List<Integer> getItems();
    }

    interface IPresenter {
        void onAttachUI();

        void onDetachUI();
    }
}
