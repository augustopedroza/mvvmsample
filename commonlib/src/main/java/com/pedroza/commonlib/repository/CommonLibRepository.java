package com.pedroza.commonlib.repository;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class CommonLibRepository {

    @Inject
    public CommonLibRepository() {
        Log.i("CLIB", "CommonLibRepository called");
    }

    public void init() {
        Log.i("CLIB", "CommonLibRepo initialized " + this.hashCode());
    }
}
