package ResbarLib;


public class Producto {

    public int idProducto;
    public String nombre;
    public double precio;
    public Categoria categoria;
    public char area;

    public Producto(int idProducto, String nombre, double precio, Categoria categoria, char area) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.area = area;
    }

    public Producto() {
    }
    
    
    
}
