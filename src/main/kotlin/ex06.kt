fun main(){
    /*
    DO WHILE
    Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
     */

    var mul3 = 0
    var sum = 0

    do{
       print("Digite um número: ")
       val num = readLine()!!.toInt()

        if(num % 3 == 0 && num != 0){
            mul3++
            sum += num
        }

    }while(num != 0)

    val media = sum.toDouble() / mul3.toDouble()

    println("A média dos números múltiplos de 3 é: $media")
}