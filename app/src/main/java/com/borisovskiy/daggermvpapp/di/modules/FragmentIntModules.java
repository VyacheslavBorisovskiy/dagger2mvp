package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.ActivityScope;
import com.borisovskiy.daggermvpapp.ui.base.FragmentIntegers;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentIntModules {

    @ActivityScope // Пометили сущность, созданную дагером.
    @Provides
    public FragmentIntegers getFragment() {
        return new FragmentIntegers();
    }
}
