package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.ActivityScope;
import com.borisovskiy.daggermvpapp.ui.main.FragmentStringContent;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModules {

    @ActivityScope // Пометили сущность, созданную дагером.
    @Provides
    public FragmentStringContent getFragment() {
        return new FragmentStringContent();
    }
}
