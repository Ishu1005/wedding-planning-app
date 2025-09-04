package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        val loginBtn = findViewById<Button>(R.id.button10)
        loginBtn.setOnClickListener(){

            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)

        }

        val registerBtn = findViewById<Button>(R.id.button9)
        registerBtn.setOnClickListener(){

            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }

    }
}