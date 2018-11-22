/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author diogo
 */
public class Cliente {
    private Usuario u;
    
    public Cliente(){
        u = new Usuario() {}; 
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    
    
}
