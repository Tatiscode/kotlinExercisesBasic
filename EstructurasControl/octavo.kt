//DO WHILE  
fun main(){
print("Ingrese la cantidad de personas a saludar: ")
val cantidadPersonas = readLine()!!.toInt()
var contador = 1
do {
print("Ingrese el nombre de la persona $contador: ")
val nombre = readLine()!!
println("Hola $nombre, ¡Bienvenido!")
contador++
} while (contador <= cantidadPersonas)

}                                                                                                                                                                                                                   fun main() {
