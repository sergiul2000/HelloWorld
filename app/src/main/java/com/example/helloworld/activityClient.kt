package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activityClient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client)


        val b: Button = findViewById(R.id.backClient)

        b.setOnClickListener{

            val intent1 = Intent (this,MainActivity::class.java)
            startActivity(intent1)
        }

    }
}