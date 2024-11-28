/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Produtos_mgar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Produtos_mgarDAO extends DAO_Abstract {

    private Connection cnt;

    public Produtos_mgarDAO() {
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
        Produtos_mgar produtos_mgar = (Produtos_mgar) object;//declara bean

        try {
            String sql = "insert into produtos_mgar values(?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, produtos_mgar.getIdProdutos_mgar());
            pst.setString(2, produtos_mgar.getNome_mgar());
            pst.setString(3, produtos_mgar.getDataLancamento_mgar());
            pst.setString(4, produtos_mgar.getGenero_mgar());
            pst.setString(5, produtos_mgar.getPreco_mgar());
            pst.setString(6, produtos_mgar.getDiretor_mgar());
            pst.setString(7, produtos_mgar.getClassificacaoIdade_mgar());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void update(Object object) {
        Produtos_mgar produtos_mgar = (Produtos_mgar) object;

        try {
            String sql = "update usuario_mgar set nome_mgar=?, apelido_mgar=?,cpf_mgar=?,"
                    + "datanascimento_mgar=?, senha_mgar=?, nivel_mgar =?, ativo_mgar=? "
                    + "where idusuarios_mgar = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(7, produtos_mgar.getIdProdutos_mgar());
            pst.setString(1, produtos_mgar.getNome_mgar());
            pst.setString(2, produtos_mgar.getDataLancamento_mgar());
            pst.setString(3, produtos_mgar.getGenero_mgar());
            pst.setString(4, produtos_mgar.getPreco_mgar());
            pst.setString(5, produtos_mgar.getDiretor_mgar());
            pst.setString(6, produtos_mgar.getClassificacaoIdade_mgar());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void delete(Object object) {
        Produtos_mgar produtos_mgar = (Produtos_mgar) object;

        try {

            String sql = "delete from  produtos_mgar where idProdutos_mgar = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, produtos_mgar.getIdProdutos_mgar());

            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro Class:" + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public Object list(int id) {
        Produtos_mgar produtos_mgar = new Produtos_mgar();
        try {
            String sql = "select * from produtos_mgar where idProdutos_mgar =?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                produtos_mgar.setIdProdutos_mgar(rs.getInt("idProdutos_mgar"));
                produtos_mgar.setNome_mgar(rs.getString("Nome_mgar"));
                produtos_mgar.setDataLancamento_mgar(rs.getString("dataLancamento_mgar"));
                produtos_mgar.setGenero_mgar(rs.getString("genero_mgar"));
                produtos_mgar.setPreco_mgar(rs.getString("preco_mgar"));
                produtos_mgar.setDiretor_mgar(rs.getString("diretor_mgar"));
                produtos_mgar.setClassificacaoIdade_mgar(rs.getString("classificacaoIdade_mgar"));
            
            }
        } catch (SQLException ex) {
            System.out.println("Erro de SQL" + ex.getMessage());
        }
        return produtos_mgar;
    }

    @Override
    public ArrayList listAll() {
        return null;
    }
}
