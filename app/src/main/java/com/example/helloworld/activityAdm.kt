package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activityAdm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adm)


        val a: Button = findViewById(R.id.backAdm)

        a.setOnClickListener{

            val intent2 = Intent (this,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}