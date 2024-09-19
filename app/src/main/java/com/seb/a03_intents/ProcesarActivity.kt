package com.seb.a03_intents

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.EditText

class ProcesarActivity : AppCompatActivity() {

    private lateinit var lblCedula: EditText
    private lateinit var lblNombre: EditText
    private lateinit var lblSexo: EditText
    private lateinit var lblNacido: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_procesar)

        val id = Integer.parseInt(intent.extras!!.get("id")!!.toString())
        val nombre = intent.extras!!.get("nombre")!!.toString()
        val sexo = intent.extras!!.getChar("sexo")
        val nacido = intent.extras!!.get("nacido")!!.toString()

        lblCedula = findViewById(R.id.lblCedula)
        lblNombre = findViewById(R.id.lblNombre)
        lblSexo = findViewById(R.id.lblSexo)
        lblNacido = findViewById(R.id.lblNacido)

        lblCedula.setEnabled(false)
        lblNombre.setEnabled(false)
        lblSexo.setEnabled(false)
        lblNacido.setEnabled(false)

        lblCedula.setText(id.toString())
        lblNombre.setText(nombre)
        lblSexo.setText(if (sexo.toString() == "F") "Femenino" else "Masculino")
        lblNacido.setText(nacido)
        }
    }
