package src.estoque

import src.item.Item
import java.math.BigDecimal


class Estoque : Item() {
    private val listaItem = mutableSetOf<Item>()
    fun registrarItem() {
        try {

            println("Digite o código do produto: ")
            codigo = readln().toInt()
            if (codigo < 0) {
                println("Números negativos não aceitos, digite novamente.")
                codigo = readln().toInt()
            }
            println("Digite o nome do produto: ")
            val nomeItem = readln()
            println("Digite o preco do produto: ")
            var preco = readln().toBigDecimal()
            if (preco < BigDecimal.ZERO) {
                println("Números negativos e inteiros não aceitos, digite novamente.")
                preco = readln().toBigDecimal()
            }

            val item = Item(codigo = codigo, nomeItem = nomeItem, preco = preco)
            listaItem.add(item);
            println("Item registrado com sucesso\n")

        } catch (ex: NumberFormatException) {
            println("Por favor, somente em números e positivos.")
        }

    }

    fun verificarItens() {
        println("Informe o nº do código:")
        val codigoItemAtual = readln().toInt()
        var temItem: Boolean
        listaItem.forEach {
            when (codigoItemAtual == it.codigo) {
                true -> {
                    temItem = true
                    println("Código indisponível, produtos já cadastrado = ${it.codigo} $temItem")
                } else -> temItem = false
            }
        }
            when(codigoItemAtual != codigo) {
                true -> println("Produto não cadastrado")
                else -> temItem = true
            }

    }


    fun listarItens() {
        if (listaItem.isEmpty()) {
            println("Não temos nenhum item cadastrado no momento")
        } else {
            println("Atualmente temos os seguintes itens: $listaItem")

        }
    }

    fun darBaixaItem() {
        print("Qual o código do item a dar baixa? ")
        val codigoItemADarBaixa = readln().toInt()
        for (item in listaItem) {
            if (codigoItemADarBaixa.equals(item.codigo)) {
                listaItem.remove(item)
                println("Item removido com sucesso")
            } else {
                println("Código inexistente.")
            }
            break
        }
    }

}





