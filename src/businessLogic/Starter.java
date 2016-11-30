/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import parcial_vet.Clases.Pet;
import parcial_vet.Clases.Dog;
import parcial_vet.Clases.Cat;
import parcial_vet.Clases.Hamster;
import parcial_vet.Clases.Person;
import parcial_vet.Clases.Vet;
/**
 *
 * @author Usuario
 */
public class Starter {


    public static void readPets( Vet v ){
       try{
         File file = new File("pets.txt");
         Scanner scanner = new Scanner(file);
         int con = 0;
         Pet p = null;
         Person d = null;
         while (scanner.hasNextLine()) {      
           if (con % 2 == 0){
            String animales = scanner.nextLine();
            String[] a = animales.split(" ");
            for(int i = 0; i < 1; i++){
                if(a[i].equals("Dog")){
                    String id = a[1];
                    String nombre = a[2];
                    String colorPelo = a[3];
                    String raza = a[4];
                    p = new Dog(id, nombre, colorPelo, raza);
                    con++;
                }else if(a[i].equals("Cat")){
                    String id = a[1];
                    String nombre = a[2];
                    String colorPelo = a[3];
                    boolean cazador = Boolean.valueOf(a[4]);
                    p = new Cat(id, nombre, colorPelo, cazador);
                    con++;
                }else if(a[i].equals("Hamster")){
                    String id = a[1];
                    String nombre = a[2];
                    String colorPelo = a[3];
                    double peso = Double.parseDouble(a[4]);
                    p = new Hamster(id, nombre, colorPelo, peso);
                    con++;
                }
            }
           }
            else{
                    
               String duenos = scanner.nextLine();
               String[] b = duenos.split(" ");
               String id = b[1];
               String nombre = b[0];
               
               boolean personExists = false;
            for( int i = 0; i < v.getPerson().size(); i++ ){
                if( v.getPerson().get(i).getName().equals(nombre) ){
                     v.getPerson().get(i).addPet(p);
                     personExists = true;
                }
            }            
            
            if( !personExists ){
                Person pe = new Person(nombre, id);
                pe.addPet(p);
                v.ingresarOwner(pe);
            }
               v.ingresarPet(p);
               con++;
                    
                }           
           }     
         scanner.close();
//         v.ingresarPet(p);
//         v.ingresarOwner(d);
                 }catch(Exception e){
                   System.out.println(e + "Error de Archivo");
       }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Vet v = new Vet();
       String action = "";
      Scanner scanner = new Scanner(System.in);
        
       readPets(v);

       System.out.println("--Seleccione una Opción:---");
       System.out.println("1 - Remover Mascota");
       System.out.println("2 - Listar Mascotas por dueño");
       System.out.println("3 - Listar Mascotas por tipo");
       System.out.println("4 - Salir y Listar todos");
       
       action = scanner.nextLine();
       manageVet(v, action);
       
    }
    
    public static void manageVet( Vet v, String action ){
    Scanner reader = new Scanner(System.in);  // Reading from System.in
     
    if (action.equals("1")){
           System.out.println("ID: ");
           String id = reader.nextLine();
           v.removePet(id);
       }   
    if (action.equals("2")){
           System.out.println("ID: ");
           String id = reader.nextLine();
           v.showPetsByPersonId(id);
       }
    if (action.equals("3")){
           System.out.println("Tipo: ");
           String type = reader.nextLine();
           v.showPetsType(type);
       }
    
     if (action.equals("4")){
           v.showPets();
       }
    }

}
