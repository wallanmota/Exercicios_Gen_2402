fun main(){
    /*
    WHILE
    Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
    Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
    Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
      * número de pessoas calmas;
      * número de mulheres nervosas;
      * número de homens agressivos;
      * número de outros calmos;
      * número de pessoas nervosas com mais de 40 anos;
      * número de pessoas calmas com menos de 18 anos.

     */

    var pessoa = 0
    var pessoasCalm = 0
    var mulheresNerv = 0
    var homemsAgre = 0
    var outrosCalm = 0
    var nervMore40 = 0
    var calmLess18 = 0

    while(pessoa <= 150){
        println("Pessoa ${pessoa + 1}")
        print("Digite sua idade: ")
        val idade = readLine()!!.toInt()

        println("Digite a opção do seu sexo: \n1- Feminino\n2- Masculino\n3- Outro")
        var sexo = readLine()!!.toInt()
            while(sexo < 1 || sexo >3){
                println("Opção inválida!!!")
                println("Digite a opção do seu sexo: \n1- Feminino\n2- Masculino\n3- Outro")
                sexo = readLine()!!.toInt()
            }

        println("Você é uma pessoa: \n1- Calma\n2- Nervosa\n3- Agressiva")
        var temperamento = readLine()!!.toInt()
            while(temperamento <1 || temperamento>3){
                println("Opção inválida!!!")
                println("Você é uma pessoa: \n1- Calma\n2- Nervosa\n3- Agressiva")
                temperamento = readLine()!!.toInt()
        }

        if(temperamento == 1){
            pessoasCalm++
        }
        if (sexo == 1 && temperamento == 2){
            mulheresNerv++
        }
        if(sexo == 2 && temperamento == 3) {
            homemsAgre++
        }
        if(sexo == 3 && temperamento == 1){
            outrosCalm++
        }
        if(idade > 40 && temperamento == 2){
            nervMore40++
        }
        if(idade < 18 && temperamento == 1){
            calmLess18++
        }
        pessoa++
    }
    println("Pessoas calmas: $pessoasCalm\n" +
            "Mulheres Nervosas:  $mulheresNerv\n" +
            "Homens Agressivos: $homemsAgre\n" +
            "Outros calmos: $outrosCalm\n" +
            "Nervosos com mais de 40 anos: $nervMore40\n" +
            "Camos com menos de 18 anos: $calmLess18")
}