package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 11/6/26
 * All rights reserved: 2026
 */

fun main(){
    println("Interrupciones break, continue y return")
    println("Interrupciones break")

    for( i in 1..5){
        println(i)
        if(i ==3){
            break
        }
        println(i)
    }

    println(";*")

    println("Interrupciones continue")

    for( i in 1..5){
        println(i)
        if(i ==3){
            continue
        }
        println(i)
    }
    println(":)")

    println("Interrupciones return")

    for( i in 1..5) {
        println(i)
        if (i == 3) {
            return
        }
        println(i)
    }

        println(":(")
}
