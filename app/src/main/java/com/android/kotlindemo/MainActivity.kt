package com.android.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
private const val TAG = "wangzh"
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv)
        textView.setOnClickListener(this)
        Log.d(TAG, "MainActivity onCreate: ")
    }

    override fun onClick(v: View?) {
        startActivity(Intent(this, FirstActivity::class.java))
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity onStop: ")
    }

}