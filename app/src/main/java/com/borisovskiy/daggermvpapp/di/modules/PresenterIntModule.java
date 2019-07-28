package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.FragmentScope;
import com.borisovskiy.daggermvpapp.ui.ContractIntegers.IPresenter;
import com.borisovskiy.daggermvpapp.ui.ModelIntegers;
import com.borisovskiy.daggermvpapp.ui.PresenterIntegers;
import com.borisovskiy.daggermvpapp.ui.base.FragmentIntegers;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class PresenterIntModule {

    @FragmentScope
    @Provides
    public static IPresenter getPresenter(FragmentIntegers fragment, ModelIntegers model) {
        return new PresenterIntegers(fragment, model);
    }
}
