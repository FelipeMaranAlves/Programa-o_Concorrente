public class Banco extends RepositorioContasArray{
    private double taxaJuros;


    private ContaAbstrata findConta(String numero)
    {
        return procurar(numero);
    }
    public Banco(double taxaJurosBanco){
        super(100);
        taxaJuros = taxaJurosBanco;
    }
    public void cadastrar(Conta c){

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
        ContaAbstrata c = findConta(num);
            if (c instanceof Poupanca){
                ((Poupanca) c).renderJuros(taxaJuros);
            }
            else {
                throw new RuntimeException("A conta não é poupança");
            }
        }

    public void renderBonus(String num){
        ContaAbstrata c = findConta(num);
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
