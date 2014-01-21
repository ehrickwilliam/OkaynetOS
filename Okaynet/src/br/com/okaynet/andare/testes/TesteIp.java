/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author ehrickwilliam
 */
public class TesteIp {
    public static void main(String[] args) {
        try  
      {  
          System.out.println(InetAddress.getLocalHost().getHostAddress());  
      }  
      catch(UnknownHostException e)  
      {  
          
      }  
    }
}
