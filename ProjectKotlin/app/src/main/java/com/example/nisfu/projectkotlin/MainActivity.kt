package com.example.nisfu.projectkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginB = findViewById<Button>(R.id.loginButton)

        loginB.setOnClickListener {
            startActivity( Intent(this@MainActivity, Profile::class.java))
        }

    }


}
