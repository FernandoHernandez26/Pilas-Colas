package estructuras
/**
 * Implementacion de una cola en estructura FIFO (First In First Out) con nodos.
 */
class Cola {
    private var frente: Nodo? = null
    private var final: Nodo? = null

    // metodo para encolar

    fun encolar(dato: Any) {
        val nuevo = Nodo(dato)
        if (isEmpty()) {
            frente = nuevo
            final = nuevo
        } else {
            final?.siguiente = nuevo
            final = nuevo
        }
    }

    // metodo para desencolar

    fun desencolar(): Any? {7
        if (isEmpty()) {
            return null
        }
        val dato = frente?.dato
        frente = frente?.siguiente

        if (frente == null) {
            final = null
        }
        return dato
    }

    fun isEmpty(): Boolean {
        return frente == null
    }

// metodo para mostrar cola

    fun mostrarCola() {
        if (isEmpty()) {
            println("La cola está vacía.")
            return
        }

        var actual = frente
        while (actual != null) {
            print("\n ${actual.dato} ")
            actual = actual.siguiente
        }
        println("\n Fin de la lista de espera....")
    }

}