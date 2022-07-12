/*
   Taller de Objetos en java
 */
package objetoenjava;

/**
 *
 * @author Daniel CAVS
 */
public class ObjetoEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Client c =new Client();
         c.customerName();
         
         BankAccount b =new BankAccount();
         b.status();
         
         Account a = new Account();
         
         a.balanceAccount();
         Drink d = new Drink();
         d.enterPrice();
         d.showPrice();
    }
    
}
