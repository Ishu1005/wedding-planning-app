package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)



        val nextBtn = findViewById<Button>(R.id.button3)

        nextBtn.setOnClickListener(){

            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)

        }


    }
}