package com.heliobuzato.sistematodo

fun menu(){
    println(
        """
        ============================================
        ||         [ SISTEMA TO-DO v1.0 ]         ||
        ||----------------------------------------||
        || [1] > CADASTRAR NOVA TAREFA            ||
        || [2] > CONSULTAR TAREFA                 ||
        || [3] > LISTAR TODAS AS TAREFAS          ||
        || [4] > ALTERAR TAREFA EXISTENTE         ||
        || [5] > REMOVER TAREFA                   ||
        || [6] > LIMPAR TODAS AS TAREFAS          ||
        || [0] > SAIR                             ||
        ||----------------------------------------||
        ||        ESCOLHA UMA OPCAO               ||
        ============================================
    """.trimIndent()
    )

}


var atividade: MutableList<String> = mutableListOf()
fun main() {

    menu()
    println("DIGITE SUA OPCAO: ")
    var opcao = validarEntrada()
    while (opcao != 0){
        when(opcao){
            1 -> Cadastrar()
            2 -> Consultar()
            3 -> Listar()
            4 -> Alterar()
            5 -> Remover()
            6 -> Limpar()
        }
        menu()
        println("DIGITE A OPCAO: ")
        opcao = validarEntrada()

    }

}

fun Limpar() {
    println("DESEJA REALMENTE APAGAR TODOS OS DAOOS? [S]SIM [N]NAO")
    var opc = readln()
    if(opc == "S" || opc =="s"){
        atividade.clear()
        println("DADOS REMOVIDOS")
        println("============================================")
        println("     ** TECLE [ENTER] PARA CONTINUAR **")
        readln()
    }else{
        println("OPREACAO CANCELADA")
    }

}

fun Remover() {
    println("============================================")
    println("ATIVIDADE CADASTRADAS: ")
    atividade.forEachIndexed{ind, atv -> println("[${ind + 1}] - $atv")}
    println("============================================")
    println("DIGITE O INDICE (ID) DA ATIVIDADE PARA REMOVER: ")
    var idAtv = validarEntrada()
    println("============================================")
    if(idAtv != null && idAtv in 1..atividade.size){
        atividade.removeAt(idAtv - 1)
        println("ATIVIDADE REMOVIDA")
    }else{
        println("============================================")
        println("VALOR INVALIDO")
        println("============================================")
        readln()

    }

    println("============================================")
    println("     ** TECLE [ENTER] PARA CONTINUAR **")
    readln()
}

fun Alterar() {
    println("============================================")
    println("ATIVIDADE CADASTRADAS: ")
    atividade.forEachIndexed{ind, atv -> println("[${ind + 1}] - $atv")}
    println("============================================")
    println("DIGITE O INDICE (ID) DA ATIVIDADE PARA ALTERAR: ")
    var idAtv = validarEntrada()
    println("============================================")
    if(idAtv != null && idAtv in 1..atividade.size){
        println("DIGITE A NOVA ATIVIDADE: ")
        atividade[idAtv - 1] = readln()
    }else{
        println("============================================")
        println("VALOR INVALIDO")
        println("============================================")
        readln()

    }

    println("============================================")
    println("     ** TECLE [ENTER] PARA CONTINUAR **")
    readln()
}

fun Cadastrar(){
    println("DIGITE SUA ATIVIDADE: ")
    atividade.add(readln().toString())
}

fun Consultar(){
    println("============================================")
    println("ATIVIDADE CADASTRADAS: ")
    atividade.forEachIndexed{ind, atv -> println("[${ind + 1}] - $atv")}
    println("============================================")
    println("DIGITE O INDICE (ID) DA ATIVIDADE: ")
    var idAtv = validarEntrada()
    println("============================================")
    println("ATIVIDADE SELECIONADA: ")
    if(idAtv != null && idAtv in 1..atividade.size){
        println(atividade[idAtv - 1])
    }else{
        println("============================================")
        println("VALOR INVALIDO")
        println("============================================")
        readln()

    }

    println("============================================")
    println("     ** TECLE [ENTER] PARA CONTINUAR **")
    readln()



}

fun Listar(){
    println("============================================")
    println("ATIVIDADE CADASTRADAS: ")
    atividade.forEachIndexed{ind, atv -> println("[${ind + 1}] - $atv")}
    println("============================================")
    println("     ** TECLE [ENTER] PARA CONTINUAR **")
    readln()
}

fun validarEntrada(): Int?{//vou tentar pegar um número do usuário e devolver ele. Mas às vezes, posso devolver nada (isso é o Int?, que pode ser um número ou nada).
    var input = readln()//fico esperando a pessoa digitar alguma coisa no teclado
    return if(input.isNullOrBlank()){// Se ela não digitou nada ou só apertou espaço, eu vou devolver nada (null)
        null
    }else{
        input.toIntOrNull()//tento transformar isso em um número! Se conseguir, devolvo o número. Se for uma palavra ou coisa errada, devolvo nada também.

    }
}



