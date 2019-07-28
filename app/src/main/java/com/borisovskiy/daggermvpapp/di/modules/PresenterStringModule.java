package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.FragmentScope;
import com.borisovskiy.daggermvpapp.ui.ContractStrings.IPresenter;
import com.borisovskiy.daggermvpapp.ui.ModelStrings;
import com.borisovskiy.daggermvpapp.ui.PresenterStrings;
import com.borisovskiy.daggermvpapp.ui.base.FragmentStrings;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class PresenterStringModule {

    @FragmentScope
    @Provides
    public static IPresenter getPresenter(FragmentStrings fragment, ModelStrings model) {
        return new PresenterStrings(fragment, model);
    }
}
