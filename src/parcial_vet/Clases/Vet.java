/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

import java.util.ArrayList;
import java.util.HashMap;
import parcial_vet.Clases.Pet;
import parcial_vet.Clases.Person;

/**
 *
 * @author Usuario
 */
public class Vet{
    
    private ArrayList<Pet> pets;
    private ArrayList<Person> person;
    
    public Vet() {
        pets = new ArrayList();
        person = new ArrayList();
    }
    
    

    public void removePet(String id){
        
        for( int i = 0; i < pets.size(); ++i ){
            Pet pet = pets.get(i);
            if( pet.getId().equals(id) ){                
                pets.remove(pet);
            }
        }

    }

    public void showPetsType(String type){

           if(type.equals("Dog")){
                for( Pet p : pets ){
                    if( p instanceof Dog ){
                        System.out.println(p);
                    }
                }
           }
           else if(type.equals("Cat")){
                for( Pet p : pets ){
                    if( p instanceof Cat ){
                        System.out.println(p);
                    }
                }
           }
           else if(type.equals("Hamster")){
                for( Pet p : pets ){
                    if( p instanceof Hamster ){
                        System.out.println(p);
                    }
                }
           }
        }
   
    
    
    public void showPets(){
    for( Pet p : getPets() ){
            System.out.println(p);  
     }
    }
    
    public void ingresarPet(Pet d){
        
       boolean sameId = false;
        for( Pet p : pets ){
            if( p.getId().equals(d.getId()) ){
                System.out.println( new IllegalArgumentException() );
                sameId = true;
            }
        }
        
        if( !sameId ){
            pets.add(d);
        }
    }
               
    
        
       public void ingresarOwner(Person p){
          person.add(p);
       }
         
       
        public void showPetsByPersonId( String id ){
         for( Person p : person ){
            if( p.getId().equals(id) ){
                p.showPets();
            }
        }
            
        }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
        
        
        
        
    }

    
   



