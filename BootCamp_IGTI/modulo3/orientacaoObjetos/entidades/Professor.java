package modulo3.orientacaoObjetos.entidades;

import java.util.Date;

public class Professor {
    
    private String nome;
    private String CPF;
    private String telefone;
    private String endereco;
    private Date dataAdmissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }


    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
