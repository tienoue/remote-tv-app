package com.tienoue.teleco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class IrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ir)

        val toolbar: Toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)    //def  la toolbar comme tool d'action ou d'outils
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var tv=findViewById<ImageView>(R.id.tv)
        var clim=findViewById<ImageView>(R.id.clim)
        var projecteur=findViewById<ImageView>(R.id.projecteur)
        var dvd=findViewById<ImageView>(R.id.dvd)
        var baffle=findViewById<ImageView>(R.id.baffle)
        var radio=findViewById<ImageView>(R.id.radio)

        tv.setOnClickListener(){
            val intent = Intent(this, TVs::class.java)
            startActivity(intent)
        }
        clim.setOnClickListener(){
            val intent = Intent(this, Clim::class.java)
            startActivity(intent)
        }
        projecteur.setOnClickListener(){
            val intent = Intent(this, Projecteur::class.java)
            startActivity(intent)
        }
        dvd.setOnClickListener(){
            val intent = Intent(this, Dvd::class.java)
            startActivity(intent)
        }
        baffle.setOnClickListener(){
            val intent = Intent(this, Baffle::class.java)
            startActivity(intent)
        }
        radio.setOnClickListener(){
            val intent = Intent(this, Radio::class.java)
            startActivity(intent)
        }

    }
}