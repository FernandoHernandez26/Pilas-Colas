package ejercicios
import estructuras.Cola
import estructuras.Pila

/**
 * Clase que contiene los ejercicios de la Actividad.
 */

class Ejercicios {

// EJERCICIO 1 Invertir una cadena de caracteres utilizando una pila.

    fun ejercicio1() {
// Se solicita al usuario ingresar texto
        print("Introduce un texto ")
        val texto = readln()
// Se crea una pila vacia
        val pila = Pila()
        for (caracter in texto) {
            pila.push(caracter)
        }
// Se crea variable donde se guarda el texto invertido
            var invertido = ""
            while (!pila.isEmpty()) {   // extrae los caracteres de la paila al revez o de modo inverso
                invertido += pila.pop().toString()

            }
            println("El texto ivertido es: $invertido")  // muestra el resultado por pantalla

        }

    // EJERCICIO 2  Cadena de clientes

    fun ejercicio2() {
// Se crea cola vacia
        val cola = Cola()

        var opcion: Int

        do {
// menu de opciones para que el usuario pueda interactuar
            println("\n====== COLA DE CLIENTES ======")
            println("1. Llegada")
            println("2. Atender")
            println("3. Mostrar cola")
            println("4. Salir")

            print("Seleccione una opción: ")
            opcion = readln().toInt()
// se realiza opciones del menu con sus respectivas salidas de texto por pantalla
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

// con lowercase se convierte texto en minusculas y se quita espacios
        val texto = readln()
            .lowercase()
            .replace(" ", "")

        val pila = Pila()
        val cola = Cola()
// inserta  cada caracter en anbas estructuras tanto pila como cola
        for (caracter in texto) {
            pila.push(caracter)
            cola.encolar(caracter)
        }
// esta variable se define si es texto contiene una palabra palindroma
        var esPalindromo = true

        while (!pila.isEmpty()) {

            val desdePila = pila.pop()
            val desdeCola = cola.desencolar()

            if (desdePila != desdeCola) {
                esPalindromo = false
                break
            }
        }
// muestra el resultado al usuario
        if (esPalindromo) {
            println("La frase ES un palíndromo.")
        } else {
            println("La frase NO es un palíndromo.")
        }
    }

    // EJERCICIO 4 CONVERSION DE BINARIOS


    fun ejercicio4() {

//Se solicita un numero positivo al usuario para transformarlo en binario
        print("Introduce un número decimal positivo: ")
        var numero = readln().toInt()
// variable para guardar el numero original del usuario
        val original = numero
        val pila = Pila()  // se crea pila para almacenar los restos de divisiones


        // caso especial para cuando el número es 0
        if (numero == 0) {
            println("Binario: 0")
            return
        }

        while (numero > 0) {

            val resto = numero % 2
            pila.push(resto)

            numero /= 2
        }
        print("El número $original en binario es: ")
//se calcula resto de la division entre 2


        // recupera  los restos en  orden inverso
        while (!pila.isEmpty()) {
            print(pila.pop())
        }

        println()
    }

    }




