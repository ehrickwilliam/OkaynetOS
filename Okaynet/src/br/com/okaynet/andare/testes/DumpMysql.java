/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import br.com.okaynet.andare.conexao.HibernateConfiguration;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ehrickwilliam
 */
public class DumpMysql {

    public static void main(String[] args) {

        Date data = new Date();
        SimpleDateFormat formatadorTotal = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        String dataFormatadaNormal = formatadorTotal.format(data);
        try {
            String comando = "C:\\Arquivos de programas\\MySQL\\MySQL Server 5.6\\bin\\mysqldump.exe";
            ProcessBuilder pb = new ProcessBuilder(comando, "--user="+ HibernateConfiguration.getUser(), "--password="+HibernateConfiguration.getPass(), HibernateConfiguration.getBase(), "--result-file=C:\\Okaynet\\Andare\\Backup\\Backup_" + dataFormatadaNormal + ".sql");
            pb.start();
            JOptionPane.showMessageDialog(null, "Backup criado com sucesso !");
            try {
                Runtime.getRuntime().exec("explorer C:\\Okaynet\\Andare\\Backup\\");
            } catch (java.io.IOException ex) {
                JOptionPane.showMessageDialog(null, "Aconteceu algo inesperado ao executar o Backup!");
            }
        } catch (Exception exc) {
               JOptionPane.showMessageDialog(null, "Aconteceu algo inesperado ao executar o Backup!");
        }
    }
}
