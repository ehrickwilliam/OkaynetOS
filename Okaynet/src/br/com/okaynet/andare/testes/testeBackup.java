/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ehrickwilliam
 */
public class testeBackup {
    public static void main(String[] args) {
         String[] pp = new String[]{"cmd.exe", "/c", "mysqldump --host=localhost --user=root --opt --password=root --andare > backup.sql"};
        try {
            Runtime.getRuntime().exec(pp);
        } catch (IOException ex) {
            Logger.getLogger(testeBackup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}