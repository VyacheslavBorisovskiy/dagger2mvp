package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.ActivityScope;
import com.borisovskiy.daggermvpapp.ui.base.FragmentInSecondActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModules {

    @ActivityScope // Пометили сущность, созданную дагером.
    @Provides
    public FragmentInSecondActivity getFragment() {
        return new FragmentInSecondActivity();
    }
}
