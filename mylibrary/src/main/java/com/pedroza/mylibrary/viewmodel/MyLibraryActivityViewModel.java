package com.pedroza.mylibrary.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.pedroza.commonlib.repository.CommonLibRepository;
import com.pedroza.mylibrary.repository.MyLibraryRepository;

import javax.inject.Inject;


public class MyLibraryActivityViewModel extends ViewModel {

    private MyLibraryRepository mMyLibRepository;
    private CommonLibRepository mCommonLibRepository;

    @Inject
    public MyLibraryActivityViewModel(MyLibraryRepository libRepo, CommonLibRepository commonLibRepo) {
        mMyLibRepository = libRepo;
        mCommonLibRepository = commonLibRepo;
    }

    public void init() {
        Log.i("MYLIB", "MyLibraryActivityViewModel has been initialized");
        mMyLibRepository.initLibRepo();
        mCommonLibRepository.init();
    }
}
