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
        val boton=findViewById<Button>(R.id.boton)
        val edad=findViewById<TextView>(R.id.edad)
        val result=findViewById<TextView>(R.id.resul)
        boton.setOnClickListener{
            var resultado=edad.text.toString()
            if (resultado.isNotEmpty()){
                var edadResultado=resultado.toInt()
                edadResultado=edadResultado*7
                result.text=edadResultado.toString()
            }else{
                Toast.makeText(this, "Ingresa un numero", Toast.LENGTH_SHORT).show()
            }
        }
    }
}