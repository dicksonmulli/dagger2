package com.example.dagger2.activities.components;

import com.example.dagger2.module.MyApplicationModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {
}
