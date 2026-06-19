    package com.example.variables


    /**
     * Project: Variables
     * From: com.example.variables
     * Created by: navah
     * On: 17/6/26
     * All rights reserved: 2026
     */
    //

    fun main() {
        val msj = """
            ===== EVENTO TECH 2026 =====

            1. Registrar asistente
            2. Ver estadísticas
            3. Cerrar evento

            Seleccione una opción:
        """.trimIndent()


        var totalAsistentes = 0
        var totalMenores = 0
        var totalAdultos = 0
        var totalAdultosMayores = 0

        var boletosGeneral = 0
        var boletosVIP = 0
        var boletosPatrocinador = 0

        var nombreMayorEdad = ""
        var edadMaxima = 0

        while (true) {

            println(msj)

            when (readlnOrNull()?.toIntOrNull()) {

                1 -> {

                    while (true) {

                        print("\nNombre del asistente: ")
                        val nombre = readlnOrNull()?.trim() ?: ""

                        // Uso obligatorio de continue
                        if (nombre.isEmpty()) {
                            println("Nombre inválido.")
                            continue
                        }

                        var edad: Int

                        while (true) {
                            print("Edad: ")
                            edad = readlnOrNull()?.toIntOrNull() ?: -1

                            if (edad >= 0) {
                                break
                            }

                            println("Edad inválida.")
                        }

                        var tipoBoleto: String


                        while (true) {
                            print("Tipo de boleto (A/B/C): ")
                            tipoBoleto = readln().uppercase()

                            if (
                                tipoBoleto == "A" ||
                                tipoBoleto == "B" ||
                                tipoBoleto == "C"
                            ) {
                                break
                            }

                            println("Tipo de boleto inválido.")
                        }

                        // Clasificación por edad
                        val categoria = when {
                            edad < 18 -> {
                                totalMenores++
                                "Menor"
                            }

                            edad <= 59 -> {
                                totalAdultos++
                                "Adulto"
                            }

                            else -> {
                                totalAdultosMayores++
                                "Adulto Mayor"
                            }
                        }

                        val acceso = when (tipoBoleto) {
                            "A" -> {
                                boletosGeneral++
                                "Acceso General"
                            }

                            "B" -> {
                                boletosVIP++
                                "Acceso VIP"
                            }

                            "C" -> {
                                boletosPatrocinador++
                                "Acceso Total"
                            }

                            else -> ""
                        }

                        totalAsistentes++

                        if (edad > edadMaxima) {
                            edadMaxima = edad
                            nombreMayorEdad = nombre
                        }

                        println("\nRegistro exitoso")
                        println("Categoría: $categoria")
                        println("Tipo de acceso: $acceso")

                        print("\n¿Desea registrar otro asistente? (S/N): ")
                        val respuesta = readlnOrNull()?.uppercase()
                        if (respuesta == "N") {
                            break
                        }
                    }
                }

                2 -> {
                    val estadistica = """
                        ===== ESTADÍSTICAS =====

                        Total asistentes: $totalAsistentes
                        Total menores:    $totalMenores
                        Total adultos:    $totalAdultos
                        Total adultos mayores: $totalAdultosMayores

                        Boletos General: $boletosGeneral
                        Boletos VIP:     $boletosVIP
                        Boletos Patrocinador: $boletosPatrocinador

                        Persona de mayor edad: $nombreMayorEdad
                        Edad: $edadMaxima
                    """.trimIndent()
                    println(estadistica)

                }

                3 -> {

                    if (totalAsistentes == 0) {
                        println("No existen registros.")
                        return
                    }

                    println("Evento finalizado correctamente.")
                    return
                }

                else -> {
                    println("Opción inválida.")
                }
            }
        }
    }
