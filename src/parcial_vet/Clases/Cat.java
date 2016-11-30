/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

/**
 *
 * @author Usuario
 */
public class Cat extends Pet{

    public boolean isHunter;

    public Cat(String id, String name, String hairColor, boolean isHunter) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    public boolean isIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    @Override
    public String sound(){
       return "miau";
    }
    
     public String toString(){
        String cazador;
        if( isHunter ){
            cazador = "Si";
        }
        else{
            cazador = "No";
        }            
        
        return super.toString() + " - Cazador: " + cazador;
    }

}
