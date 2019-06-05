package com.example.dagger2.components;

import com.example.dagger2.MyApplication;
import com.example.dagger2.module.MyApplicationModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {
}
