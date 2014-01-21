/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ehrickwilliam
 */
public class Datas {
    
    public static void main(String[] args) {
        Date data = new Date();  
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
        String dataFormatada = formatador.format(data);  
        System.out.println(dataFormatada);
    }
    
}
