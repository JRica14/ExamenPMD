package com.example.examenpmd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MovieDisplayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_display)

        var peli = intent.getSerializableExtra("pelicula") as Movie
        var listPeliculas=findViewById<TextView>(R.id.textView)
        var btnVolver= findViewById<Button>(R.id.button4)
        var btnOtra= findViewById<Button>(R.id.button5)
        var btnFav= findViewById<Button>(R.id.button6)



        listPeliculas.text="Titulo:"+peli.titulo+"\nDirector"+peli.nombreDirector+"\nDuracion:"+peli.duracion+"\nAño:"+peli.anio


        btnVolver.setOnClickListener {
            var intent = Intent(this, MovieDetailsActivity::class.java)
            intent.putExtra("pelicula",peli)
            startActivity(intent)
        }

        btnOtra.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnFav.setOnClickListener {
            var intent = Intent(this, FavoriteMoviesActivity::class.java)
            peli.favorita=true
            intent.putExtra("pelicula",peli)
            startActivity(intent)
        }
    }
}