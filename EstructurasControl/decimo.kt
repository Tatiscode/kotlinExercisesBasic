//FOR                                                                                                                                                                                                       fun main() {
fun main() {
    print("Ingrese la cantidad de veces a repetir:")
val cant = readLine()!!.toInt()
for (i in 0 until cant) {
print("Ingrese un número 1:")
val x = readLine()!!.toInt()
print("Ingrese un número 2:")
val y = readLine()!!.toInt()
val suma = x + y
println("La suma es: $suma")
when {
suma >= 10 -> println("La suma es mayor o igual a dos dígitos y es positivo!")
suma <= 0 -> {
println("La suma arrojó un valor negativo")
if (suma <= -10) {
println("La suma es mayor o igual a dos dígitos y es negativo!")
} else {
println("La suma arroja un valor de un dígito")
}
}
else -> println("La suma arroja un valor de un dígito y es positivo!")
}
}
}