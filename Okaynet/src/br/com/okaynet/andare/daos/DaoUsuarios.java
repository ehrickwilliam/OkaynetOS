/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.Usuarios;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Erick
 */
public class DaoUsuarios extends DaoGenerics<Usuarios> {

    public DaoUsuarios() {
        super.alvo = Usuarios.class;
    }

    public Usuarios autenticarUsuario(String usuario, String senha) {
        if (!usuario.trim().equals("")) {
            Query select = session.createQuery("From " + alvo.getSimpleName() + " where usuario = '" + usuario + "' AND senha = '" + senha + "'");
            return (Usuarios) select.uniqueResult();
        } else {
            return null;
        }
    }

    public Usuarios obterPorUsuario(String usuario) {
        Usuarios objeto = null;
        if (!usuario.equals("")) {
            Query select = session.createQuery("From " + alvo.getSimpleName() + " where usuario = '" + usuario + "'");
            objeto = (Usuarios) select.uniqueResult();
        }
        return objeto;
    }

    public List<Usuarios> obterNome(String text) {
        List<Usuarios> lista = null;
        if (text != null || !"".equals(text)) {

            Query query = session.createQuery("From "
                    + alvo.getSimpleName()
                    + " where usuario LIKE '"
                    + text + "%'");
            lista = query.list();

        }
        return lista;
    }
}
