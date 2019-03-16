package models;

import javax.jdo.annotations.ForeignKey;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Venda {
    private Date dataVenda;
    private double valorTotal;
    private String status;

    @ManyToOne
    private Vendedor vendedor;
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    private List<ItemVenda> listaProdutos;


    @Id
    @GeneratedValue
    @PrimaryKey
    long id;

    public Venda(Date dataVenda, double valorTotal, String status, Vendedor vendedor, Cliente cliente, List<ItemVenda> listaProdutos) {
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.status = status;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
    }

    private static final long serialVersionUID = 1L;

    public Long getId()
    {
        return serialVersionUID;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
