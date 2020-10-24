package modulo3.orientacaoObjetos.entidades;

import java.util.Date;

public final class Professor extends Pessoa{
    //Esse FINAL indica que essa classe não pode ser utilizada como herança (extends) por outra
    
    //private String nome;
    //private String CPF;
    //private String telefone;
    //private String endereco;
    private Date dataAdmissao;




    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
