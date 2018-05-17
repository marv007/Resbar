/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ResbarLib;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Marvin
 */
public class ManejadorCategorias {
    public Conexion cn = new Conexion();
     ResultSet rs;
     Categoria c= new Categoria();
     Producto producto= new Producto();

    public Categoria[] Obtener(boolean obtener){
    
        Categoria[] categoria=null;
        Producto[] productos;
        int cuantos;
        
        try {
            rs=cn.getValores("SELECT * FROM categoria");
            rs.last();
            cuantos = rs.getRow();
            categoria = new Categoria[cuantos];
            rs=cn.getValores("SELECT * FROM categoria");
          
            while (rs.next()){
                
                c.idCategoria = rs.getInt("idCategoria");
                c.nombre=rs.getString("nombre");                
                
                
                if(obtener==true){
                  ResultSet rsP = cn.getValores("SELECT * FROM Producto WHERE idCategoria='"+rs.getInt("idCategoria")+"'");
                  rsP.last();
                  cuantos = rsP.getRow();
                  productos = new Producto[cuantos]; 
                  rsP.first();
                  rsP = cn.getValores("SELECT * FROM Producto WHERE idCategoria='"+rs.getInt("idCategoria")+"'");
                  while (rsP.next()){
                      producto.idProducto=rsP.getInt("idProducto");
                      producto.nombre=rsP.getString("nombre");
                      producto.precio=rsP.getDouble("precio");
                      producto.area=rsP.getString("area").toCharArray()[0];
                      productos[rsP.getRow()-1]=new Producto(producto.idProducto, producto.nombre, producto.precio, c, producto.area);
                  }
                  c.productos=productos;
                }
                
                categoria[rs.getRow()-1]=new Categoria(c.idCategoria, c.nombre, c.productos);
            }
        } catch (SQLException ex) {
            
        }
       return categoria; 
    }
    
    public void Actualizar(Categoria c){
        cn.UID("UPDATE Categoria SET nombre='"+c.nombre+"' WHERE idCategoria='"+c.idCategoria+"'");
    }
    
    public void Insertar(Categoria c){
        cn.UID("INSERT INTO Categoria(idCategoria, nombre) VALUES('"+c.idCategoria+"' ,'"+c.nombre+"')");
    }
    
    public void Eliminar(Categoria c){
        cn.UID("DELETE FROM Categoria FROM idCategoria='"+c.idCategoria+"'");
    }
    
    public int ObtenerID(){
        int id=0;
        try {
            rs=cn.getValores("SELECT idCategoria FROM categoria");
            rs.last();
            id= (rs.getInt("idCategoria")+1);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
