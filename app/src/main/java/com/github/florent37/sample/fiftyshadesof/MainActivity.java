package com.github.florent37.sample.fiftyshadesof;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.github.florent37.fiftyshadesof.FiftyShadesOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(android.R.id.content).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                load();
            }
        });

        Log.i("huang","测试提交githob");
    }

    void load(){
        final FiftyShadesOf fiftyShadesOf = FiftyShadesOf.with(this)
            .on(R.id.layout, R.id.layout1, R.id.layout2)
            .start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                fiftyShadesOf.stop();
            }
        }, 2000);
    }
}
