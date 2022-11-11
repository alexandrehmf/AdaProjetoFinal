package Mod2.ProjetoFinal;

public class Fruta extends Produto{

    public Fruta(String nome, Double preco) {
        super(nome, preco);
    }

    Double desconto(){
        return .15;
    }

    Double taxa(){
        return .2;
    }

    Double getPrecoFinal(){
        return this.precoUnitario*(1-desconto())*(1+taxa());
    }
}
