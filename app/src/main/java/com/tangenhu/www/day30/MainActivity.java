package com.tangenhu.www.day30;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试git
        int a = 101;
        //第二次测试
        initView();
    }

    private void initView(){
        viewById = (TextView) findViewById(R.id.textView);
    }
}
