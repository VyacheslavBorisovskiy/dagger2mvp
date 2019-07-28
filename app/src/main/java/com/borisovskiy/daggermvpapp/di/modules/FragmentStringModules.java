package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.ActivityScope;
import com.borisovskiy.daggermvpapp.ui.base.FragmentStrings;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentStringModules {

    @ActivityScope // Пометили сущность, созданную дагером.
    @Provides
    public FragmentStrings getFragment() {
        return new FragmentStrings();
    }
}
