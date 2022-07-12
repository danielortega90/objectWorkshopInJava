/*
 Taller de Objetos en java
 */
package objetoenjava;

/**
 *
 * @author Daniel CAVS
 */
public class BankAccount {
     //class attributes
    private int accountNumber;
    protected boolean activated;
    
    //get y set  class

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    
    
    // builder

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", activated=" + activated + '}';
    }
    
    //methods
    
    public void status(){
        if (activated == true) {
            System.out.println("account enabled");
        }else
            System.out.println("disabled account");
    
    }
    
    
}
