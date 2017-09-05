package com.pedroza.mvvmsample.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.pedroza.commonlib.repository.CommonLibRepository;
import com.pedroza.mvvmsample.repository.AppRepository;

import javax.inject.Inject;


public class AppActivityViewModel extends ViewModel {

    private AppRepository mAppRepository;
    private CommonLibRepository mCommonLibRepository;


    @Inject
    public AppActivityViewModel(AppRepository appRepo, CommonLibRepository commonLibRepo) {
        mAppRepository = appRepo;
        mCommonLibRepository = commonLibRepo;
    }

    public void init() {
        Log.i("APP", "AppActivityViewModel has been initialized");
        mAppRepository.init();
        mCommonLibRepository.init();
    }
}
