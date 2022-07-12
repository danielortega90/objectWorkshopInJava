// Taller de Objetos en java
package objetoenjava;

/**
 *
 * @author Daniel CAVS
 */
public class Account {
     //class attributes
    private int accountNumber;
    protected double balance =500;
    private  Client titular;
    //get y set  class

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getTitular() {
        return titular;
    }

    public void setTitular(Client titular) {
        this.titular = titular;
    }
    
    // builder

    public Account(int accountNumber, Client titular) {
        this.accountNumber = accountNumber;
        this.titular = titular;
    }

    public Account() {
    }
    
    //methods
    
    public double balanceAccount(){
        
        System.out.println("Balance : "+ balance);  
      return balance;
    }
    
}
