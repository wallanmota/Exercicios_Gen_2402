fun main(){
    /*
    DO WHILE
    Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    No final, mostre a soma dos números digitados.
     */
    var sum = 0

    do{
        print("Digite um número: ")
        val num = readLine()!!.toInt()
        sum += num

    }while(num != 0)

    println("A soma dos números digitados é: $sum")
}