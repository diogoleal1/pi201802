/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author diogo
 */
public class PCliente {
    
    
    public Cliente consultaAbrirConta(int parametro) throws SQLException {

        String sql = " SELECT codigo, cpf, nome FROM cliente "
                    + " WHERE cpf = ?";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement ps = cnn.prepareStatement(sql);

        ps.setInt(1, parametro);

        ResultSet rs = ps.executeQuery();

        Cliente cliente = new Cliente();

        while (rs.next()) {
            cliente.getU().setCpf(rs.getString("cpf"));
            cliente.getU().setCodigo(rs.getInt("codigo"));
            cliente.getU().setNome(rs.getString("nome"));
        }

        return cliente;
    }

    
}
