/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Entity;

/**
 *
 * @author Erick
 */
@Entity
public class Juridico extends Pessoa implements Serializable {

    private String razaoSocial;
    private String cnpj;
    private String responsavel;
    private String inscricao;

    public Juridico() {
    }

    public Juridico(Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(id, endereco, email, dataCadastro);
    }

    public Juridico(String razaoSocial, String cnpj, String responsavel, String inscricao) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.inscricao = inscricao;
    }

    public Juridico(String razaoSocial, String cnpj, String responsavel, String inscricao, Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(id, endereco, email, dataCadastro);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.inscricao = inscricao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.razaoSocial);
        hash = 61 * hash + Objects.hashCode(this.cnpj);
        hash = 61 * hash + Objects.hashCode(this.responsavel);
        hash = 61 * hash + Objects.hashCode(this.inscricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juridico other = (Juridico) obj;
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.responsavel, other.responsavel)) {
            return false;
        }
        if (!Objects.equals(this.inscricao, other.inscricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Juridico{" + "razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", responsavel=" + responsavel + ", inscricao=" + inscricao + '}';
    }
}
