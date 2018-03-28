/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesCalcu;

/**
 *
 * @author jairoartist
 */
public class metodosCalcu {
    
     public void get_Cadenas(String cadena){
         
       int tamaño = cadena.length();
       String sub;
       int inicio = 0;
       int fin = 0;
       int cuentaNumeros = 0;
         for (int i = 0; i < tamaño; i++) {
             sub = cadena.substring(i, i+2);
             if(sub.equals("+")||sub.equals("-")||sub.equals("/")||sub.equals("*")){
             cuentaNumeros = cuentaNumeros+1;
             }            
         }
       String[] numeros = new String[cuentaNumeros];
       
    }
    
}
