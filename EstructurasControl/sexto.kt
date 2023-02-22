//Condicionales multiples con when                                                                                                                                                               fun main() {
fun main(){
var num=2
when (num) {
0 -> println("El número es 0")
1, 2, 3 -> println("El número está entre 1 y 3")
in 4..10 -> println("El número está entre 4 y 10")
else -> println("El número no se encuentra")
}
}

