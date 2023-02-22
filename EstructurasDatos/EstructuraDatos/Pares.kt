fun main(){
  //Creando pares
  val pair = "Kotlin Pair" to 2
  
  //Accediendo elementos par
  println(pair.first) 
  //Imprime Kotlin
  println(pair.second) 
  //Imprime Pair2

  //Modificando elemnetos del par
  val newPair =Pair("Kotlin", "Java")
  val (first, second)= pair
  val newPairTwo= first to second
  newPairTwo.first
  newPairTwo.second
  println(newPair)
  
  //Recorriendo par
  val par= 1..10 step 2
    for (i in par){ 
    println(i)
    }
  }
//-------------------------------------------------------------------------------------------------
//EJERCICO PRACTICO
//  Construya un Pair donde se almacenen los valores nombre y edad de una persona por medio de una  obtenerInformacionPersonal() , acceda e imprima a estos valores 
fun infoPersona () {
fun obtenerInformacionPersonal(): Pair<String, Int> {
  return Pair("Carlos", 34)
    
val (nombre, edad) = obtenerInformacionPersonal()
println("Nombre: $nombre, Edad: $edad")
}

}
  