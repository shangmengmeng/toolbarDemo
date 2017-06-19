package com.study.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.study.toolbardemo.widget.SimpleToolbar;

public class CustomToolbarActivity extends AppCompatActivity {

    private SimpleToolbar mSimpleToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);
        mSimpleToolbar= (SimpleToolbar) findViewById(R.id.simple_toolbar);
        mSimpleToolbar.setLeftTitleClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomToolbarActivity.this, "点击了左侧Title", Toast.LENGTH_SHORT).show();
            }
        });
        mSimpleToolbar.setRightTitleClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomToolbarActivity.this, "点击了右侧Title", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
