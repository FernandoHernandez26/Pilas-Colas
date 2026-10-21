package estructuras

/**
 * Implementacion de una pila  en estructura LIFO (Last In First Out)  con nodos.
 */
class Pila {
    private var cima: Nodo? = null

    fun push(dato: Any) {
        val nuevo = Nodo(dato)
        nuevo.siguiente = cima
        cima = nuevo
    }

    fun pop(): Any? {

        if (isEmpty()) {
            return null
        }

        val dato = cima?.dato
        cima = cima?.siguiente

        return dato
    }

    fun isEmpty (): Boolean {
        return cima == null
    }
}