public class Banco {
    private Conta[] contas;
    private int indexC;
    private double taxaJuros;


    private Conta findConta(String numero)
    {
        for (int i = 0; i < indexC; i++){
            if (contas[i].getNumero().equals(numero)) {
                return contas[i];
            }
        }
        return null;
    }
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
        findConta(num).creditar(valor);
    }

    public void debitar(String num,double valor){
        findConta(num).debitar(valor);
    }

    public double getSaldo(String num){
        return findConta(num).getSaldo();
    }

    public void renderJuros(String num){
        Conta c =findConta(num);
            if (c instanceof Poupanca){
                ((Poupanca) c).renderJuros(taxaJuros);
            }
            else {
                throw new RuntimeException("A conta não é poupança");
            }
        }

    public void renderBonus(String num){
        Conta c = findConta(num);
        if (c instanceof ContaEspecial){
            ((ContaEspecial)c).renderBonus();
        }
        else{
            throw new RuntimeException("A conta não é especial");
        }
   }
    //transfere da conta com num1 para a conta com num2 o valor
    public void trasferir(String num1, String num2, double valor){
    if (findConta(num1).getSaldo() < valor){throw new RuntimeException("Saldo insuficiente");}
    findConta(num1).debitar(valor);
    findConta(num2).creditar(valor);
   }
}
