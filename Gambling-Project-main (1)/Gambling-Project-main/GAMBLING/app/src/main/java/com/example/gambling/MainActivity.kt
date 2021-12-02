package com.example.gambling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var g1 = (0..7).random()
        var g2 = (0..7).random()
        var g3 = (0..7).random()


    }
}