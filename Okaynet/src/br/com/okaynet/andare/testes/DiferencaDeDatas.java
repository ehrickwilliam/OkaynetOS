/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ehrickwilliam
 */
public class DiferencaDeDatas {
    
    public static void main(String[] args) {
     
       
        GregorianCalendar ini = new GregorianCalendar();  
        GregorianCalendar fim = new GregorianCalendar();  
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");  
        try {  
            ini.setTime(sdf.parse("25/07/2013"));
            fim.setTime(sdf.parse("26/07/2013"));  
        } catch (ParseException ex) {
            Logger.getLogger(DiferencaDeDatas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long dt1 = ini.getTimeInMillis();  
        long dt2 = fim.getTimeInMillis();  
        System.out.println( (((dt2 - dt1) / 86400000)+1));
  
        
    }
    
}
