package src.item

import java.math.BigDecimal

open class Item(var codigo: Int = 0, private var nomeItem: String = "", private var preco: BigDecimal = BigDecimal.ZERO) {

    protected val valorDesconto: Int = 0;

    override fun toString(): String {
        return "código: $codigo | nome: $nomeItem | preço(R$) $preco";
    }
}


