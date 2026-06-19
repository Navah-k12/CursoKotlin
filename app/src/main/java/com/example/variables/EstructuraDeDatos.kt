package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 19/6/26
 * All rights reserved: 2026
 */
fun main(){
    println("Estructura de Datos")

    println("Array definidos")

    val flores = Array (3) {""}
    flores[0] = "Rosa"
    flores[1] = "Tulipan"
    flores[2] = "Lirio"
    println(flores[0])
    println(flores[1])
    println(flores[2])

    println()
    println("Array bidimencional")
    val tablero = Array(2){Array(2){0}}

    tablero[0][0]=10
    tablero[0][1]=20
    tablero[1][0]=30
    tablero[1][1]=40

    for (x in 0..1){
        for(y in 0..1){
            println("El valor de: ${tablero[x][y]}")
        }
    }



    println()

    println("Lista Inmutables con listOf")

    val pokemon = listOf("Pikachu", "Charmander", "Rowlet")
    println(pokemon)
    println(pokemon[0])
    println(pokemon[1])
    println(pokemon[2])


    println()
    println("Lista Mutables con mutablelistOf")
    val digimon = mutableListOf("Patamon", "Greymon", "Angemon")
    println(digimon)

    digimon.add("Floramon")
    println(digimon)
    digimon.remove("Patamon")
    println(digimon)
    digimon.removeAt(0)
    println(digimon)
    //digimon.set(1, "MetalSkullGreymon")
    digimon[1] = "MetalSkullGreymon"
    println(digimon)
}