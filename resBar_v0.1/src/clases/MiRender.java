/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author user
 */
public class MiRender extends DefaultTableCellRenderer{

    
    private static final long serialVersionUID = 1L;
    private Component componente;

 

        @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

    componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
       

 if (isSelected) {
         
    componente.setFont(componente.getFont().deriveFont( Font.BOLD)); 

 } 

   
        return componente;

    }
}
