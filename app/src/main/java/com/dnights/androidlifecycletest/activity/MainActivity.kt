package com.dnights.androidlifecycletest.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.util.Log
import android.widget.TextView
import com.dnights.androidlifecycletest.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("test", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.i("test", "onResume")
    }

    override fun onPause() {
        Log.i("test", "onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.i("test", "onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
        Log.i("test", "onStart")
    }

    override fun onStop() {
        Log.i("test", "onStop")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("test", "onRestart")
    }
}
