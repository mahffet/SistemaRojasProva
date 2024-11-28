/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Usuarios_mgar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuarios_mgarDAO extends DAO_Abstract {

    private Connection cnt;

    public Usuarios_mgarDAO() {
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
        Usuarios_mgar usuarios_mgar = (Usuarios_mgar) object;//declara bean

        try {
            String sql = "insert into usuarios_mgar values(?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, usuarios_mgar.getIdUsuarios_mgar());
            pst.setString(2, usuarios_mgar.getNome_mgar());
            pst.setString(3, usuarios_mgar.getApelido_mgar());
            pst.setString(4, usuarios_mgar.getCpf_mgar());
            pst.setString(5, null);//usuarios.getDataNascimento());
            pst.setString(6, usuarios_mgar.getSenha_mgar());
            pst.setInt(7, usuarios_mgar.getNivel_mgar());
            pst.setString(8, usuarios_mgar.getAtivo_mgar());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void update(Object object) {
        Usuarios_mgar usuarios_mgar = (Usuarios_mgar) object;

        try {
            String sql = "update usuario_mgar set nome_mgar=?, apelido_mgar=?,cpf_mgar=?,"
                    + "datanascimento_mgar=?, senha_mgar=?, nivel_mgar =?, ativo_mgar=? "
                    + "where idusuarios_mgar = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(8, usuarios_mgar.getIdUsuarios_mgar());
            pst.setString(1, usuarios_mgar.getNome_mgar());
            pst.setString(2, usuarios_mgar.getApelido_mgar());
            pst.setString(3, usuarios_mgar.getCpf_mgar());
            pst.setString(4, null);//usuarios.getDataNascimento());
            pst.setString(5, usuarios_mgar.getSenha_mgar());
            pst.setInt(6, usuarios_mgar.getNivel_mgar());
            pst.setString(7, usuarios_mgar.getAtivo_mgar());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void delete(Object object) {
        Usuarios_mgar usuarios_mgar = (Usuarios_mgar) object;

        try {

            String sql = "delete from  usuarios_mgar where idusuarios_mgar = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, usuarios_mgar.getIdUsuarios_mgar());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public Object list(int id) {
        Usuarios_mgar usuarios_mgar = new Usuarios_mgar();
        try {
            String sql = "select * from usuarios_mgar where idUsuarios_mgar =?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                usuarios_mgar.setIdUsuarios_mgar(rs.getInt("idUsuarios_mgar"));
                usuarios_mgar.setNome_mgar(rs.getString("nome_mgar"));
                usuarios_mgar.setApelido_mgar(rs.getString("apelido_mgar"));
                usuarios_mgar.setCpf_mgar(rs.getString("cpf_mgar"));
                usuarios_mgar.setDataNascimento_mgar(rs.getDate("dataNascimento_mgar"));
                usuarios_mgar.setSenha_mgar(rs.getString("senha_mgar"));
                usuarios_mgar.setNivel_mgar(rs.getInt("nivel_mgar"));
                usuarios_mgar.setAtivo_mgar(rs.getString("ativo_mgar"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL" + ex.getMessage());
        }
        return usuarios_mgar;
    }

    @Override
    public ArrayList listAll() {
        return null;
    }
}
