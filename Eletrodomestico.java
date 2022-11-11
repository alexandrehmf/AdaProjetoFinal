package Mod2.ProjetoFinal;

public class Eletrodomestico extends Produto{

    public Eletrodomestico(String nome, Double preco) {
        super(nome, preco);
    }

    Double frete(){
        return 500.;
    }

    Double getPrecoFinal(){
        return this.precoUnitario*(1-desconto())*(1+taxa())+frete();
    }
}
