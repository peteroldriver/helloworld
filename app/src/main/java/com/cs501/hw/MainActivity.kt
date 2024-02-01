package com.cs501.hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
//    private lateinit var buttonB: Button
//    private lateinit var textT: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonB = findViewById<Button>(R.id.buttonB)
        var textT = findViewById<TextView>(R.id.textT)
        buttonB.setOnClickListener {
            textT.text = "Hello World"
        }
    }
}
