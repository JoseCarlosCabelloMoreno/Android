package com.example.edad_canina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.edad_canina.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val boton=binding.boton
        val edad=binding.edad
        val result=binding.resul
        boton.setOnClickListener{
            var resultado=edad.text.toString()
            if (resultado.isNotEmpty()){
                var edadResultado=resultado.toInt()
                edadResultado *= 7
                result.text=edadResultado.toString()
            }else{
                Toast.makeText(this, R.string.Input, Toast.LENGTH_SHORT).show()
            }
        }
    }
}