package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.adapters.PagerAdapter;
import com.borisovskiy.daggermvpapp.ui.base.SecondActivity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class SecondActivityModule {

//    @Binds
//    abstract SecondActivity providesSecondActivity(SecondActivity secondActivity);

    @Provides
    static PagerAdapter providesPagerAdapter(SecondActivity secondActivity) {
        return new PagerAdapter(secondActivity.getSupportFragmentManager());
    }
}
