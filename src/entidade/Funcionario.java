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
public class Funcionario {
    private String senha;
    private char tipo; // C -> caixa, A -> administrador, G - Gerente
    private Usuario u;
    
    public Funcionario(){
        u = new Usuario() {}; 
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    
    
}
