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
public class ManejadorCategorias {

    private boolean obtener;
    private Categoria[] actualizar;
    private Categoria[] insertar;
    private Categoria[] eliminar;
    private int obtenerID;
    
    //constructor
    ManejadorCategorias(){
        
    }
    
    ManejadorCategorias(boolean obtener, Categoria[] actualizar, Categoria[] insertar,
                         Categoria[] eliminar, int obtenerID){
        this.obtener=obtener;
        this.actualizar=actualizar;
        this.insertar=insertar;
        this.eliminar=eliminar;
        this.obtenerID=obtenerID;
    }

    /**
     * @return the obtener
     */
    public boolean isObtener() {
        return obtener;
    }

    /**
     * @param obtener the obtener to set
     */
    public void setObtener(boolean obtener) {
        this.obtener = obtener;
    }

    /**
     * @return the actualizar
     */
    public Categoria[] getActualizar() {
        return actualizar;
    }

    /**
     * @param actualizar the actualizar to set
     */
    public void setActualizar(Categoria[] actualizar) {
        this.actualizar = actualizar;
    }

    /**
     * @return the insetar
     */
    public Categoria[] getInsertar() {
        return insertar;
    }

    /**
     * @param insetar the insetar to set
     */
    public void setInsertar(Categoria[] insetar) {
        this.insertar = insetar;
    }

    /**
     * @return the eliminar
     */
    public Categoria[] getEliminar() {
        return eliminar;
    }

    /**
     * @param eliminar the eliminar to set
     */
    public void setEliminar(Categoria[] eliminar) {
        this.eliminar = eliminar;
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
