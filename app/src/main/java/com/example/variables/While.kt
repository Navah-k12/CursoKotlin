package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 11/6/26
 * All rights reserved: 2026
 */


fun main(){
    println("Ciclos WHile y Do While")
    var contador = 1

    println("Ciclos While")
    while (contador <=5)
    {
        println("El valor del contador es : $contador")
        contador++
    }

    println()
    println("Ciclos Do While")

    do{
        contador--
        println("El valor del contador es $contador")
    }while (contador>1)
}