/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author user
 */
public class Vendas_Produtos_mgar {
private int idVendas_produtos_mgar;
    private int fkVenda_mgar;
    private int fkProduto_mgar;
    private int quantidade_mgar;
    private String valor_unitario_mgar;
    
    /**
     * @return the idVendas_produtos_mgar
     */
    public int getIdVendas_produtos_mgar() {
        return idVendas_produtos_mgar;
    }

    /**
     * @param idVendas_produtos_mgar the idVendas_produtos_mgar to set
     */
    public void setIdVendas_produtos_mgar(int idVendas_produtos_mgar) {
        this.idVendas_produtos_mgar = idVendas_produtos_mgar;
    }

    /**
     * @return the fkVenda_mgar
     */
    public int getFkVenda_mgar() {
        return fkVenda_mgar;
    }

    /**
     * @param fkVenda_mgar the fkVenda_mgar to set
     */
    public void setFkVenda_mgar(int fkVenda_mgar) {
        this.fkVenda_mgar = fkVenda_mgar;
    }

    /**
     * @return the fkProduto_mgar
     */
    public int getFkProduto_mgar() {
        return fkProduto_mgar;
    }

    /**
     * @param fkProduto_mgar the fkProduto_mgar to set
     */
    public void setFkProduto_mgar(int fkProduto_mgar) {
        this.fkProduto_mgar = fkProduto_mgar;
    }

    /**
     * @return the quantidade_mgar
     */
    public int getQuantidade_mgar() {
        return quantidade_mgar;
    }

    /**
     * @param quantidade_mgar the quantidade_mgar to set
     */
    public void setQuantidade_mgar(int quantidade_mgar) {
        this.quantidade_mgar = quantidade_mgar;
    }

    /**
     * @return the valor_unitario_mgar
     */
    public String getValor_unitario_mgar() {
        return valor_unitario_mgar;
    }

    /**
     * @param valor_unitario_mgar the valor_unitario_mgar to set
     */
    public void setValor_unitario_mgar(String valor_unitario_mgar) {
        this.valor_unitario_mgar = valor_unitario_mgar;
    }
    
}
