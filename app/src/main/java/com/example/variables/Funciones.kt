package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 19/6/26
 * All rights reserved: 2026
 */

fun main(){
    titulo()
    pokemon(nombre = "Mew")
    pokemon(nombre = "Pikachu")
    pokemon(nombre = "Charmander")

}

fun titulo(){
    println("Lista de POkemon")
}

fun pokemon(nombre: String){
    println(nombre)
}

fun tipos(pokemon: String): String{
//    if (Pokémon == "Pikachu") println("Electrico")
//    else if(Pokémon == "Charmander") println("Fuego")
//    else println("Psiquico")

//    return if (Pokémon == "Pikachu")
//        else if (Pokémon == "Charmander")
//            else -> "Psiquico"

    return when(pokemon){
       "Pikachu" ->"ELectrico"
        "Charmander" -> "FUEGO"
        else -> "Psiquico"
    }

}