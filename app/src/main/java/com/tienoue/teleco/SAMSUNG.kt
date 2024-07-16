package com.tienoue.teleco

import android.content.Context
import android.hardware.ConsumerIrManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class SAMSUNG : AppCompatActivity() {
    private lateinit var consumerIrManager: ConsumerIrManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samsung)


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar) //definir toolbar comme barre d'action ou d'outils
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        consumerIrManager = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager

        val buttonPower = findViewById<ImageButton>(R.id.power)
        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b3 = findViewById<Button>(R.id.b3)
        val b4 = findViewById<Button>(R.id.b4)
        val b5 = findViewById<Button>(R.id.b5)
        val b6 = findViewById<Button>(R.id.b6)
        val b7 = findViewById<Button>(R.id.b7)
        val b8 = findViewById<Button>(R.id.b8)
        val b9 = findViewById<Button>(R.id.b9)
        val b0 = findViewById<Button>(R.id.b0)
        val deuxTraits = findViewById<Button>(R.id.deuxTraits)
        //val display = findViewById<Button>(R.id.display)
        val muet = findViewById<ImageButton>(R.id.muet)
        val recall = findViewById<Button>(R.id.recall)
        val mode = findViewById<Button>(R.id.mode)
        val chPlus = findViewById<Button>(R.id.chPlus)
        val chMoins = findViewById<Button>(R.id.chMoins)
        val volPlus = findViewById<Button>(R.id.volPlus)
        val volMoins = findViewById<Button>(R.id.volMoins)
        //val menu = findViewById<Button>(R.id.menu)




        buttonPower.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,564,564,564,564,564,564,1692,564,1692,564,564,564,1692,564,564,564,1692,564,1692,564,1692,564,46524))

        }
        b1.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b2.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b3.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b4.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b5.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b6.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b7.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b8.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b9.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,564,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        b0.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        deuxTraits.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,564,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        /*display.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,1692,564,1692,564,1692,564,46524))

        }*/
        muet.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        recall.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,1692,564,1692,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        mode.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,46524))

        }
        chPlus.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,1692,564,564,564,564,564,564,564,1692,564,564,564,1692,564,1692,564,564,564,1692,564,1692,564,1692,564,46524))

        }
        chMoins.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,564,564,1692,564,1692,564,1692,564,46524))

        }
        volPlus.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,564,564,1692,564,1692,564,1692,564,46524))

        }
        volMoins.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,564,564,1692,564,1692,564,1692,564,46524))

        }
        /*menu.setOnClickListener {
            envoyeSignalIR("appuyé", intArrayOf(9024,4512,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,1692,564,46524))

        }*/

    }

    private fun envoyeSignalIR(text: String, pattern: IntArray) {


        if (consumerIrManager.hasIrEmitter()) {
            try {
                consumerIrManager.transmit(38400, pattern)
                // la transmission du signal a réussi
                //Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                // la transmission du signal a échoué
                Toast.makeText(applicationContext, "Une erreur est survenue lors de la communication avec l'autre appareil : "+e, Toast.LENGTH_SHORT).show()
            }
        } else {
            // Gérer le cas où l'appareil ne prend pas en charge l'émission infrarouge
            Toast.makeText(applicationContext, "Votre appareil ne prend pas en charge l'émission infrarouge", Toast.LENGTH_SHORT).show()

        }
    }
}