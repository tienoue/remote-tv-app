package com.tienoue.teleco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Accueil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar) //definir toolbar comme barre d'action ou d'outils

        // Définir les données pour la liste
        val listeItems = listOf(
            Pair(R.drawable.ir, "IR Remote") to "com.tienoue.teleco.IrActivity",
            Pair(R.drawable.wifi, "WI-FI") to "com.tienoue.teleco.WifiActivity",
            Pair(R.drawable.bluetooth, "Bluetooth") to "com.tienoue.teleco.BluetoothActivity"
        )

// Trouver la vue de la liste dans le layout
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

// Configurer l'adaptateur de la liste
        val adapter = ListeAdapter(listeItems) { activityClassName ->
            // Lorsqu'un élément est cliqué, ouvrir l'activité correspondante
            val intent = Intent(this, Class.forName(activityClassName))
            startActivity(intent)
        }
        recyclerView.adapter = adapter

// Définir le gestionnaire de mise en page pour le RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}