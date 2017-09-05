package com.pedroza.mvvmsample.repository;

import android.util.Log;

import com.pedroza.mylibrary.repository.MyLibraryRepository;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class AppRepository implements MyLibraryRepository {

    @Inject
    public AppRepository() {
        Log.i("APP", "DataRepository called");
    }

    public void init() {
        Log.i("APP", "DataRepo initialized " + this.hashCode());
    }

    @Override
    public void initLibRepo() {
        Log.i("MYLIB", "MyLibRepo initialized " + this.hashCode());
    }
}
