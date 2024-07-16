package com.tienoue.teleco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TVs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvs)


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar) //definir toolbar comme barre d'action ou d'outils
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Définir les données pour la liste
        val listeItems = listOf(
            Pair(R.drawable.tv, "LG") to "com.tienoue.teleco.LG",
            Pair(R.drawable.tv, "SAMSUNG") to "com.tienoue.teleco.SAMSUNG",
            Pair(R.drawable.tv, "SONY") to "com.tienoue.teleco.SONY"
        )

        // Trouver la vue de la liste dans le layout
                val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // Configurer l'adaptateur de la liste
                val adapter = ListeAdapter_tv(listeItems) { activityClassName ->
                    // Lorsqu'un élément est cliqué, ouvrir l'activité correspondante
                    val intent = Intent(this, Class.forName(activityClassName))
                    startActivity(intent)
                }
                recyclerView.adapter = adapter

        // Définir le gestionnaire de mise en page pour le RecyclerView
                recyclerView.layoutManager = LinearLayoutManager(this)

    }
}