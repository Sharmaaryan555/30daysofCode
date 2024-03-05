package com.example.day02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLight = findViewById<Button>(R.id.btnLight)
        val buttonDark = findViewById<Button>(R.id.btnDark)
        val LinearLayout = findViewById<LinearLayout>(R.id.linearlayout)

        buttonLight.setOnClickListener{
                LinearLayout.setBackgroundResource(R.color.white)
        }

        buttonDark.setOnClickListener{
            LinearLayout.setBackgroundResource(R.color.black)
        }
    }
}