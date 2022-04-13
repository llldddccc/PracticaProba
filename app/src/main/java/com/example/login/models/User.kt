package com.example.login.models

import android.util.Log
import java.lang.Exception

class User private constructor(val nom:String,val cognoms: String, val contrasenya:String, val correu:String,val telefon:String, val dni:String){

    companion object{  //declaració estatica
        private val ELEM:String = "User";

        @Volatile
        private var INSTANCE:User? = null;

        @Synchronized
        fun getInstance (nom: String,cognoms: String,contrasenya: String,correu: String,telefon: String,dni: String):User?{
           try{
               //fer comprovacions de tot
               INSTANCE = User(nom,cognoms,contrasenya,correu,telefon,dni)
               return INSTANCE;
           }catch (exception: Exception){
               exception.printStackTrace()
               return null
           }finally {
               Log.d(ELEM,"User created")
           }
        }


    }

}