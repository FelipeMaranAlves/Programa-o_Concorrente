public class SIException extends Exception{
    private double saldo;
    private String numero;
    public SIException(String numero, double saldo){
        super("Saldo insuficiente");
        this.saldo = saldo;
        this.numero = numero;
    }
    public double getSaldo(){return this.saldo;}
    public String getNumero(){return this.numero;}
}
