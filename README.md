📚 Práctica PSP - Pilas y Colas en Kotlin
👨‍💻 Autor
Fernando

🎓 Curso
2º DAM (Desarrollo de Aplicaciones Multiplataforma)

📖 Módulo
Programación de Servicios y Procesos (PSP)

📝 Descripción
Práctica realizada en Kotlin sobre el uso de estructuras dinámicas de datos: Pilas y Colas.

La implementación se ha realizado utilizando una estructura dinámica basada en nodos enlazados, reutilizando la clase Nodo tanto para la pila como para la cola, siguiendo las indicaciones del profesor.

🏗️ Estructura del proyecto
src/
│
├── estructuras/
│   ├── Nodo.kt
│   ├── Pila.kt
│   └── Cola.kt
│
├── ejercicios/
│   └── Ejercicios.kt
│
└── Main.kt
Componentes principales
Nodo: clase reutilizable para almacenar los datos y la referencia al siguiente nodo.
Pila: implementación dinámica siguiendo el modelo LIFO (Last In, First Out).
Cola: implementación dinámica siguiendo el modelo FIFO (First In, First Out).
Ejercicios: contiene la resolución de los cuatro ejercicios propuestos.
Main: menú principal para ejecutar los ejercicios.
✅ Ejercicio 1 - Invertir texto mediante una pila
Se solicita una cadena al usuario.

Cada carácter se inserta en una pila mediante la operación push().

Posteriormente se recuperan los caracteres mediante pop(), obteniendo la cadena invertida.

Operaciones utilizadas
push()
pop()
isEmpty()
✅ Ejercicio 2 - Cola de clientes
Simulación de una cola de atención al cliente.

Permite:

Registrar la llegada de clientes.
Atender clientes por orden de llegada.
Mostrar el estado de la cola.
Salir del programa.
Operaciones utilizadas
encolar()
desencolar()
isEmpty()
✅ Ejercicio 3 - Comprobación de palíndromos
Se comprueba si una palabra o frase es palíndroma utilizando simultáneamente:

Una pila (lectura inversa).
Una cola (lectura directa).
Antes de la comprobación se normaliza el texto:

Conversión a minúsculas.
Eliminación de espacios.
✅ Ejercicio 4 - Conversión de decimal a binario
Se convierte un número decimal positivo a binario mediante una pila.

Proceso utilizado:

Dividir repetidamente el número entre 2.
Almacenar los restos en la pila.
Recuperar los restos mediante pop().
Mostrar el número binario resultante.
🔄 Reutilización de código
Para cumplir los requisitos de la práctica, se ha implementado una única clase Nodo reutilizada por las estructuras:

Pila
Cola
De esta forma se evita la duplicación de código y se mejora el mantenimiento de la aplicación.

💻 Tecnologías utilizadas
Kotlin
IntelliJ IDEA
Git
GitHub
📌 Objetivos trabajados
Implementación de estructuras dinámicas.
Uso de Pilas y Colas.
Reutilización de código mediante clases comunes.
Programación orientada a objetos.
Documentación y organización del código.
Gestión de proyectos mediante Git y GitHub.
