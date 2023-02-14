//Condicionales simples
fun main() {
println("Ingrese el valor de la compra:")
var valorCompra = readLine()!!.toDouble()
println("Valor Compra: $valorCompra")
var descuento = 0.0
if (valorCompra >= 100000) {
descuento = valorCompra * 0.5
valorCompra -= descuento
println("Se aplicó un descuento del 50% equivalente a: $descuento")
}
println("Valor Final: $valorCompra")
}