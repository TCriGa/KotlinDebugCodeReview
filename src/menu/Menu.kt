package src.menu

import src.estoque.Estoque
import kotlin.system.exitProcess

class Menu {

    private val estoque = Estoque()
    private fun menuPrincipal() {

        println("O que deseja fazer?")
        println("1 - Cadastrar novo item")
        println("2 - Ver lista de itens disponíveis para compra")
        println("3 - Verificar se o item já foi cadastrado")
        println("4 - Dar baixa em um item")
        println("5 - Sair do programa")

        //TODO:deixar sem o try/catch para avaliar se a galera percebe que dá problema de entrada de dado se for string
    }


    fun opcaoMenu() {

        do {
            menuPrincipal()
            when (readln().toInt()) {
                1 -> {
                    estoque.registrarItem()

                }
                2 -> {
                    estoque.listarItens()


                }
                3 ->{
                    estoque.verificarItens()
                }
                4 -> {
                    estoque.darBaixaItem()

                }

                4 -> exitProcess(0)
                else -> {
                    println("Opção inválida, tente novamente")
                }

            }
        } while (true)
    }
}


