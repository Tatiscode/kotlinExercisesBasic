fun main () { 
//Creando conjunto
val colores: List<String>=listOf("Rosado", "Morado", "Azul")

//Accediendo elementos
println(colores.get(2));
//Imprime Azul

//Modificando elementos
val nuevosColores = colores.toMutableSet()
nuevosColores.add("Amarillo")
//Imprime "Rosado", "Morado", "Azul" "Amarillo"

//Recorriendo conjunto
for (color in colores){
println(color)
}
}
//-------------------------------------------------------------------------------------------------
//EJERCICO PRACTICO
//Crear un conjunto mutable (MutableSet) con una serie de valores Int. Probar las propiedades y métodos principales para administrar el conjunto
fun main(args: Array<String>) {
    val conjunto1: MutableSet<Int> = mutableSetOf(2, 7, 20, 150, 3)
    println("Listado completo del conjunto")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    println("Cantidad de elementos del conjunto: ${conjunto1.size}")
    conjunto1.add(500)
    println("Listado completo del conjunto luego de agregar el 500")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    conjunto1.add(500)
    println("Listado completo del conjunto luego de volver a agregar el 500")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    if (500 in conjunto1)
        println("El 500 está almacenado en el conjunto")
    else
        println("El 500 no está almacenado en el conjunto")
    println("Eliminamos el elemento 500 del conjunto")
    conjunto1.remove(500)
    if (500 in conjunto1)
        println("El 500 está almacenado en el conjunto")
    else
        println("El 500 no está almacenado en el conjunto")
    val cant = conjunto1.count { it >= 10 }
    println("Cantidad de elementos con valores superiores o igual a 10: $cant")
}