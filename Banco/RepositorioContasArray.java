package Banco;
public class RepositorioContasArray implements RepositorioContas{
    private ContaAbstrata[] contas;
    private int indexC;
    public RepositorioContasArray(int size){
        contas = new ContaAbstrata[100];
        indexC = size -1;
    }
    public ContaAbstrata procurar(String numero) throws CNEException{
        for (int i = 0; i < indexC; i++){
            if (contas[i].getNumero().equals(numero)) {
                return contas[i];
            }
        }
        CNEException e;e = new CNEException();
        throw e;
    }
    public void inserir(ContaAbstrata conta){ // nao checo o tamanho restante do array, vai dar problema
        this.contas[indexC+1] = conta;
        this.indexC += 1;
    }

    public void remover(String numero){
        int index = -1;
        for (int i = 0; i < indexC; i++){
        if (contas[i].getNumero().equals(numero)) {
            contas[i] = null;
            index = i;
            }
        }
        for (int j = index; j < indexC; j++){ //checar indice
            contas[j] = contas[j+1];
        }
    }
    public void atualizar(ContaAbstrata conta){
        for (int i = 0; i < indexC; i++){
            if (contas[i].getNumero().equals(conta.getNumero())) {
                contas[i] = conta;
            }
        }
    }
    public boolean existe(String numero){
        try{procurar(numero);}
        catch(CNEException e){}
        finally{}
        return false;
    }
}
