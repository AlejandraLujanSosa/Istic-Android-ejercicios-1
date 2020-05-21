package com.example.appsosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quinta_actividad.*

class QuintaActividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quinta_actividad)

        continuarBtn.setOnClickListener {

            val intent: Intent = Intent(this, CuartaActividad::class.java)
            startActivity(intent)
            finish()
        }
    }
}
