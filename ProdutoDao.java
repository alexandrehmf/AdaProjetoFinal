package Mod2.ProjetoFinal;

import java.util.HashMap;
import java.util.Map;

public class ProdutoDao implements BaseDao<Produto, String>{
    Map<String , Produto> produtos = new HashMap<>();
    
    @Override
    public Produto buscarPorId(String id) {
        return produtos.get(id);
    }

    @Override
    public Map<String , Produto> buscarTodos() {
        return this.produtos;
    }

    @Override
    public void delete(Produto t) {
        this.produtos.remove(t);
        
    }

    @Override
    public void salvar(Produto t) {
        this.produtos.put(t.nome, t);
        
    }

    @Override
    public void update(Produto t) {
        this.produtos.put(t.nome, t);
    }
    
}
