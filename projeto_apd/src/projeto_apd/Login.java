/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_apd;


/**
 *
 * @author Usuario
 */
public class Login {

private administrador email;
private administrador senha;
    
    public void setUsuario(administrador email, administrador senha){
        this.email=email;
        this.senha=senha;
    }

    public administrador getEmail(){
        return email;
    }
    public administrador getSenha(){
        return senha;
    }    
}

       