package com.borisovskiy.daggermvpapp.di.modules;

import com.borisovskiy.daggermvpapp.di.scopes.ActivityScope;
import com.borisovskiy.daggermvpapp.di.scopes.FragmentScope;
import com.borisovskiy.daggermvpapp.ui.base.FragmentIntegers;
import com.borisovskiy.daggermvpapp.ui.base.FragmentStrings;
import com.borisovskiy.daggermvpapp.ui.base.MainActivity;
import com.borisovskiy.daggermvpapp.ui.base.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface AppModule {

    @ActivityScope // Пока жива сущность MainActivity в дагере будут жить все объекты, помеченные меткой ActivityScrope
    @ContributesAndroidInjector(modules = {FragmentStringModules.class})
    MainActivity contributesMainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules =
            {FragmentIntModules.class,
            FragmentStringModules.class})
    SecondActivity contributesSecondActivity();

    @FragmentScope
    @ContributesAndroidInjector(modules = {PresenterStringModule.class})
    FragmentStrings contributesPresenterString();

    @FragmentScope
    @ContributesAndroidInjector(modules = {PresenterIntModule.class})
    FragmentIntegers contributesPresenterInteger();

}
