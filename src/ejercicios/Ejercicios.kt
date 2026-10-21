package ejercicios
import estructuras.Cola
import estructuras.Pila

/**
 * Clase que contiene los ejercicios de la Actividad.
 */

class Ejercicios {

// EJERCICIO 1 Invertir una cadena de caracteres utilizando una pila.

    fun ejercicio1() {
        print("Introduce un texto ")
        val texto = readln()

        val pila = Pila()
        for (caracter in texto) {
            pila.push(caracter)
        }
            var invertido = ""
            while (!pila.isEmpty()) {
                invertido += pila.pop().toString()

            }
            println("El texto ivertido es: $invertido")

        }
    }




