public interface RepositorioContas {
    void inserir(ContaAbstrata conta);
    ContaAbstrata procurar(String numero) throws CNEException;
    void remover(String numero);
    void atualizar(ContaAbstrata conta);
    boolean existe(String numero);
}