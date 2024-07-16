package com.tienoue.teleco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class WifiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wifi)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar) //definir toolbar comme barre d'action ou d'outils
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Toast.makeText(applicationContext, "Connectez-vous au Wifi de l'appareil pour utiliser", Toast.LENGTH_SHORT).show()

    }
}