package com.example.appsosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda_actividad.*

class SegundaActividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_actividad)

        registroBtn.setOnClickListener {

            val intent: Intent = Intent(this, TerceraActividad::class.java)
            startActivity(intent)
            finish()
        }
    }
}
