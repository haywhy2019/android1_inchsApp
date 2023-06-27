package com.example.inchestocent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var inchValue = 2.54
    private lateinit var enterInches: EditText
    private lateinit var convertButton: Button
    private  lateinit var textViewCentimeters: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterInches = findViewById(R.id.editTextInches)
        convertButton = findViewById(R.id.buttonConvert)
        textViewCentimeters = findViewById(R.id.textViewConvert)

        convertButton.setOnClickListener{
            if(!enterInches.text.toString().isEmpty()){
var result = enterInches.text.toString().toDouble() * inchValue

                textViewCentimeters.text = result.toString()
            } else {
textViewCentimeters.text = getString(R.string.text)
            }
        }
    }
}