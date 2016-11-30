/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

/**
 *
 * @author Usuario
 */
public class Dog extends Pet {

    public String breed;

    
    public Dog(String id, String name, String hairColor, String breed) {
        super(id, name, hairColor);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

     @Override
    public String sound(){
       return "guau";
    }
    
    @Override
        public String toString() {
        return super.toString() + "Raza: " + breed;
    }
        }

    


