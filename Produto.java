package Mod2.ProjetoFinal;

public class Produto {
    String nome;
    Double precoUnitario;

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.precoUnitario = preco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    Double desconto(){
        return 0.0;
    }

    Double taxa(){
        return 0.;
    }

    Double frete(){
        return 0.;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    
    Double getPrecoFinal(){
        return this.precoUnitario*(1-desconto())*(1+taxa());
    }

    public String getId(){
        return this.nome;
    } 

    
}
