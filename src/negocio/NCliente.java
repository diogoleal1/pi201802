/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Cliente;
import java.sql.SQLException;
import persistencia.PCliente;

/**
 *
 * @author diogo
 */
public class NCliente {
    
    PCliente persistencia;
    
    public NCliente(){
        persistencia = new PCliente();
    }
    
    
    public Cliente consulta(String parametro) throws SQLException{
        return persistencia.consulta(parametro);         
    }
    
    public boolean clienteCadastrado(String parametro) throws SQLException{
        return persistencia.clienteCadastrado(parametro);         
    } 
    
    
}
