//Condicionales múltiples (Anidados)
fun main() {
val num1 = 2.0
val num2 = 1.0
val num3 = 1.0
val promedio = (num1 + num2 + num3) / 3
val res = if (promedio > 3.5) "GANÓ" else if (promedio > 2) "recupera" else "PERDIÓ"
println("El promedio es $promedio, y la persona $res")
}