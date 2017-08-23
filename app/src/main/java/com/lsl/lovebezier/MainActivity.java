package com.lsl.lovebezier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private LoveLayout mLoveLayout;
    private Button mBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoveLayout = (LoveLayout) findViewById(R.id.love_layout);
        mBt = (Button) findViewById(R.id.bt);
        mBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoveLayout.addIcon();
            }
        });
    }
}
