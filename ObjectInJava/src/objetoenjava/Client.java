/*
  Taller de Objetos en java
 */
package objetoenjava;

/**
 *
 * @author Daniel CAVS
 */
public class Client {
    //class attributes
    public String name;
    private String lastName;
    
    //get y set  class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    
    // builder

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        
    }

    public Client() {
         name = "Daniel";
         lastName = "alfred";
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", lastName=" + lastName + '}';
    }
    
    //methods
   
    public String customerName(){
        System.out.println("My name is "+name); 
       return name;
    }
}
