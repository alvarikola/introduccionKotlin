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

