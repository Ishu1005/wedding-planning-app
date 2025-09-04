package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        //Start animation


        val nextBtn = findViewById<Button>(R.id.button5)
        nextBtn.setOnClickListener(){
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
    }
}