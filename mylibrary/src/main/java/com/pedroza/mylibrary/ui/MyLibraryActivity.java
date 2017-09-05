package com.pedroza.mylibrary.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.pedroza.mylibrary.R;
import com.pedroza.mylibrary.di.ActivationModule;
import com.pedroza.mylibrary.viewmodel.MyLibraryActivityViewModel;

import javax.inject.Inject;


public class MyLibraryActivity extends AppCompatActivity {

    @Inject
    public MyLibraryActivityViewModel mViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylibrary);

        ((ActivationModule)getApplication().getApplicationContext()).inject(this);

        mViewModel.init();
    }
}
