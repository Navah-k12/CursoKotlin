package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 6/6/26
 * All rights reserved: 2026
 */

fun main(){
    val saludo = " Hola Mundo "
    var a = 5
    var b = 10

    // MIS VARIABLES
    val MiString: String = "Kotlin"
    val Vacio: String = " "
    val name: String = "Bryan-Ivan-Navarrete-Canche"

    // MÉtodos
    println("Tranformación de Textos")
    println("Saludo: $saludo") // TEMPLATE STRING
    println("Suma: ${a + b}")  // Suma Dentro de un TEMPLATE STRING
    println("saludo: ${saludo.uppercase()}")  // Vuelve en mayusculas el string
    println("Saludo: ${saludo.lowercase()}") // Vuelve minuscualas el string
    println("Saludo: ${saludo.replace("M","m")}")
    println("Saludo: ${saludo.trim()}")

    // Métodos Investigados


    println()


    println("Validación y busquedas")
    println("Aprendiendo: ${MiString.contains("Kot")}")
    println("Aprendiendo: ${MiString.startsWith("Ko")}")
    println("Aprendiendo ${MiString.endsWith("in")}")
    println("Vacio: ${Vacio.isNullOrEmpty()}") // Busca valores nulos o si esta vacio totalmente
    println("Vacio: ${Vacio.isEmpty()}")       // Busca si esta vacio totalmente
    println("Vacio: ${Vacio.isNullOrBlank()}") // Busca valores nulos o si hay valores visibles
    println("Vacio ${Vacio.isBlank()}")        // Verifica valores visibles

    // Métodos Investigados

    println()


    println("División y Extracción")
    println("Metodo Array: ${name.split("-")}") // Vuelve un arreglo cuando encuentra el guion
    println("Supstracción: ${name.substring(0,4)}")
    println("Tomar las Primeras letras: ${name.take(n=3)}")
    println("Eliminar las Primeras Letras: ${name.drop(3)}")

    //Métodos Investigados


}