public class ContaImposto extends Conta{
    private static final double CPMF = 0.001;
    public ContaImposto(String num){
        super(num);
    }
    @Override
    public void debitar(double valor){
        double imposto = valor * CPMF;
        try{super.debitar(valor + imposto);}
        catch(SIException e){}
        finally{} 
    }
}
