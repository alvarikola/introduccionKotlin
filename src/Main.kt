fun main() {
    println("Hola Mundo")
    var entero:Int = 1
    var str:String = "Mutumbu"
    var boolean : Boolean = true
    var double: Double = 2.0
    var float: Float = 2.1F
    println("Entero: " + entero + "\n" + "String: " + str + "\n" + "Boolean: " + boolean + "\n" + "Double: " + double + "\n" + "Float: " + float)
    bucleFor()
    bucleWhile()
    ejemploLista()
    ejemploClase()
    ejemploDataClass()
    ejemploWhen("Lunes")
    ejemploNullSafety()
}

//Bucle while
fun bucleWhile() {
    var contador: Int = 0
    while (contador < 10) {
        contador += 1
        println(contador)
    }
}

// Bucle for
fun bucleFor() {
    val frutas = listOf("apple", "banana", "kiwi")
    for (fruta in frutas) {
        println(fruta)
    }
}

// Listas
fun ejemploLista() {
    val frutasInmutable = listOf("manzana", "platano", "kiwi")  // Lista inmutable
    println(frutas[0])
    // frutas.add("pera")  // Esto da error porque es una lista inmutable

    val frutasMutable = mutableListOf("manzana", "banana")  // Lista mutable
    frutasMutable.add("kiwi")
    println(frutasMutable)
}

// Clases
class Persona(val nombre: String, val edad: Int) {
    fun saludar() {
        println("Hola me llamo $nombre y tengo $edad años")
    }
}

fun ejemploClase() {
    val persona = Persona("Alvaro", 18)
    persona.saludar()
}

// Data class
data class Persona(val nombre: String, val edad: Int)

fun ejemploDataClass() {
    val persona1 = Persona("Alvaro", 18)
    val persona2 = Persona("David", 19)
    println(producto1)  
    println(producto2)
}

// When
fun ejemploWhen(dia: String) {
    when (dia) {
        "Lunes" -> println("Hoy es lunes")
        "Martes" -> println("Hoy es martes")
        "Miércoles" -> println("Hoy es miércoles")
        else -> println("No se que día es")
    }
}

// NullSafety
fun ejemploNullSafety() {
    var nombre: String? = null  // Puede ser null
    println(nombre?.length)  // Usamos el operador seguro ?. para evitar excepciones

    nombre = "Carlos"
    println(nombre?.length)  // Ahora imprime la longitud de la cadena "Carlos"

    val longitud = nombre?.length ?: 0  // Si es null, asigna 0
    println(longitud)  // Salida: 6
}
