/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public abstract class Pet{

    public String id;
    public String name;
    public String hairColor;
    
    public Pet(){}

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
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

    public abstract String sound();
    
     @Override
        public String toString() {
            return "id: " + id + "nombre: " + name + "Color Cabello: "  + hairColor;
        }

}
