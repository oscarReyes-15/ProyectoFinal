/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;

/**
 *
 * @author LENOVO
 */
public class User {
    
   String Nombre, Contra;
    int puntos = 0;
    
    //Constructor
    public User(String Nombre, String Contra){
        this.Nombre = Nombre;
        this.Contra = Contra;
        this.puntos = puntos;
    }

    //retorna user
    String getUser(){
        if (Nombre == null){
            return "";
        } else {return Nombre;}
    }
    
    //ritorna Contra
    String getContra(){
        return Contra;
    }
    
    //retorna puntos
    int getPuntos(){
        return puntos;
    }
    
    // suma a puntos
    void addPuntos(){
        this.puntos += 3;
    }    
}


class Users {
    //Variables
    static User[] UserArray = new User[10];
    static User U;
    static int ID = 0;
    
    
    //Registrar
    static String registrarUser(String User, String Contra){
        UserArray[ID] = new User(User, Contra);
        System.out.println("User agregado: " + UserArray[ID].getUser());
        ID++;
        return UserArray[ID - 1].getUser();
    }
    
    //Valida y busca user
    static String getPos (String User){
        
      
        
        if (ID > 0){
            for (int i = 0; i < ID; i++){

                if (UserArray[i].getUser() != null && UserArray[i].getUser().equals(User)){
                    return UserArray[i].getUser();
                }

            }
        }
        return "";
    }

    //Valida y busca contra    
    static String getContra (String Contra){
         
        for (int i = 0; i < ID; i++){
            
            if (UserArray[i].getContra().equals(Contra)){
                return UserArray[i].getContra();
            }
            
        }
        return "No coincide o no existe";
    }
    
    
}


