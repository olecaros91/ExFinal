/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfinal;

/**
 *
 * @author Administrador
 */
public class ExFinal {

  private String usuario;
    private String pass;
    public ExFinal(){}
    /**
     * @param args the command line arguments
     */

    public void regitrarUsuario(String user, String password){
        if(user.equals(""))
            System.out.println("Ingrese usuario");
        else if(password.equals("")){
        System.out.println("Ingrese password");
        }
        else if(user.equals("") && password.equals("")){
            System.out.println("Credenciales invalidas");
        }
        else{
            this.usuario = user;
       this.pass = password;
        }
       
    }
    
    public String getUsuario(){
        return usuario;
    }
     public String getPass(){
        return pass;
    }
    
}
