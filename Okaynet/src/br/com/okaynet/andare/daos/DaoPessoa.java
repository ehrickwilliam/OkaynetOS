/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.Pessoa;

/**
 *
 * @author Erick
 */
public class DaoPessoa extends DaoGenerics<Pessoa> {

    public DaoPessoa() {
        super.alvo = Pessoa.class;
    }
    
}
