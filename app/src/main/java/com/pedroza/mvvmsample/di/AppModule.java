package com.pedroza.mvvmsample.di;

import android.app.Application;

import com.pedroza.commonlib.repository.CommonLibRepository;
import com.pedroza.mvvmsample.repository.AppRepository;
import com.pedroza.mylibrary.repository.MyLibraryRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    private Application mApplication;
    private static AppRepository mAppRepository;
    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    static AppRepository privideAppRepository() {
        mAppRepository = new AppRepository();
        return mAppRepository;
    }

    @Provides
    @Singleton
    static MyLibraryRepository provideMyLibRepository() {
        return mAppRepository;
    }

    @Provides
    @Singleton
    static CommonLibRepository provideCommonLibRepository() {
        return new CommonLibRepository();
    }
}

