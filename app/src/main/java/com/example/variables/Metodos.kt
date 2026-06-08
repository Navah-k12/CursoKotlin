package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: navah
 * On: 7/6/26
 * All rights reserved: 2026
 */

fun main(){
    val prueba: String = "  Métodos  "
    val pruebaDos: String = "Nuevos Métodos"
    val name: String = "Ingeniería-en-Desarrollo-de-Software"
    val kt: String = "KOTLIN"
    val phone: String = "5557727953"
    val a = kt + phone
    val vacio: String = ""
    val email: String = "kotlin@email.com"


    println("Transformación de Texto")
    println("Nuevos Métodos: ${prueba.trimStart()}")  // Elimina los espacios del inicio
    println("Nuevo Método: ${prueba.trimEnd()}")      // Elimina los espacios al final
    println("Nuevo Método: ${prueba.repeat(3)}")   // Repite la variable el número de veces indicado

    // Rellena el inicio del texto con el carácter asignado si la longitud es mayor que la variable
    println("Nuevo Método: ${pruebaDos.padStart(20, '*')}")
    // Lo mismo que el anterior pero al final
    println("Nuevo Método: ${pruebaDos.padEnd(20, '-')}")
    // Reemplaza lo que esté antes de ese carácter
    println("Nuevo Método: ${name.replaceBefore('-',"Lic.")}")
    // Lo mismo pero al contrario
    println("Nuevo Método: ${name.replaceAfter('-',"de Redes")}")

    println()

    println("Validación y Búsquedas")

    // Devuelve la posición (índice) de la primera vez que aparece una letra. Si no existe, da -1.
    println("Nuevo Método: ${kt.indexOf("t")}")
    // Devuelve la posición de la última vez que aparece una letra o guion en el texto.
    println("Nuevo Método: ${name.lastIndexOf("-")}")

    // Le colocamos una regla que se debe cumplir
    println("Nuevo Método: ${kt.matches(Regex("[a-zA-Z]"))}")
    // Validación de número de teléfono
    println("Teléfono Válido: ${phone.matches(Regex("[0-9]{10}"))}")
    // Validación de contraseña
    println("¿La contraseña solo son letras?: ${a.matches(Regex("[a-zA-Z]+"))}")
    // Permite dejar un campo vacío
    println("¿Número interior?: ${vacio.matches(Regex("[a-zA-Z-9]*"))}")
    // Compara si coincide el texto ignorando si son mayúsculas o minúsculas
    println("¿Es el mismo correo?: ${email.equals("$email", ignoreCase = true)}")
    println("¿Es el mismo correo?: ${kt.equals("Java@email.com",ignoreCase = true)}")

    // Revisa por completo y da true si todas las letras cumplen con la condición
    println("¿Todo es mayúsculas?: ${kt.all({it.isUpperCase()})}")

    // Si encuentra al menos una letra o espacio que cumpla la condición será true
    // Depende del criterio que le pongas:
    println("¿Tiene espacios?: ${pruebaDos.any({it.isWhitespace()})}")

    // Este es el caso contrario, o sea, que ningún carácter cumpla la condición
    // Depende del criterio que le pongas
    println("¿No tiene números?: ${kt.none({it.isDigit()})}")

    /** Algunos:
     * it.isLowerCase()
     * it.isLetter()
     * it.isDigit()
     * it.isLetterOrDigit()
     * */

    println("División y Extracción")
    println("Selecciona las últimas letras: ${name.takeLast(8)}")
    println("Borra las últimas letras: ${name.dropLast(9)}")
    println("Imprime todo antes de la condición: ${name.substringBefore("-")}")
    println("Imprime según el rango asignado: ${kt.slice(0..3)}")
}