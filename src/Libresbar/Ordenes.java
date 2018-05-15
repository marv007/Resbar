/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Libresbar;



/**
 *
 * @author Marvin
 */
public class Ordenes {

    int IdOrden;
    String mesero, mesa, cliente, comentario;
    double total;
    boolean activa;
    DetalleOrden[] detalle;
    Conexion cn = new Conexion();
    
    
    public double CalcularTotal() {
    
        total=0.0;
        for(int i=0; i<detalle.length; i++){
            total=total + (detalle[i].cantidad*detalle[i].producto.precio);
        }
        
        return total;
    }
    
    public void AgregarProducto(Producto producto){       
        
        cn.UID("INSERT INTO Producto(idProducto, idCategoria, nombre, precio, area) VALUES('"+producto.idProducto+"', '"+producto.categoria.idCategoria+"', "
                + "'"+producto.nombre+"', '"+producto.precio+"', '"+producto.area+"')" );
    }
    
    public void EliminarProducto(Producto producto){
        cn.UID("DELETE * FROM Producto WHERE idProducto='"+producto.idProducto+"'");
    }
}
