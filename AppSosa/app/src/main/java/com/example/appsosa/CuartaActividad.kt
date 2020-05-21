package com.example.appsosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cuarta_actividad.*

class CuartaActividad : AppCompatActivity() {
    var numSecreto: Int = 83
    var contador : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cuarta_actividad)

        jugarBtn.setOnClickListener {
        this.contador++


            if (numeroIngresado.text.toString() <= 0.toString()) {
                Toast.makeText(this, "el numero debe ser mayor a cero ", Toast.LENGTH_LONG)
                    .show()
                } else {
                    if (numeroIngresado.text.toString() == numSecreto.toString()) {
                        Toast.makeText(this, " ADIVINASTE EL NUMERO ", Toast.LENGTH_LONG)
                            .show()

                    } else {
                        if (numeroIngresado.text.toString() > numSecreto.toString()) {
                            Toast.makeText(this, "el numero secreto es menor ", Toast.LENGTH_LONG)
                                .show()
                        } else
                            if (numeroIngresado.text.toString() < numSecreto.toString()) {
                                Toast.makeText(
                                    this, "el numero secreto es mayor ", Toast.LENGTH_LONG
                                ).show()



                                Toast.makeText( this, "tus intentos fueron + $contador", Toast.LENGTH_LONG
                                ).show()

                            }
                        salirBtn.setOnClickListener {
                            val intent: Intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            finish()

                        }

                    }
                }
            }
        }
    }









