package com.pedroza.mvvmsample.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.pedroza.mvvmsample.MvvmSampleApplication;
import com.pedroza.mvvmsample.R;
import com.pedroza.mvvmsample.viewmodel.AppActivityViewModel;
import com.pedroza.mylibrary.ui.MyLibraryActivity;

import javax.inject.Inject;


public class AppActivity extends AppCompatActivity {

    @Inject
    public AppActivityViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ((MvvmSampleApplication)getApplication().getApplicationContext()).getAppComponent().inject(this);

        Button navigateButton = (Button) findViewById(R.id.navigate_button);

        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyLibraryActivity.class);
                startActivity(intent);
            }
        });
        mViewModel.init();
    }
}
