package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val checkRadioVal:Int;

        val btnFirst: Button = findViewById(R.id.loginAdmin)
        //val btnSecond: Button = findViewById(R.id.loginClient)
        val switch:Switch = findViewById(R.id.adminClient)





            btnFirst.setOnClickListener{
                val switchState:Boolean = switch.isChecked();
                val intent:Intent;
                if(switchState) {
                     intent = Intent (this,activityClient::class.java)
                }else {
                     intent = Intent (this,activityAdm::class.java)

                }
                startActivity(intent)
            }
                //switchState = switch.isChecked();


        }

}