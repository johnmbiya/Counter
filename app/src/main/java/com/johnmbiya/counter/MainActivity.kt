package com.johnmbiya.counter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonAction: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAction = findViewById(R.id.btnAction)

        buttonAction.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("nom", "John")
            startActivity(intent)

        }
    }
}