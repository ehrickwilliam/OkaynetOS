/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import br.com.okaynet.andare.conexao.Conexao;
import br.com.okaynet.andare.conexao.HibernateConfiguration;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ehrickwilliam
 */
public class testeParametro {

    public static void main(String[] args) {
        HibernateConfiguration.setBase("andare");
        HibernateConfiguration.setHost("127.0.0.1:3306");
        HibernateConfiguration.setPass("root");
        HibernateConfiguration.setUser("root");

        Connection conexao;
        try {
            conexao = Conexao.getConnection();
            conexao.createStatement().execute("use " + HibernateConfiguration.getBase());
            ResultSet executeQuery = conexao.createStatement().executeQuery("SELECT\n"
                    + "     endereco.`id` AS endereco_id,\n"
                    + "     endereco.`bairro` AS endereco_bairro,\n"
                    + "     endereco.`cep` AS endereco_cep,\n"
                    + "     endereco.`cidade` AS endereco_cidade,\n"
                    + "     endereco.`complemento` AS endereco_complemento,\n"
                    + "     endereco.`logradouro` AS endereco_logradouro,\n"
                    + "     endereco.`numero` AS endereco_numero,\n"
                    + "     endereco.`telefone1` AS endereco_telefone1,\n"
                    + "     endereco.`telefone2` AS endereco_telefone2,\n"
                    + "     endereco.`telefone3` AS endereco_telefone3,\n"
                    + "     endereco.`tipoLogradouro` AS endereco_tipoLogradouro,\n"
                    + "     ordemservico.`id` AS ordemservico_id,\n"
                    + "     ordemservico.`banco` AS ordemservico_banco,\n"
                    + "     ordemservico.`dataCadastro` AS ordemservico_dataCadastro,\n"
                    + "     ordemservico.`dataVencimento` AS ordemservico_dataVencimento,\n"
                    + "     ordemservico.`descricao` AS ordemservico_descricao,\n"
                    + "     ordemservico.`juros` AS ordemservico_juros,\n"
                    + "     ordemservico.`parcelas` AS ordemservico_parcelas,\n"
                    + "     ordemservico.`parcelasRestantes` AS ordemservico_parcelasRestantes,\n"
                    + "     ordemservico.`status` AS ordemservico_status,\n"
                    + "     ordemservico.`tipoCheque` AS ordemservico_tipoCheque,\n"
                    + "     ordemservico.`valor` AS ordemservico_valor,\n"
                    + "     ordemservico.`valorPorExtenso` AS ordemservico_valorPorExtenso,\n"
                    + "     ordemservico.`cliente_id` AS ordemservico_cliente_id,\n"
                    + "     ordemservico.`endereco_id` AS ordemservico_endereco_id,\n"
                    + "     ordemservico.`funcionario_id` AS ordemservico_funcionario_id,\n"
                    + "     pessoa.`DTYPE` AS pessoa_DTYPE,\n"
                    + "     pessoa.`id` AS pessoa_id,\n"
                    + "     pessoa.`dataCadastro` AS pessoa_dataCadastro,\n"
                    + "     pessoa.`email` AS pessoa_email,\n"
                    + "     pessoa.`cpf` AS pessoa_cpf,\n"
                    + "     pessoa.`nascimento` AS pessoa_nascimento,\n"
                    + "     pessoa.`nome` AS pessoa_nome,\n"
                    + "     pessoa.`rg` AS pessoa_rg,\n"
                    + "     pessoa.`sobrenome` AS pessoa_sobrenome,\n"
                    + "     pessoa.`cnpj` AS pessoa_cnpj,\n"
                    + "     pessoa.`inscricao` AS pessoa_inscricao,\n"
                    + "     pessoa.`razaoSocial` AS pessoa_razaoSocial,\n"
                    + "     pessoa.`responsavel` AS pessoa_responsavel,\n"
                    + "     pessoa.`referencia1` AS pessoa_referencia1,\n"
                    + "     pessoa.`referencia2` AS pessoa_referencia2,\n"
                    + "     pessoa.`referencia3` AS pessoa_referencia3,\n"
                    + "     pessoa.`endereco_id` AS pessoa_endereco_id\n"
                    + "FROM\n"
                    + "     `pessoa` pessoa INNER JOIN `ordemservico` ordemservico ON pessoa.`id` = ordemservico.`cliente_id`\n"
                    + "     INNER JOIN `endereco` endereco ON ordemservico.`endereco_id` = endereco.`id`\n"
                    + "WHERE\n"
                    + "     ordemservico.`id` = 7");

          
            JRResultSetDataSource jrRS = new JRResultSetDataSource(executeQuery);

            
            String jasperPrint;
            try {
                JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório", true);
                viewer.setSize(900, 600);
                viewer.setLocationRelativeTo(null);
                jasperPrint = JasperFillManager.fillReportToFile("C:\\Okaynet\\Andare\\images\\OrdemServicoComplexaFisico.jasper", null, jrRS); //Aqui vc chama o relatório
                JasperViewer jrviewer = new JasperViewer(jasperPrint, false, false);

                viewer.getContentPane().add(jrviewer.getContentPane());
                viewer.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(testeParametro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
