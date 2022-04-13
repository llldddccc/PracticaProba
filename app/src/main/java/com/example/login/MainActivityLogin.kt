package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
        /*findViewById<Button>(R.id.login_button)?.setOnClickListener{
            val nom = findViewById<EditText>()
        }
        val nomlogin = findViewById<EditText>(R.id.login_name).toString()
        val contrasenyalogin = findViewById<EditText>(R.id.login_password).toString()
        var userlogin: Userlogin? = Userlogin.getInstance(nomlogin,contrasenyalogin)
        userlogin.let { println("User register: ${userlogin?.nom}") }*/


    }

    fun sendMessage(view: View) {
        val bundle = intent.extras
        val nom = bundle?.getString("nom")
        val contrasenya = bundle?.getString("contrasenya")
        val nomlogin = findViewById<EditText>(R.id.login_name).text.toString()
        val contrasenyalogin = findViewById<EditText>(R.id.login_password).text.toString()
        println(nomlogin)
        println(contrasenyalogin)
        println(contrasenya)
        if ((contrasenyalogin != contrasenya) && (nom != nomlogin)){
            println("No esta registrat a l'aplicació")
        }else{
            val intent1 = Intent(this, MainActivityPantallaInici::class.java).apply {
            }
            intent1.putExtra("nomlogin",nomlogin)
            startActivity(intent1)
        }

        /*val intent1 = Intent(this, MainActivityPantallaInici::class.java).apply {
            //putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent1)*/
    }
}





