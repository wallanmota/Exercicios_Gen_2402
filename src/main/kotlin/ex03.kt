fun main(){
    /*
    WHILE
    Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
    Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
     */
    var less21 = 0
    var more50 = 0
    var idade = 0

    while(idade != -99){

        print("Digite a idade da pessoa: ")
        idade = readLine()!!.toInt()

        if(idade < 21 && idade != -99){
            less21++
        }
        if(idade > 50){
            more50++
        }
    }
    println("O total de pessoas com menos de 21 anos é: $less21" +
            "\nO total de pessoas com mais de 50 anos é: $more50")
}