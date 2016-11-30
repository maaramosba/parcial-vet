/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Person {

    public String name;
    public String id;
    ArrayList<Pet> pets;;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
        pets = new ArrayList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public void showPets(){
        for( Pet p : pets ){
            System.out.println(p);                    
        }            
    }
    
    public void addPet(Pet p){
        pets.add(p);
    }
    
}
