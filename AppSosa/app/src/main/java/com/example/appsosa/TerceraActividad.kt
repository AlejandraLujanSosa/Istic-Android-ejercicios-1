package com.example.appsosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tercera_actividad.*

class TerceraActividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera_actividad)

        jugarBtn.setOnClickListener {

            val intent: Intent = Intent(this, QuintaActividad::class.java)
            startActivity(intent)
            finish()
        }
    }
}
