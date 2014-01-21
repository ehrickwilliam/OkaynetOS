/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.ClienteJuridico;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Erick
 */
public class DaoClienteJuridico extends DaoGenerics<ClienteJuridico> {

    public DaoClienteJuridico() {
        super.alvo = ClienteJuridico.class;
    }

    public List<ClienteJuridico> obterRazao(String razao) {
        List<ClienteJuridico> lista = null;
        if (razao != null || !"".equals(razao)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where razaoSocial LIKE '"
                    + razao + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<ClienteJuridico> obterCnpj(String cnpj) {
        List<ClienteJuridico> lista = null;
        if (cnpj != null || !"".equals(cnpj)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where cnpj LIKE '"
                    + cnpj + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<ClienteJuridico> obterResponsavel(String responsavel) {
        List<ClienteJuridico> lista = null;
        if (responsavel != null || !"".equals(responsavel)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where responsavel LIKE '"
                    + responsavel + "%'");
            lista = query.list();
        }
        return lista;
    }

    public List<ClienteJuridico> obterInsc(String insc) {
        List<ClienteJuridico> lista = null;
        if (insc != null || !"".equals(insc)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where inscricao LIKE '"
                    + insc + "%'");
            lista = query.list();
        }
        return lista;
    }
}
