public class TestaConta {
  public static void main(String[] args) {
    Conta c = new Conta("123-X", 8.01);
    // Conta c = new Conta("123-X");
    System.out.println("Conta "+c.getNumero());
    System.out.println(" saldo "+c.getSaldo());
    System.out.println();
    c.creditar(10.01);
    c.debitar(5.01);
    System.out.println("Conta "+c.getNumero());
    System.out.println(" saldo "+c.getSaldo());
  } 
}
