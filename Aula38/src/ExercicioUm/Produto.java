package ExercicioUm;

import java.math.BigDecimal;

public class Produto {
    String nomeProduto;
    BigDecimal precoProduto;

    public Produto(String nomeProduto, BigDecimal precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }


    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }


    public void comprarProduto(Produto produto, BigDecimal menorPreco){
        if (produto.getPrecoProduto().equals(menorPreco)){
            System.out.println("Menor preço");
        }
        else {
            System.out.println("Maior preço");
        }
    }
}
