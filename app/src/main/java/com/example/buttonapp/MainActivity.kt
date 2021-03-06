package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var counter_txt : TextView
    private lateinit var button_inc: Button
    private lateinit var button_dec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myLayout = findViewById<ConstraintLayout>(R.id.clMain)
        counter_txt = findViewById(R.id.counter_txt)
      button_inc = findViewById(R.id.button_inc)
        button_dec = findViewById(R.id.button_dec)
        var counterValue = 0
        button_inc.setOnClickListener {
            counterValue += 1
            counter_txt.text = counterValue.toString()
            Snackbar.make(myLayout, "Increased by one", Snackbar.LENGTH_LONG).show()
        }
        button_dec.setOnClickListener {
            counterValue -= 1
            counter_txt.text = counterValue.toString()
            Snackbar.make(myLayout, "Decreased by one", Snackbar.LENGTH_LONG).show()

        }
    }
}