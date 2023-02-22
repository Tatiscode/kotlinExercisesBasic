//Condicionales dobles como expresiones.
fun main() {
val num1= 5.0
val num2= 3.0
val num3= 1.0
val prom = (num1 + num2 + num3) / 3
val result = if (prom >= 3.5) "GANA" else "PIERDE"
println("El promedio es: $prom")
println("El resultado es: $result la materia")
}