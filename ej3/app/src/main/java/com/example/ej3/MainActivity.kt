package com.example.ej3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)

        boton.setOnClickListener {
            Toast.makeText(this, "TEXTO", Toast.LENGTH_SHORT).show()

            for (i in 0..100) {
                Log.d("DECRECIENTE", (100 - i).toString())
            }
        }
    }
}

