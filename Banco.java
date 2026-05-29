public class Banco extends RepositorioContasArray{
    private double taxaJuros;

    public ContaAbstrata findConta(String numero) throws CNEException
    {
        return procurar(numero);
    }
    public Banco(double taxaJurosBanco){
        super(100);
        taxaJuros = taxaJurosBanco;
    }
    public void cadastrar(Conta c) throws CJEExeption{
        String num = c.getNumero();
        try {findConta(num);
            throw new CJEExeption(num);
        }
        catch(CNEException e){
            inserir(c);
        }
    }

    public void creditar(String num, double valor) throws CNEException{
        findConta(num).creditar(valor);
    }

    public void debitar(String num,double valor)throws CNEException, SIException{
        findConta(num).debitar(valor);
    }

    public double getSaldo(String num) throws CNEException{
        return findConta(num).getSaldo();
    }

    public void renderJuros(String num) throws CNEException{
        ContaAbstrata c = findConta(num);
            if (c instanceof Poupanca){
                ((Poupanca) c).renderJuros(taxaJuros);
            }
            else {
                throw new RuntimeException("A conta não é poupança");
            }
        }

    public void renderBonus(String num) throws CNEException{
        ContaAbstrata c = findConta(num);
        if (c instanceof ContaEspecial){
            ((ContaEspecial)c).renderBonus();
        }
        else{
            throw new RuntimeException("A conta não é especial");
        }
   }
    public void trasferir(String num1, String num2, double valor){
    //transfere da conta com num1 para a conta com num2 o valor
    ContaAbstrata Conta1;
    ContaAbstrata Conta2;
    try{Conta1 = findConta(num1);}
    catch(CNEException e){return;}
    try{Conta2 = findConta(num2);}
    catch(CNEException e){return;}
    try{Conta1.debitar(valor);}
    catch(SIException e){}
    Conta2.creditar(valor);
   }
}
