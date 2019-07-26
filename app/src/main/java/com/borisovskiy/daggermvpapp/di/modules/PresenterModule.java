package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.FragmentScope;
import com.borisovskiy.daggermvpapp.ui.Contract;
import com.borisovskiy.daggermvpapp.ui.Model;
import com.borisovskiy.daggermvpapp.ui.Presenter;
import com.borisovskiy.daggermvpapp.ui.base.FragmentInSecondActivity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class PresenterModule {

    @FragmentScope
    @Provides
    public static Contract.IPresenter getPresenter(FragmentInSecondActivity fragment, Model model) {
        return new Presenter(fragment, model);
    }
}
