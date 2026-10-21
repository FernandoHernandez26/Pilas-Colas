//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import ejercicios.Ejercicios

fun main() {

    val ejercicios = Ejercicios()

    var opcion: Int

    do {

        println("\n========== MENÚ PRINCIPAL ==========")
        println("1. Invertir texto")
        println("2. Cola de clientes")
        println("3. Palíndromo")
        println("4. Decimal a binario")
        println("5. Salir")

        print("Seleccione una opción: ")
        opcion = readln().toInt()

        when (opcion) {

            1 -> ejercicios.ejercicio1()

            2 -> ejercicios.ejercicio2()

            3 -> ejercicios.ejercicio3()

            4 -> ejercicios.ejercicio4()
        }

    } while (opcion != 5)
}