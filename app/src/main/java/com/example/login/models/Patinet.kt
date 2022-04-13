package com.example.login.models

import android.util.Log
import java.lang.Exception
import java.util.*

class Patinet private constructor(val identificador: String, val longitud:Int,val latitud:Int,val bateria:String, val km: String, val data_manteniment:String,val estat:String) {

    companion object{
        private val ELEM: String = "Patient";
        @Volatile
        private var INSTANCE2: Patinet? = null;

        @Synchronized
        fun getInstance (
            identificador: String,
            longitud: Int,
            latitud: Int,
            bateria: String,
            km: String,
            data_manteniment: String,
            estat: String): Patinet?{
            try {
                INSTANCE2 = Patinet(identificador, longitud,latitud, bateria, km, data_manteniment, estat)
                return  INSTANCE2
            }catch (exception: Exception){
                exception.printStackTrace()
                return null
            }
        }
    }

}

