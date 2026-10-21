package estructuras
// Nodo reutilizable para cualquier tipo de dato
class Nodo {
    var dato: Any
    var siguiente: Nodo?

    constructor(dato: Any) {
        this.dato = dato
        this.siguiente = null
    }
}