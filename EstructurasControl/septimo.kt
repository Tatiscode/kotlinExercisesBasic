//When como expresion                                                                                                                                                                                                              fun main() {
fun main(){
  print("Ingrese el número de horas trabajadas: ")
val horasTrabajadas = readLine()!!.toInt()
val tarifaHora = 2000
  var salario = horasTrabajadas * tarifaHora
println("El salario base es $salario ")
var porc=0.1
var descuento=salario*porc
println("Se le realizará un descuento del 10% equivalente a: $descuento ")
var salarioTotal=salario-(descuento)
println("Salario neto a pagar aplicado el descuento es: $salarioTotal ")
print("Ingrese el tipo de empleado (A, B, C): ")
val tipoEmpleado = readLine()
var porcAumento=0.0
when (tipoEmpleado) {
"a","A" -> {
porcAumento=30.0
println("Es tipo A ")
}
"b","B" ->{
porcAumento=20.0
println("Es tipo B ")
}
"c","C" ->{
porcAumento=10.0
println("Es tipo C ")
}
else -> {
println("No se realizará ningún aumento ")
porcAumento=0.0
}
}
if(porcAumento!=0.0){
var aumento=salarioTotal*(porcAumento/100)
salarioTotal=salarioTotal+aumento
println("Se realizó un aumento de $aumento, Equivalente al $porcAumento% ")
println("Se realizó un aumento de $aumento Equivalente al $porcAumento% ")
println("El salario final quedó en $salarioTotal ")
}
}