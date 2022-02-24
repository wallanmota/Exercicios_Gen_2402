fun main(){
    /*
    FOR
    Ler 10 números e imprimir quantos são pares e quantos são ímpares.
     */
    var par = 0
    var impar = 0
    for(i in 1..10){
        print("Digite o $i º número: ")
        val num = readLine()!!.toInt()

        if(num % 2 == 0){
            par++
        }else{
            impar++
        }
    }
    println("Você digitou $par números par e  $impar números impar!")
}