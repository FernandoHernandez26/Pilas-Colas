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

    // EJERCICIO 2  Cadena de clientes

    fun ejercicio2() {

        val cola = Cola()

        var opcion: Int

        do {

            println("\n====== COLA DE CLIENTES ======")
            println("1. Llegada")
            println("2. Atender")
            println("3. Mostrar cola")
            println("4. Salir")

            print("Seleccione una opción: ")
            opcion = readln().toInt()

            when (opcion) {

                1 -> {
                    print("Nombre del cliente: ")
                    val nombre = readln()
                    cola.encolar(nombre)
                    println("Cliente añadido correctamente.")
                }

                2 -> {

                    val cliente = cola.desencolar()

                    if (cliente == null) {
                        println("No hay clientes en espera.")
                    } else {
                        println("Cliente atendido: $cliente")
                    }
                }

                3 -> {
                    println("\nEstado actual de la cola:")
                    cola.mostrarCola()
                }

                4 -> {
                    println("Fin del ejercicio.")
                }

                else -> {
                    println("Opción no válida.")
                }
            }

        } while (opcion != 4)
    }


    // EJERCICIO 3  PALABRA PALINDROMA

    fun ejercicio3() {

        print("Introduce una palabra o frase: ")

        val texto = readln()
            .lowercase()
            .replace(" ", "")

        val pila = Pila()
        val cola = Cola()

        for (caracter in texto) {
            pila.push(caracter)
            cola.encolar(caracter)
        }

        var esPalindromo = true

        while (!pila.isEmpty()) {

            val desdePila = pila.pop()
            val desdeCola = cola.desencolar()

            if (desdePila != desdeCola) {
                esPalindromo = false
                break
            }
        }

        if (esPalindromo) {
            println("La frase ES un palíndromo.")
        } else {
            println("La frase NO es un palíndromo.")
        }
    }


    }




