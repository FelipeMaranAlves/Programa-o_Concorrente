public class RepositorioContasArray implements RepositorioContas{
    private ContaAbstrata[] contas;
    private int indexC;
    public RepositorioContasArray(int size){
        contas = new ContaAbstrata[100];
        indexC = size -1;
    }
    public ContaAbstrata procurar(String numero){
        for (int i = 0; i < indexC; i++){
            if (contas[i].getNumero().equals(numero)) {
                return contas[i];
            }
        }
        return null;
    }
    public void inserir(ContaAbstrata conta){
        if (indexC > contas.length){throw new RuntimeException("Limite de contas atingido");        }
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
        if (procurar(numero) != null){return true;}
        return false;
    }
}
