package com.bob.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countUp = findViewById<Button>(R.id.count_btn)
        val reset = findViewById<Button>(R.id.reset_btn)
        val numberCount = findViewById<TextView>(R.id.textView)
        var timesClicked = 0

        countUp.setOnClickListener {
            timesClicked += 1
            numberCount.text = timesClicked.toString()

        }
        reset.setOnClickListener {
            timesClicked = 0
            numberCount.text = timesClicked.toString()
            Toast.makeText(this, "Count has been Reset", Toast.LENGTH_SHORT).show()
        }

        }


}