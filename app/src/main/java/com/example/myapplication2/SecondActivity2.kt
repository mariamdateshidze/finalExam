package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.util.Patterns
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        init()
    }
    private fun init(){
        auth = Firebase.auth
        signUpButton2.setOnClickListener {
            sighUp()

        }

    }
    private fun sighUp(){
        val email:String = emailEditText.text.toString()
        val password:String = passwordEditText.text.toString()
        val repeatPassword:String = repeatEditText.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty() &&repeatPassword.isNotEmpty()){
            if(password==repeatPassword) {
                if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {


                    progressBar.visibility = View.VISIBLE
                    signUpButton2.isClickable = false

                    auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this) { task ->
                            progressBar.visibility = View.GONE
                            signUpButton2.isClickable = true
                            if (task.isSuccessful) {
                                // Sign in success, update UI with the signed-in user's information
                                d("signUp", "createUserWithEmail:success")
                                val user = auth.currentUser
                                open()

                            } else {
                                // If sign in fails, display a message to the user.
                                d("sighUp", "createUserWithEmail:failure", task.exception)
                                Toast.makeText(
                                    baseContext, "Authentication failed.",
                                    Toast.LENGTH_SHORT
                                ).show()

                            }

                            // ...
                        }

                }else{
                    Toast.makeText(this, "Email format is not right",  Toast.LENGTH_SHORT).show()

                }
            }else{
                Toast.makeText(this, "Please fill correctly",  Toast.LENGTH_SHORT).show()
            }

        }else{
            Toast.makeText(this, "Please fill all fields",  Toast.LENGTH_SHORT).show()
        }

    }
    private fun open(){
        val intent = Intent(this, appActivity::class.java)
        startActivity(intent)
    }
}