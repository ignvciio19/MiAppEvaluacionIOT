package com.example.miappevaluacion

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RecuperarClaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_clave)

        val btnEnviar = findViewById<Button>(R.id.btnEnviarRecuperacion)

        btnEnviar.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Recuperar Clave")
            // Mensaje modificado (Paso 19)
            builder.setMessage("Se ha enviado un correo de recuperación a tu email.")
            builder.setPositiveButton("Aceptar") { dialog, which ->
                finish()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}