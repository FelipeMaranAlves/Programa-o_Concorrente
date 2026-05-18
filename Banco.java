public class Banco {
    private Conta[] contas;
    private int indexC;

    public Banco(){
        this.contas = new Conta[100];
        this.indexC = 0;
    }
    public void cadastrar(Conta c){
        if (indexC > 100){throw new RuntimeException("Lmite de contas atingido");        }
        this.contas[indexC+1] = c;
        this.indexC += 1;
    }

    public void creditar(String num, double valor){
        for(int i = 0;i < indexC;i++){
            if (contas[i].getNumero() == num){
                contas[i].creditar(valor);
            }
        }
        //aq deveria por um erro tipo como qunado eu do um throw runtimeexception mas teria que ser outra coisa
    }

    public void debitar(String num,double valor){
        for(int i = 0;i < indexC;i++){
            if (contas[i].getNumero() == num){
                contas[i].debitar(valor);
            }
        }
    }

    public double getSaldo(String num,double valor){
        for(int i=0;i < indexC;i++){
            if(contas[i].getNumero() == num){
                return contas[i].getSaldo();
            }
        }
    }
}
