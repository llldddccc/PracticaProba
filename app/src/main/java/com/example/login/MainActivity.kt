package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.login.models.User

class MainActivity : AppCompatActivity() {
   private val TAG = "Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage (view: View){
        val nom = findViewById<EditText>(R.id.signup_nom).text.toString()
        val contrasenya = findViewById<EditText>(R.id.signup_contrasenya).text.toString()
        val cognoms = findViewById<EditText>(R.id.signup_cognoms).text.toString()
        //el correu i aquestes dades potser demanarles a la pantalla principal??
        val correu = findViewById<EditText>(R.id.signup_correu).text.toString()
        val telefon = findViewById<EditText>(R.id.signup_telefon).text.toString()
        val dni = findViewById<EditText>(R.id.signup_dni).text.toString()
        var user: User? = User.getInstance(nom, contrasenya, cognoms, correu, telefon, dni);
        user.let { println("Username created: ${user?.nom} ${user?.correu} ${user?.telefon} ") }
        //fer un if, no podra passar de pantalla fins que no tingui tots els camps omplerts i correctes.

        val intent = Intent(this, MainActivityLogin::class.java).apply {
        }
        intent.putExtra("nom",nom)
        intent.putExtra("contrasenya",contrasenya)
        startActivity(intent)

    }

}