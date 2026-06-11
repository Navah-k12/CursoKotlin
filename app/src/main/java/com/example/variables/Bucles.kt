package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 10/6/26
 * All rights reserved: 2026
 */
class Bucles {
}

fun main()
{
    println("Bucle FOR")
    println("Bucle FOR In por rango") // Trabajan en inicio, final y


    for(i in 1..5)
    {
        println(i)
    }

    println()
    println("Bucle FOR In por longitud")
    val flor = "rosa"

        for(i in 0..<flor.length)
    {
        println("Para cada $i : ${flor[i]}")
    }


    println()
    println("Bucle FOR In por STRING")

    for(i in flor)
    {
        println("Para cada $i")
    }

    
    println()
    println("Bucle ForEach")

    flor.forEach{
        println(it)
    }
}