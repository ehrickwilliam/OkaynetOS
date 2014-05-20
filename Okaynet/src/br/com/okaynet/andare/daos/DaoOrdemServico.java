/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.OrdemServico;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Erick
 */
public class DaoOrdemServico extends DaoGenerics<OrdemServico> {

    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM");
    String dataFormatada = formatador.format(data);
    SimpleDateFormat formatadorTotal = new SimpleDateFormat("yyyy-MM-dd");
    String dataFormatadaNormal = formatadorTotal.format(data);

    public DaoOrdemServico() {
        super.alvo = OrdemServico.class;
    }

    public List<OrdemServico> obter() {
        List<OrdemServico> lista = null;


        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
    
        public List<OrdemServico> obterT() {
        List<OrdemServico> lista = null;


        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
    
        public List<OrdemServico> obterUltima() {
        List<OrdemServico> lista = null;


        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterVencidas() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
    
        public List<OrdemServico> obterPagasConcluidasMes() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where status != 'Aguardando Pagamento' AND dataCadastro LIKE '%" + dataFormatada + "%' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
        
                public List<OrdemServico> obterPagasFaltandoMes() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where status = 'Aguardando Pagamento' AND dataCadastro LIKE '%" + dataFormatada + "%' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
                
                       public List<OrdemServico> obterPagasConcluidas() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where status != 'Aguardando Pagamento' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
        
                public List<OrdemServico> obterPagasFaltando() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where status = 'Aguardando Pagamento' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
    
    public List<OrdemServico> obterAVencer() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento > '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id");
        lista = query.list();
        return lista;
    }

    public Long count() {
        Query query = session.createQuery("select count(*) from "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id");
        return (Long) query.uniqueResult();
    }

    public List<OrdemServico> obterVencidasClientes(int id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND cliente.id = " + id + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterVencidasFuncionarios(int id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND funcionario.id = " + id + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterVencidasFuncionariosClientes(Integer id, Integer id0) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND funcionario.id = " + id + " AND cliente.id = " + id0 + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterVencidasId(String text) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND id LIKE '" + text + "' ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterId(String text) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND id LIKE '" + text + "' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterClientes(Integer id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%'AND cliente.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterFuncionariosClientes(Integer id, Integer id0) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND funcionario.id = " + id + " AND cliente.id = " + id0 + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterFuncionarios(Integer id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND funcionario.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
    
    public List<OrdemServico> obterOrdernsNaoConcluidas() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where statusDoServivo != 'Concluido e entregue' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterClientesID(Integer id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where cliente.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterFuncionariosID(Integer id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where funcionario.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;


    }

    public List<OrdemServico> obterDataCad(Calendar stringToCalendar) {

        SimpleDateFormat formatadorLocal = new SimpleDateFormat("yyyy-MM-dd");
        String dataTotal = formatadorLocal.format(stringToCalendar.getTime());

        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND dataCadastro LIKE '" + dataTotal + "' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterOSPorId(Integer id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterDataVencimento(Calendar stringToCalendar) {
        SimpleDateFormat formatadorLocal = new SimpleDateFormat("yyyy-MM-dd");
        String dataTotal = formatadorLocal.format(stringToCalendar.getTime());

        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento  LIKE '" + dataTotal + "' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
}
