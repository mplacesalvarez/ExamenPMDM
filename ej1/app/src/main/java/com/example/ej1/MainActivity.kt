package com.example.ej1

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ACTIVITY_LIFECYCLE", "onCreate Called")
        onStart()
        onPause()
        onResume()
    }

    override fun onStart() {
        super.onStart()
        Log.d("ACTIVITY_LIFECYCLE", "onStart Called")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Log.d("ACTIVITY_LIFECYCLE", "onResume Called")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("ACTIVITY_LIFECYCLE", "onPause Called")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

}