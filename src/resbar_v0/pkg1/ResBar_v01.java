/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resbar_v0.pkg1;

import ResbarLib.Categoria;
import ResbarLib.ManejadorCategorias;
import ResbarLib.Producto;
import formularios.frmDashboard;



/**
 *
 * @author user
 */
public class ResBar_v01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        frmDashboard v = new frmDashboard();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        */
        
       ManejadorCategorias m = new ManejadorCategorias();
       Categoria categorias[];
       Categoria c = new Categoria();
       Producto[] productos;
       
       categorias=m.Obtener(true);
       
       
       
        for (Categoria categoria : categorias) {
            System.out.print(categoria.idCategoria);
            System.out.print(" " + categoria.nombre);
            System.out.println();
            productos = categoria.productos;
           for (Producto producto : productos) {
               System.out.print(producto.nombre);
               System.out.println();
           }
           System.out.println();
           System.out.println();
        }
        //m.Obtener(false);
       
       
       
       
    
    }

}
