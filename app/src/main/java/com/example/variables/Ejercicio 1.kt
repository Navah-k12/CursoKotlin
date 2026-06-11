package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 11/6/26
 * All rights reserved: 2026
 */


fun main()
{
    // Sistema de Registro de Ventas de una Tienda
    //Desarrolla un programa en Kotlin para registrar las ventas realizadas por
    // varios vendedores durante un día.

//    Restricciones
//    No utilizar arreglos ni listas.
//    No utilizar funciones.
//    No utilizar while ni do while.
//    Resolver únicamente con variables, for, if, else if, else y when.



    println("Cuantos vendedores seran registrados?")
    val vendedores = readln().toInt()
    println()

    println("Nombre del vendedor")
    val nombre = readln()

    for(i in 1..<nombre.length)
        println("Nombre ingresado ${nombre}")

    println()

    println("Ingrese la cantidad de los Productos Vendidos: ")
    val CantidadV = readln().toInt()
    println()

    println("Precio de Producto Vendido: ")
    val PrecioV = readln().toFloat()
    println()

    val total = CantidadV * PrecioV
    println("Total de ingreso: $${total}")


    if(total >= 10000)
        println("Excelente Venta")
    else if(total >= 5000)
        println("No cumpliste con la meta")
    else if(total >= 1000)
        println("La venta fue Buena")
    else if(total < 1000)
        println("La venta fue Baja")
    else
        println("No cumpliste con la meta")

    val msj = total
    when(total){
        msj -> println("Bono Máximo")
        msj -> println("")
        else -> println("Requiere Capacitación")
    }
    println("Total vendido de ${nombre.uppercase()} es de ${CantidadV} y la cantidad que vendio es: $${total}")





}