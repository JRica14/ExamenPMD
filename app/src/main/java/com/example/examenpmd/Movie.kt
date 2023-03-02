package com.example.examenpmd





class Movie :java.io.Serializable{
    var titulo=""
    var duracion=0
    var nombreDirector=""
    var anio=0

    var favorita=false

    override fun toString():String{
        return "\nTitulo: "+titulo+"\nAño: "+anio+"\nDuracion: "+duracion+"\nDirector: "+nombreDirector
    }
}

