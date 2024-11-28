/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Editora_mgar;
import bean.Usuarios_mgar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Editora_mgarDAO extends DAO_Abstract {

    private Connection cnt;

    public Editora_mgarDAO() {
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
        Editora_mgar editora_mgar = (Editora_mgar) object;//declara bean

        try {
            String sql = "insert into editora_mgar values(?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, editora_mgar.getIdEditora_mgar());
            pst.setString(2, editora_mgar.getNome_mgar());
            pst.setString(3, editora_mgar.getPaisOrigem_mgar());
            pst.setDate(4, null);
            pst.setString(5, editora_mgar.getSiteOficial_mgar());
            pst.setString(6, editora_mgar.getCeo_mgar());
            pst.setString(7, editora_mgar.getObservacoes_mgar());
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
        Editora_mgar editora_mgar = (Editora_mgar) object;

        try {

            String sql = "delete from  editora_mgar where idEditora_mgar = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, editora_mgar.getIdEditora_mgar());

            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public Object list(int id) {
        Editora_mgar editora_mgar = new Editora_mgar();
        try {
            String sql = "select * from editora_mgar where idEditora_mgar =?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                editora_mgar.setIdEditora_mgar(rs.getInt("idEditora_mgar"));
                editora_mgar.setNome_mgar(rs.getString("nome_mgar"));
                editora_mgar.setPaisOrigem_mgar(rs.getString("paisOrigem_mgar"));
                editora_mgar.setDataFundacao_mgar(rs.getDate("dataFundacao_mgar"));
                editora_mgar.setSiteOficial_mgar(rs.getString("siteOficial_mgar"));
                editora_mgar.setCeo_mgar(rs.getString("ceo_mgar"));
                editora_mgar.setObservacoes_mgar(rs.getString("observacoes_mgar"));
              
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL" + ex.getMessage());
        }
        return editora_mgar;
    }

    @Override
    public ArrayList listAll() {
        return null;
    }
}
