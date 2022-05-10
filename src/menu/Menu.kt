package src.menu

import src.estoque.Estoque
import kotlin.system.exitProcess

class Menu {

    private val estoque = Estoque()
    private fun menuPrincipal() {

        println("O que deseja fazer?")
        println("1 - Cadastrar novo item")
        println("2 - Ver lista de itens disponíveis para compra")
        println("3 - Verificar códigos cadastrados")
        println("4 - Dar baixa em um item")
        println("5 - Sair do programa")

    }

    fun opcaoMenu() {
        try {
            do {
                menuPrincipal()
                when (readln().toInt()) {
                    1 -> {
                        estoque.registrarItem()

                    }
                    2 -> {
                        estoque.listarItens()


                    }
                    3 -> {
                        estoque.verificarItens()
                    }
                    4 -> {
                        estoque.darBaixaItem()

                    }

                    5 -> exitProcess(0)
                    else -> {
                        println("Opção inválida, tente novamente")
                    }

                }
            } while (true)
        }catch (ex:Exception){
            println("Caractere inválido.Digite novamente")
            opcaoMenu()
        }
    }

}


