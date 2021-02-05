package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        logInButton.setOnClickListener {
            val intent = Intent(this, logInActivity::class.java)
            startActivity(intent)

        }
        signUpButton.setOnClickListener {
            val intent = Intent(this, SecondActivity2::class.java)
            startActivity(intent)

        }

    }


}