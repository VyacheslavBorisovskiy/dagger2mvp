package com.borisovskiy.daggermvpapp.di.components;

import android.app.Application;

import com.borisovskiy.daggermvpapp.ui.main.App;
import com.borisovskiy.daggermvpapp.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class})
public interface MyComponent extends AndroidInjector<DaggerApplication> {

    void inject(App app); // инъекция зав-тей в application

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        MyComponent build();
    }

}
