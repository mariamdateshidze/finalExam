package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_app.*
import kotlinx.android.synthetic.main.activity_main.*

class appActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
        init()
    }

    private fun init(){
       sajaro.setOnClickListener {
            val intent = Intent(this, appActivity2::class.java)
            startActivity(intent)

        }
        kerdzo.setOnClickListener {
            val intent = Intent(this, kerdzoActivity::class.java)
            startActivity(intent)

        }
        gacvliti.setOnClickListener {
            val intent = Intent(this, programsActivity::class.java)
            startActivity(intent)

        }
        samagistro.setOnClickListener {
            val intent = Intent(this, samagistroActivity::class.java)
            startActivity(intent)

        }

    }

}