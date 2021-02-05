package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kerdzo.*
import kotlinx.android.synthetic.main.activity_main.*

class kerdzoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kerdzo)
        init()
    }
    private fun init(){
        kitxvebi2.setOnClickListener {
            val intent = Intent(this, questionsActivity::class.java)
            startActivity(intent)

        }


    }
}