/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.Funcionario;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Erick
 */
public class DaoFuncionario extends DaoGenerics<Funcionario> {

    public DaoFuncionario() {
        super.alvo = Funcionario.class;
    }

    public List<Funcionario> obterNome(String nome) {
        List<Funcionario> lista = null;
        if (nome != null || !"".equals(nome)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where nome LIKE '"
                    + nome + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<Funcionario> obterRg(String rg) {
        List<Funcionario> lista = null;
        if (rg != null || !"".equals(rg)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where rg LIKE '"
                    + rg + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<Funcionario> obterCpf(String cpf) {
        List<Funcionario> lista = null;
        if (cpf != null || !"".equals(cpf)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where cpf LIKE '"
                    + cpf + "%'");
            lista = query.list();
        }
        return lista;
    }
}
