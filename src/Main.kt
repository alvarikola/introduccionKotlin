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


