package com.example.taskui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Act2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)

        val bundle=intent.extras
        val name=bundle?.getString("name")
        var nameEditText = findViewById<EditText>(R.id.textView5) as TextView
        nameEditText?.apply {
            text = "Hello "+name
        }

    }
}