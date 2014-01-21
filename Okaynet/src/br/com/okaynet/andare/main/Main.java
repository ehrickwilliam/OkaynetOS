/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.main;

import br.com.okaynet.andare.gui.JFrameLogin;

/**
 *
 * @author ehrickwilliam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameLogin login = new JFrameLogin();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }
}
