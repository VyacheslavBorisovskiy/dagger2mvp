package com.borisovskiy.daggermvpapp.di.scopes;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
// Создаем метку
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}
