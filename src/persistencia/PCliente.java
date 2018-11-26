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

    public Cliente consulta(String parametro) throws SQLException {

        String sql = " SELECT codigo, cpf, nome, rua, lote, quadra FROM cliente "
                + " WHERE cpf = ?";

        Connection conexao = util.Conexao.getConexao();
        PreparedStatement prd = conexao.prepareStatement(sql);
        prd.setString(1, parametro);

        ResultSet rs = prd.executeQuery();

        Cliente retorno = new Cliente();

        if (rs.next()) {
            retorno.getU().setCpf(rs.getString("cpf"));
            retorno.getU().setCodigo(rs.getInt("codigo"));
            retorno.getU().setNome(rs.getString("nome"));
            retorno.getU().setRua(rs.getString("rua"));
            retorno.getU().setLote(rs.getString("lote"));
            retorno.getU().setQuadra(rs.getString("quadra"));

        }
        return retorno;
    }

    public boolean clienteCadastrado(String parametro) throws SQLException {
        String sql = " SELECT  codigo qtde FROM cliente "
                + " WHERE cpf = ?";

        Connection conexao = util.Conexao.getConexao();
        PreparedStatement prd = conexao.prepareStatement(sql);
        prd.setString(1, parametro);
        ResultSet rs = prd.executeQuery();

        if (rs.next()) {
            return true;
        }
        return false;

    }

}
