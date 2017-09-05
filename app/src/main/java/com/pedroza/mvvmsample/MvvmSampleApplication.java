package com.pedroza.mvvmsample;

import android.app.Application;

import com.pedroza.mvvmsample.di.AppComponent;
import com.pedroza.mvvmsample.di.AppModule;
import com.pedroza.mvvmsample.di.DaggerAppComponent;
import com.pedroza.mylibrary.di.ActivationModule;
import com.pedroza.mylibrary.ui.MyLibraryActivity;


public class MvvmSampleApplication extends Application implements ActivationModule{

    private AppComponent mAppComponent;

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    protected AppComponent initDagger(MvvmSampleApplication application) {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(application))
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = initDagger(this);
    }

    public void inject(MyLibraryActivity myLibraryActivity) {
        mAppComponent.inject(myLibraryActivity);
    }
}
