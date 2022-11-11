package Mod2.ProjetoFinal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Carrinho {
    Cliente cliente;
    Map<Produto,Integer> produtos;

    public Carrinho(){
        this.cliente = new Cliente();
        this.produtos = new HashMap<>();
    }

    void listar(){
        System.out.println(String.format("%15s %6s %7s %7s %7s", "produto" , "precoU" ,"qtd","frete" , "preçoT"));
        produtos.forEach((produto,quantidade)->{
            System.out.println(String.format("%15s %4.2f %7d       %3.2f %5.2f", produto , produto.precoUnitario ,quantidade,produto.frete(), produto.getPrecoFinal()*quantidade ));
        });
        System.out.println(String.format("Total:R$ %4.2f", this.total()));
    }

    void adcionar(Produto p, Integer i){
        produtos.put(p, i);
    }

    void alterar(Produto p, Integer i){
        adcionar(p, i);
    }

    void remover(Produto p){
        this.produtos.remove(p);
    }

    Double total(){
        Double total = 0d;
        for (Entry<Produto,Integer> p : produtos.entrySet()) {
            total+= p.getValue()*p.getKey().getPrecoFinal();
        }
        return total;
    }

    public static void main(String[] args) {
        Produto p1 = new Fruta("maçã",0.5);
        Produto p2 = new Fruta("banana",0.5);
        Produto p3 = new Verdura("alface", 2.0);
        Produto p4 = new Eletrodomestico("geladeira", 2000.);
        Carrinho carrinho = new Carrinho();
        carrinho.adcionar(p1, 3);
        carrinho.adcionar(p2, 2);
        carrinho.adcionar(p3, 1);
        carrinho.adcionar(p4, 3);

        carrinho.listar();
        carrinho.alterar(p4, 1);
        carrinho.listar();
    }
}
