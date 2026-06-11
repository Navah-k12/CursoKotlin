package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 10/6/26
 * All rights reserved: 2026
 */
class Sentencias {
}


fun main()
{
    var a = 10

    if(a <= 10)
    {
        println("a vale: $a")

    }else if(a <=10)
    {
        println("a vale: $a")
    }else {
        println("a vale: $a")
    }

    if(a <= 10)
        println("a vale: $a")
    else if(a <=10)
        println("a vale: $a")
    else
        println("a vale: $a")



    println("When")

    val tarjeta = readln()

    when(tarjeta){
        "101" -> print("1,000.000 MXN")
        "102",
        "103" -> print("1,000.000 MXN")
        "104" -> {
            println("1,000,000.000 MXN")
            print("10,000,000.000 MXN")
        }
        "105" -> print("1,000,000,000.000 MXN")
        else -> print("Tarjeta no disponible")

    }

}