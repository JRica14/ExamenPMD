package com.example.examenpmd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FavoriteMoviesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_movies)


        var peli = intent.getSerializableExtra("pelicula") as Movie
        var listPeliculas=findViewById<TextView>(R.id.textView3)
        var btnVolver= findViewById<Button>(R.id.button8)


        if (peli.favorita){
            listPeliculas.text=listPeliculas.text.toString()+" "+peli.toString()
        }

        btnVolver.setOnClickListener {
            var intent = Intent(this, MovieDisplayActivity::class.java)
            intent.putExtra("pelicula",peli)
            startActivity(intent)
        }
    }
}