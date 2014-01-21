/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;

/**
 *
 * @author Erick
 */
@Entity
public class ClienteJuridico extends Juridico implements Serializable {

    public ClienteJuridico() {
    }


    public ClienteJuridico(Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(id, endereco, email, dataCadastro);
    }

    public ClienteJuridico(String razaoSocial, String cnpj, String responsavel, String inscricao) {
        super(razaoSocial, cnpj, responsavel, inscricao);
    }


    public ClienteJuridico(String razaoSocial, String cnpj, String responsavel, String inscricao, Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(razaoSocial, cnpj, responsavel, inscricao, id, endereco, email, dataCadastro);
    }

    @Override
    public String toString() {
        return super.getRazaoSocial();
    }
}
