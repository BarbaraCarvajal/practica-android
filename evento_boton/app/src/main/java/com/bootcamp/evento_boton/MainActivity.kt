package com.bootcamp.evento_boton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById<Button>(R.id.boton_main)
        var campoTexto = findViewById<EditText>(R.id.editText)

        var campoTextoCopia = campoTexto.text.toString()


        boton.setOnClickListener{
            Log.i("EventoBoton","Le has dado click, el nombre es: ${campoTextoCopia}")
            Toast.makeText(this,"Presione el boton y su nombre es ${campoTextoCopia}", Toast.LENGTH_SHORT).show()
        }


    }
}