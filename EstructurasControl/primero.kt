//Estructuras secuenciales.
fun main() {
print("Ingrese sus horas Trabajadas :")
var horasTrabajadas=readLine()!!.toInt()
var valorHora=2000
var porc=0.1
var salario=horasTrabajadas*valorHora
println("El salario base es: $salario")
var descuento=salario*porc
println("Se le realizará un descuento del 10% equivalente a: $descuento")
var salarioTotal=salario-descuento
println("Salario neto a pagar aplicado el descuento es: $salarioTotal")
}