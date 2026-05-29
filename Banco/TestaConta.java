package Banco;
public class TestaConta {
  public static void main(String[] args) {
    Conta c = new Conta("123-X");
    // Conta c = new Conta("123-X");
    System.out.println("Conta "+c.getNumero());
    System.out.println(" saldo "+c.getSaldo());
    System.out.println();
    c.creditar(10.01);
    try{c.debitar(5.01);}
    catch(SIException e){}
    finally{}
    System.out.println("Conta "+c.getNumero());
    System.out.println(" saldo "+c.getSaldo());
  } 
}
