package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.FragmentScope;
import com.borisovskiy.daggermvpapp.ui.ModelStr;
import com.borisovskiy.daggermvpapp.ui.StringContract;
import com.borisovskiy.daggermvpapp.ui.PresenterString;
import com.borisovskiy.daggermvpapp.ui.main.FragmentStringContent;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class PresenterModule {

    @FragmentScope
    @Provides
    public static StringContract.IPresenter getPresenter(FragmentStringContent fragment, ModelStr modelStr) {
        return new PresenterString(fragment, modelStr);
    }
}
