/*
  Taller de Objetos en java
 */
package objetoenjava;

import java.util.ArrayList;

/**
 *
 * @author Daniel CAVS
 */
public class Fruit {
    
    //class attributes
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    
    //get y set  class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    // builder

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public Fruit() {
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", averageWeight=" + averageWeight + ", colors=" + colors + '}';
    }
    
}
