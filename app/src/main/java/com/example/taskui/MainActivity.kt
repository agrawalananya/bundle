package com.example.taskui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name: EditText = findViewById(R.id.textView)
        var email: EditText = findViewById(R.id.textView2)
        var phone: EditText = findViewById(R.id.textView3)
        var job: EditText = findViewById(R.id.textView4)
        var reset: Button = findViewById(R.id.button2)
        var submit: Button = findViewById(R.id.button3)

        val bundle=Bundle()
        submit.setOnClickListener(View.OnClickListener { v ->

            if (TextUtils.isEmpty(name?.text.toString()) || TextUtils.isEmpty(email?.text.toString()) || TextUtils.isEmpty(
                    phone?.text.toString()
                ) || TextUtils.isEmpty(job?.text.toString())
            ) {
                Toast.makeText(this, "please enter all the details", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "please entered," ,Toast.LENGTH_LONG).show()
                val activity2intent=Intent(applicationContext,Act2::class.java)
                bundle.putString("name",name.text.toString())
                activity2intent.putExtras(bundle)
                startActivity(activity2intent)
            }

        })

        reset.setOnClickListener{
            name.setText("")
            email.setText("")
            phone.setText("")
            job.setText("")

        }


    }
}