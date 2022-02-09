package com.example.edad_canina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton=findViewById<Button>(R.id.boton)
        var edad=findViewById<TextView>(R.id.edad)
        var resultado=edad.text.toString()
        var edadResultado=resultado.toInt()
        boton.setOnClickListener{
            if (resultado.isNotEmpty()){
                edadResultado=edadResultado*7
                edad.text=edadResultado.toString()
            }else{
                Toast.makeText(this, "Ingresa un numero", Toast.LENGTH_SHORT).show()
            }
        }
    }
}