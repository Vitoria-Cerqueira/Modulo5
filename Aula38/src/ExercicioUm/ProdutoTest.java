package ExercicioUm;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoTest {
    BigDecimal menorPreco = new BigDecimal("1.50");

    @Test
    public void TestarProdutoASerComprado(){
        Produto produto = new Produto("Caneta", new BigDecimal("1.50"));
        produto.comprarProduto(produto, menorPreco);
        assertEquals(menorPreco, produto.getPrecoProduto());
    }

    @Test
    public void TestarProdutoASerComprado2(){
        Produto produto2 = new Produto("Borracha", new BigDecimal("2.50"));
        produto2.comprarProduto(produto2, menorPreco);
        assertEquals(menorPreco, produto2.getPrecoProduto());
    }
    @Test
    public void TestarProdutoASerComprado3(){
        Produto produto3 = new Produto("Apontador", new BigDecimal("4.50"));
        produto3.comprarProduto(produto3, menorPreco);
        assertEquals(menorPreco, produto3.getPrecoProduto());
    }

}
