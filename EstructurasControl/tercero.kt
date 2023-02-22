//Condicionales dobles 
import java.util.Scanner
fun main() {
val scanner = Scanner(System.`in`)
println("Ingrese el valor de la compra: ")
var valorCompra = scanner.nextDouble()
println("Valor Compra: $valorCompra")
var descuento = 0.0
if (valorCompra >= 100000) {
descuento = valorCompra * 0.5
valorCompra -= descuento
println("Se aplicó un descuento del 50% equivalente a: $descuento")
} else {
descuento = valorCompra * 0.1
valorCompra -= descuento
println("Se aplicó un descuento del 10% equivalente a: $descuento")
}
println("Valor Final: $valorCompra")
}