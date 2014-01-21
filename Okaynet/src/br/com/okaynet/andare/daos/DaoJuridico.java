/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.Juridico;

/**
 *
 * @author Erick
 */
public class DaoJuridico extends DaoGenerics<Juridico> {

    public DaoJuridico() {
        super.alvo = Juridico.class;
    }
}