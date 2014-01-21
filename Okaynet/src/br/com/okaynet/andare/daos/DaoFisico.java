/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.Fisico;

/**
 *
 * @author Erick
 */
public class DaoFisico extends DaoGenerics<Fisico> {

    public DaoFisico() {
        super.alvo = Fisico.class;
    }
}
