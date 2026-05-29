public class CJEExeption extends Exception {
    String numero;
    CJEExeption(String numero){
        super("Conta " + numero  + " já existe"); 
    }
}
