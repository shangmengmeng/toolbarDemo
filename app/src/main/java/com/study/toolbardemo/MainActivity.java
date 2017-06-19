package com.study.toolbardemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mNormalToolbar;
    private Button mCustomToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNormalToolbar = (Button) findViewById(R.id.btn_normal_toolbar);
        mNormalToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NormalToolbarActivity.class));
            }
        });
        mCustomToolbar = (Button) findViewById(R.id.btn_custom_toolbar);
        mCustomToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CustomToolbarActivity.class));
            }
        });
    }
}
