/*
   Taller de Objetos en java
 */
package objetoenjava;

import java.util.Date;

/**
 *
 * @author Daniel CAVS
 */
public class Person {
    //class attributes
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    private int dni;
    // get y set  class 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    // builder 
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height, int dni) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        this.dni = dni;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName1=" + lastName1 + ", lastName2=" + lastName2 + ", dateBirth=" + dateBirth + ", height=" + height + ", dni=" + dni + '}';
    }

   
    
    
    
    
}
