package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main12)

        val getStartedButton = findViewById<Button>(R.id.register)


        getStartedButton.setOnClickListener {

            val intent = Intent(this, MainActivity16::class.java)
            startActivity(intent)

        }

        // Nav bar

        val img1 = findViewById<ImageView>(R.id.imageView14)
        val img2 = findViewById<ImageView>(R.id.imageView15)
        val img3 = findViewById<ImageView>(R.id.imageView16)
        val img4 = findViewById<ImageView>(R.id.imageView17)

        img1.setOnClickListener {

            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)

        }

        img2.setOnClickListener {

            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)

        }

        img3.setOnClickListener {

            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)

        }

        img4.setOnClickListener {

            val intent = Intent(this, MainActivity20::class.java)
            startActivity(intent)

        }

    }
}