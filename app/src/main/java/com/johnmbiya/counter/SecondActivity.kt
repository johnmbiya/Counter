package com.johnmbiya.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myName = intent.extras?.get("nom").toString()

        textView = findViewById(R.id.greeting)
        textView.text = "Bonjour " + myName
    }
}