package com.st10447525.historymate

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // declare variables
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize
        searchButton= findViewById(R.id.searchButton)
        clearButton= findViewById(R.id.clear_text_button)
        ageInput= findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)


        searchButton.setOnClickListener{
            // create a variable of age to get value from user
            var age = ageInput.text.toString().toIntOrNull()

            // if age is not full and age is in range between 20 and 100
            if (age != null && age in 20..100){
                // when age is 30 display ToBeAdded else when is .. and so on
                val ageInput = when (age){
                    
                }
            }
        }
    }
}