fun main() {
  //Creando arreglo
val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

//Accediendo elementos 
println(weekDays[2])
//Imprime Miercoles

//Modificando elementos 
weekDays[2]="Feliz Miercoles!"
println(weekDays[2])
//Imprime Feliz Miercoles!

//Recorriendo arreglo
for (weekDay in weekDays){
println(weekDay)
}
}
//-------------------------------------------------------------------------------------------------
//EJERCICO PRACTICO
//Cree un arreglo que contenga los nombres de 6 aprendices 
// - Acceda a la posicion 2 y muestre por pantalla que valor pertenece a ese indice
// -Modifique el elemento de su preferencia por el nombre "Tatiana" y luego recorra todo el arreglo mostrandolo por pantalla

fun aprendices() {
val aprendices= arrayOf("Zharick", "Didier", "Estiben", "Cristian", "Pedro")
println(aprendices[2]) //Imprime Estiben
aprendices[4]="Tatiana"
println(aprendices[4])//Imprime Tatiana
for (aprendiz in aprendices){
println(aprendiz)
}
}