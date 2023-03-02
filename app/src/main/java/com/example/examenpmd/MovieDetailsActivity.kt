package com.example.examenpmd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MovieDetailsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        var peli = intent.getSerializableExtra("pelicula") as Movie

        var nombreDir= findViewById<EditText>(R.id.editTextTextPersonName3)
        var anio=findViewById<EditText>(R.id.editTextNumberSigned)
        var btnVolver= findViewById<Button>(R.id.button)
        var btnSig=findViewById<Button>(R.id.button3)


        btnVolver.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnSig.setOnClickListener {
            if (nombreDir.text.toString().isNotEmpty()&&anio.text.toString().isNotEmpty()) {
                peli.anio = anio.text.toString().toInt()
                peli.nombreDirector = nombreDir.text.toString()
                var intent = Intent(this, MovieDisplayActivity::class.java)
                intent.putExtra("pelicula", peli)
                startActivity(intent)
            }
        }
    }
}