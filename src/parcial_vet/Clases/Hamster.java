/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

/**
 *
 * @author Usuario
 */
public class Hamster extends Pet {

    public double weight;

    public Hamster(String id, String name, String hairColor, double weight) {
        super(id, name, hairColor);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

      @Override
    public String sound(){
       return " ";
    }
    
    @Override
    public String toString(){
        return super.toString() + "Peso: " + weight;
    }
 


}
