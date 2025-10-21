package com.example.miappevaluacion

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RegistrarCuentaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_cuenta)

        val btnCrearCuenta = findViewById<Button>(R.id.btnCrearCuenta)

        btnCrearCuenta.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Registro de Cuenta")
            // Mensaje modificado (Paso 19)
            builder.setMessage("¡Tu cuenta ha sido registrada exitosamente!")
            builder.setPositiveButton("Aceptar") { dialog, which ->
                finish()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}