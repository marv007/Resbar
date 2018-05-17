/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ResbarLib;

/**
 *
 * @author user
 */
public class Categoria {

    public Categoria(int idCategoria, String nombre, Producto[] productos) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.productos = productos;
    }
    
    public Categoria() {
        
    }

   public int idCategoria;
   public String nombre;
   public  Producto[] productos;

    

    

    
    
    
}
