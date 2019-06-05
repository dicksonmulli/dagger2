package com.example.dagger2.module;

import com.example.dagger2.activities.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
