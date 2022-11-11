package Mod2.ProjetoFinal;

import java.util.Map;

public interface BaseDao<T, U> {
    public T buscarPorId(U id);//r
    public void salvar(T t);//c
    public Map<U, T> buscarTodos();//r
    public void update(T t);//u
    public void delete(T t);//d
}
