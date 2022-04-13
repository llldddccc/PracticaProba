package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.login.models.Patinet

class MainActivityPantallaInici : AppCompatActivity() {
    private var textName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pantalla_inici)
        val data = ("01/01/2019");
        var patinet1: Patinet? = Patinet.getInstance("1",14,8,"98.2","12.3",data,"actiu")
        //val id = patinet1?.identificador
        findViewById<TextView>(R.id.pantallainici_identificador).setText(patinet1?.identificador)
        findViewById<TextView>(R.id.pantallainici_kmfets).setText(patinet1?.km)
        findViewById<TextView>(R.id.pantallainici_bateria).setText(patinet1?.bateria)
        findViewById<TextView>(R.id.pantallainici_estat).setText(patinet1?.estat)

        //findViewById<TextView>(R.id.pantallainici_km).setText(patinet1?.km)



    }
    //funcio perque salti a un altre activitat, en aquesta activitat li passem per parametre tote les variables del patinet, i a partir d'aquesta activity construim la pantalla de lloguer del patinet
}   //funcio que possi de manera dinamica els usuaris, per fer-ho hem de fer una llista, o sapiguer quans n'hem possat. 






