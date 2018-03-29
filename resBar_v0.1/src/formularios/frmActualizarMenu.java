/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jairoartist
 */
public class frmActualizarMenu extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    
    
    public frmActualizarMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
     pnPane1.setBackground(new Color(213,214,210));
       
     
     modelo.addColumn("Producto");
     modelo.addColumn("Precio");
      //Añadir Filas
       modelo.addRow(new Object[] {"Pollo Frito","$3.00"});
       modelo.addRow(new Object[] {"Pollo Empanisado","$2.50"});
       modelo.addRow(new Object[] {"Pollo Guisado","$3.00"});
       modelo.addRow(new Object[] {"Carne Asada","$2.00"});
       modelo.addRow(new Object[] {"Carne Guisada","$2.00"});
       modelo.addRow(new Object[] {"Pescado Frito","$4.00"});
       modelo.addRow(new Object[] {"Sopa de Gallina India","$1.75"});
       modelo.addRow(new Object[] {"Sopa de Res","$1.75"});
       modelo.addRow(new Object[] {"Sopa de Patas","$2.00"});
       //Añadir modelo a tabla, alto de fila y no editable
       tbTabla.setModel(modelo);
       tbTabla.setRowHeight(60);
       tbTabla.setDefaultEditor(Object.class, null);
       //Cambiar fuente a cabecera de tabla
       tbTabla.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 20));
       tbTabla.getTableHeader().setBackground(new Color(53, 60, 63));
       tbTabla.getTableHeader().setForeground(Color.WHITE);
       //Tamaño de columnas
       tbTabla.getColumnModel().getColumn(0).setPreferredWidth(150);
       tbTabla.getColumnModel().getColumn(1).setPreferredWidth(10);
       //Centrar texto de columnas
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tbTabla.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pnPane1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(117, 104, 103));
        jPanel1.setLayout(null);

        tbTabla.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        tbTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(328, 85, 621, 480);

        btnBorrar.setBackground(new java.awt.Color(42, 49, 50));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo (1).png"))); // NOI18N
        jPanel1.add(btnBorrar);
        btnBorrar.setBounds(531, 583, 84, 83);

        jButton1.setBackground(new java.awt.Color(43, 49, 50));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nuevo.png"))); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(327, 583, 84, 83);

        jButton2.setBackground(new java.awt.Color(42, 49, 50));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Modificar.png"))); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(429, 583, 84, 83);

        jButton3.setBackground(new java.awt.Color(42, 49, 50));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        jPanel1.add(jButton3);
        jButton3.setBounds(851, 583, 98, 83);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripcion:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 30, 126, 22);

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(330, 30, 559, 33);

        pnPane1.setBackground(new java.awt.Color(255, 255, 255));
        pnPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jButton4.setBackground(new java.awt.Color(53, 60, 63));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 141, 63));
        jButton4.setText("Entradas");
        jButton4.setBorder(null);

        jButton5.setBackground(new java.awt.Color(53, 60, 63));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 141, 63));
        jButton5.setText("Carnes");

        jButton6.setBackground(new java.awt.Color(53, 60, 63));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 141, 63));
        jButton6.setText("Pescados");

        jButton7.setBackground(new java.awt.Color(53, 60, 63));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 141, 63));
        jButton7.setText("Postres");

        jButton8.setBackground(new java.awt.Color(53, 60, 63));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 141, 63));
        jButton8.setText("Bebidas");

        jLabel1.setFont(new java.awt.Font("Free Chancery", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categoría:");

        javax.swing.GroupLayout pnPane1Layout = new javax.swing.GroupLayout(pnPane1);
        pnPane1.setLayout(pnPane1Layout);
        pnPane1Layout.setHorizontalGroup(
            pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnPane1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnPane1Layout.setVerticalGroup(
            pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnPane1);
        pnPane1.setBounds(27, 85, 283, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked
       /* if ((evt.getModifiers() & 4) !=0){
         ppMenuAct.setVisible(false);        
         }else{
        ppMenuAct.setVisible(true);
        ppMenuAct.setLocation(evt.getLocationOnScreen());
         }*/
    }//GEN-LAST:event_tbTablaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmActualizarMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnPane1;
    private javax.swing.JTable tbTabla;
    // End of variables declaration//GEN-END:variables
}
