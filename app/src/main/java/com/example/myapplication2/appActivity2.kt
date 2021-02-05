package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_app2.*
import kotlinx.android.synthetic.main.activity_main.*

class appActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app2)
        init()
    }

    private fun init(){
        kitxvebi.setOnClickListener {
            val intent = Intent(this, questionsActivity::class.java)
            startActivity(intent)

        }


    }


}