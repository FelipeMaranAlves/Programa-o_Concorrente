public class Conta extends ContaAbstrata{
    protected double saldo;
    protected String id;
    public Conta(String id){
            super(id);
    }
    @Override
    public void debitar (double deb) throws SIException {
        if (deb < saldo){SIException e; e = new SIException(id, saldo);throw e;}
        this.saldo -= deb;
    }
}