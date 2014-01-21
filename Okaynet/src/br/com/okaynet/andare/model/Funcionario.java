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
public class Funcionario extends Fisico implements Serializable {

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String rg, String cpf, Calendar nascimento, Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(nome, sobrenome, rg, cpf, nascimento, id, endereco, email, dataCadastro);
    }

    @Override
    public String toString() {
        return super.getNome();
    }
}
