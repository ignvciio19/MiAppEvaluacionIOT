package com.example.miappevaluacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRecuperar = findViewById<Button>(R.id.btnRecuperar)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnLogin.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Inicio de Sesión")
            // Mensaje modificado (Paso 19)
            builder.setMessage("¡Has iniciado sesión exitosamente!")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
        }

        btnRecuperar.setOnClickListener {
            val intent = Intent(this, RecuperarClaveActivity::class.java)
            startActivity(intent)
        }

        btnRegistrar.setOnClickListener {
            val intent = Intent(this, RegistrarCuentaActivity::class.java)
            startActivity(intent)
        }
    }
}