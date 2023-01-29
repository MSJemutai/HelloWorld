package com.example.helloworld

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.greeetingsButton)
        button.setOnClickListener {
            Log.v(TAG, "Button clicked" )
            //Toast.makeText(this, "Hello fellow human!", Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Hello fellow human!", Toast.LENGTH_SHORT).show()
        }




    }


}