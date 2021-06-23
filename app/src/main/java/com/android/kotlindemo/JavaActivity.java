package com.android.kotlindemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JavaActivity extends AppCompatActivity {

    private static final String TAG = "wangzh";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int id = CommonUtils.Companion.getId();
        CommonUtils.Companion.add(2);
        CommonUtils.add(2);
        setContentView(R.layout.activity_java);

        UtilsKt.dp2px(2);
        UtilsKt.getDisplayMetrics();

        User user = new User();
        user.test1();

        Log.d(TAG, "JavaActivity onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "JavaActivity onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "JavaActivity onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "JavaActivity onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "JavaActivity onStop: ");
    }

    public void onClick(View view) {
        startActivity(new Intent(JavaActivity.this, MainActivity.class));
    }
}
