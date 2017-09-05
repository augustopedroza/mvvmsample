package com.pedroza.mvvmsample.di;

import com.pedroza.mvvmsample.ui.AppActivity;
import com.pedroza.mylibrary.ui.MyLibraryActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(AppActivity mainActivity);

    void inject(MyLibraryActivity myLibActivity);
}
