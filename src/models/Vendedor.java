package models;

import java.util.Date;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.*;

@Entity
public class Vendedor {
    private String nome;
    private Date dataNascimento;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String telefone;
    private Date dataContratacao;

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKey
    private
    long vendedorId;

    private static final long serialVersionUID = 1L;

    public Long getId()
    {
        return serialVersionUID;
    }

    public Vendedor(String nome, Date dataNascimento, String endereco, String bairro, String cep, String cidade, String telefone, Date dataContratacao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.telefone = telefone;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

}
