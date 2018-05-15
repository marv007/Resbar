/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Frank
 */
public class ManejadorProductos {
    private int obtenerCategoria;
    private String buscar;
    private Producto[] insertar;
    private Producto[] actualizar;
    private Producto[] eliminar;
    private Producto[] obtener;
    private  int obtenerID;

    
    //constructor
    ManejadorProductos(){
        
    }
    
    ManejadorProductos(int obtenerCategoria,String buscar, Producto[] insertar,
                              Producto[]actualizar,Producto[]eliminar,Producto[]obtener, int obtenerID){
        this.obtenerCategoria=obtenerCategoria;
        this.buscar=buscar;
        this.insertar=insertar;
        this.actualizar=actualizar;
        this.eliminar=eliminar;
        this.obtener=obtener;
        this.obtenerID=obtenerID;
    }
    /**
     * @return the obtenerCategoria
     */
    public int getObtenerCategoria() {
        return obtenerCategoria;
    }

    /**
     * @param obtenerCategoria the obtenerCategoria to set
     */
    public void setObtenerCategoria(int obtenerCategoria) {
        this.obtenerCategoria = obtenerCategoria;
    }

    /**
     * @return the buscar
     */
    public String getBuscar() {
        return buscar;
    }

    /**
     * @param buscar the buscar to set
     */
    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    /**
     * @return the insertar
     */
    public Producto[] getInsertar() {
        return insertar;
    }

    /**
     * @param insertar the insertar to set
     */
    public void setInsertar(Producto[] insertar) {
        this.insertar = insertar;
    }

    /**
     * @return the actualizar
     */
    public Producto[] getActualizar() {
        return actualizar;
    }

    /**
     * @param actualizar the actualizar to set
     */
    public void setActualizar(Producto[] actualizar) {
        this.actualizar = actualizar;
    }

    /**
     * @return the eliminar
     */
    public Producto[] getEliminar() {
        return eliminar;
    }

    /**
     * @param eliminar the eliminar to set
     */
    public void setEliminar(Producto[] eliminar) {
        this.eliminar = eliminar;
    }

    /**
     * @return the obtener
     */
    public Producto[] getObtener() {
        return obtener;
    }

    /**
     * @param obtener the obtener to set
     */
    public void setObtener(Producto[] obtener) {
        this.obtener = obtener;
    }

    /**
     * @return the obtenerID
     */
    public int getObtenerID() {
        return obtenerID;
    }

    /**
     * @param obtenerID the obtenerID to set
     */
    public void setObtenerID(int obtenerID) {
        this.obtenerID = obtenerID;
    }
    
}
