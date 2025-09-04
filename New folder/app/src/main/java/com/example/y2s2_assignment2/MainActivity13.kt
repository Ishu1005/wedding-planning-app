package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main13)

        val image1 = findViewById<ImageView>(R.id.imageView1)

        image1.setOnClickListener(){

            val intent = Intent(this,MainActivity9::class.java)
            startActivity(intent)

        }

        val btn1 = findViewById<Button>(R.id.register)

        btn1.setOnClickListener(){

            val intent = Intent(this,MainActivity14::class.java)
            startActivity(intent)

        }

    }
}