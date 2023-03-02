package com.example.examenpmd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var titulo= findViewById<EditText>(R.id.editTextTextPersonName)
        var duracion= findViewById<EditText>(R.id.editTextTextPersonName2)
        var btnSig= findViewById<Button>(R.id.button2)

        var peli=Movie()

        btnSig.setOnClickListener {
            if (titulo.text.toString().isNotEmpty()&&duracion.text.toString().isNotEmpty()) {
                peli.titulo = titulo.text.toString()
                peli.duracion = duracion.text.toString().toInt()
                var intent = Intent(this, MovieDetailsActivity::class.java)
                intent.putExtra("pelicula", peli)
                startActivity(intent)
            }
        }
    }
}