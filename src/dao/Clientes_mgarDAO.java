/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Clientes_mgar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Clientes_mgarDAO extends DAO_Abstract {

    private Connection cnt;

    public Clientes_mgarDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user, pass;
            //url = "jdbc:mysql://localhost:3306/db_maria_rojas";
            //user = "root";
            //pass = "";
            url = "jdbc:mysql://10.7.0.51:33062/db_maria_rojas";
            user = "maria_rojas";
            pass = "maria_rojas";
            cnt = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro de classe");
            System.exit(0);
        } catch (SQLException ex) {
            System.out.println("Erro SQL" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void insert(Object object) {
        Clientes_mgar clientes_mgar = (Clientes_mgar) object;//declara bean

        try {
            String sql = "insert into clientes_mgar values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, clientes_mgar.getIdClientes_mgar());
            pst.setString(2, clientes_mgar.getNome_mgar());
            pst.setString(3, clientes_mgar.getApelido_mgar());
            pst.setString(4, clientes_mgar.getEmail_mgar());
            pst.setString(5, clientes_mgar.getCpf_mgar());//usuarios.getDataNascimento());
            pst.setString(6, clientes_mgar.getRg_mgar());
            pst.setString(7, clientes_mgar.getNumeroCelular_mgar());
            pst.setString(8, clientes_mgar.getTelefoneResidencial_mgar());
            pst.setString(9, null);
            pst.setString(10, clientes_mgar.getEndereco_mgar());
            pst.setString(11, clientes_mgar.getEstado_mgar());
            pst.setString(12, clientes_mgar.getCidade_mgar());
            pst.setString(13, clientes_mgar.getBairro_mgar());
            pst.setString(14, clientes_mgar.getCep_mgar());
            pst.setString(15, null);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void update(Object object) {
        Clientes_mgar clientes_mgar = (Clientes_mgar) object;

        try {
            String sql = "update usuario_mgar set nome_mgar=?, apelido_mgar=?,cpf_mgar=?,"
                    + "datanascimento_mgar=?, senha_mgar=?, nivel_mgar =?, ativo_mgar=? "
                    + "where idusuarios_mgar = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, clientes_mgar.getIdClientes_mgar());
            pst.setString(2, clientes_mgar.getNome_mgar());
            pst.setString(3, clientes_mgar.getApelido_mgar());
            pst.setString(4, clientes_mgar.getEmail_mgar());
            pst.setString(5, clientes_mgar.getCpf_mgar());//usuarios.getDataNascimento());
            pst.setString(6, clientes_mgar.getRg_mgar());
            pst.setString(7, clientes_mgar.getNumeroCelular_mgar());
            pst.setString(8, clientes_mgar.getTelefoneResidencial_mgar());
            pst.setString(9, null);
            pst.setString(10, clientes_mgar.getEndereco_mgar());
            pst.setString(11, clientes_mgar.getEstado_mgar());
            pst.setString(12, clientes_mgar.getCidade_mgar());
            pst.setString(13, clientes_mgar.getBairro_mgar());
            pst.setString(14, clientes_mgar.getCep_mgar());
            pst.setString(15, null);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void delete(Object object) {
        Clientes_mgar clientes_mgar = (Clientes_mgar) object;

        try {

            String sql = "delete from  clientes_mgar where idClientes_mgar = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, clientes_mgar.getIdClientes_mgar());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public Object list(int id) {
        Clientes_mgar clientes_mgar = new Clientes_mgar();
        try {
            String sql = "select * from clientes_mgar where idClientes_mgar =?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                clientes_mgar.setIdClientes_mgar(rs.getInt("idClientes_mgar"));
                clientes_mgar.setNome_mgar(rs.getString("nome_mgar"));
                clientes_mgar.setApelido_mgar(rs.getString("apelido_mgar"));
                clientes_mgar.setEmail_mgar(rs.getString("email_mgar"));
                clientes_mgar.setCpf_mgar(rs.getString("cpf_mgar"));
                clientes_mgar.setCpf_mgar(rs.getString("cpf_mgar"));
                clientes_mgar.setNumeroCelular_mgar(rs.getString("numeroCelular_mgar"));
                clientes_mgar.setTelefoneResidencial_mgar(rs.getString("telefoneResidencial_mgar"));
                clientes_mgar.setDataNascimento_mgar(rs.getDate("dataNascimento_mgar"));
                clientes_mgar.setEndereco_mgar(rs.getString("endereco_mgar"));
                clientes_mgar.setEstado_mgar(rs.getString("estado_mgar"));
                clientes_mgar.setCidade_mgar(rs.getString("cidade_mgar"));
                clientes_mgar.setBairro_mgar(rs.getString("bairro_mgar"));
                clientes_mgar.setCep_mgar(rs.getString("cep_mgar"));
                clientes_mgar.setDataCadastro_mgar(rs.getDate("dataCadastro_mgar"));
                
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL" + ex.getMessage());
        }
        return clientes_mgar; 

    }

    @Override
    public ArrayList listAll() {
        return null;
    }
}
