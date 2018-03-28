/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;



import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author jairoartist
 */
public class ordenes extends javax.swing.JFrame {
 DefaultTableModel modelo = new DefaultTableModel();
    public ordenes() {
        initComponents();
          this.setLocationRelativeTo(null);
          this.setResizable(false);
          //JFrame transparente
          
         
          
          ImageIcon fot = new ImageIcon("src/imagenes/fondo2.jpg");
            ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
           //lblFondo.setIcon(icono);
           //lblFondo.setBackground(new Color(117, 104, 103));
           lblFondo.setOpaque(true);
           pnPane1.setBackground(new Color(53, 60, 63,100));
           pnPane2.setBackground(new Color(53, 60, 63,70));
           
           //btnInicio.setBorder(new RoundedBorder(80));
           //btnInicio.setOpaque(false);
           //btnInicio.setContentAreaFilled(false);
           //btnInicio.setBorderPainted(true); 
       
    //Añadir columnas a modelo de tabla
       modelo.addColumn("N°");
       modelo.addColumn("Mesa");
       modelo.addColumn("Mesero");
       modelo.addColumn("Cliente");
       modelo.addColumn("Total");
       
       
       //Añadir Filas
       modelo.addRow(new Object[] {"1","5","Juan Martinez","No especificado","$25.00"});
       modelo.addRow(new Object[] {"2","3","Roberto Gonzalez","No especificado","$15.00"});
       modelo.addRow(new Object[] {"3","4","Marta Vasquez","No especificado","$10.95"});
       modelo.addRow(new Object[] {"4","1","Roberto Gonzalez","No especificado","$5.60"});
       //Añadir modelo a tabla
       tblOrdenes.setModel(modelo);
       tblOrdenes.setRowHeight(60);
       tblOrdenes.setDefaultEditor(Object.class, null);
       //Cambiar fuente a cabecera de tabla
       tblOrdenes.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 20));
       tblOrdenes.getTableHeader().setBackground(new Color(53, 60, 63));
       tblOrdenes.getTableHeader().setForeground(Color.WHITE);
       //Tamaño de columnas
       tblOrdenes.getColumnModel().getColumn(0).setPreferredWidth(10);
       tblOrdenes.getColumnModel().getColumn(1).setPreferredWidth(5);
       tblOrdenes.getColumnModel().getColumn(2).setPreferredWidth(150);
       tblOrdenes.getColumnModel().getColumn(4).setPreferredWidth(10);
        //Centrar texto de columnas
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tblOrdenes.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        tblOrdenes.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jppMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        pnPane1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();
        lblOrdenes = new javax.swing.JLabel();
        pnPane2 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnNuevaOrden = new javax.swing.JButton();
        btnConfigMenu = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        jppMenu.setBackground(new java.awt.Color(255, 141, 63));
        jppMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem1.setBackground(new java.awt.Color(255, 141, 63));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jMenuItem1.setText("Agregar Productos");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jppMenu.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(255, 141, 63));
        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jMenuItem2.setText("Imprimir Cuenta");
        jppMenu.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(255, 141, 63));
        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jMenuItem3.setText("Modificar Cuenta");
        jppMenu.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(255, 141, 63));
        jMenuItem4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jMenuItem4.setText("Cobrar");
        jppMenu.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 725));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        tblOrdenes.setBackground(new java.awt.Color(117, 104, 103));
        tblOrdenes.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        tblOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblOrdenes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdenesMouseClicked(evt);
            }
        });
        tblOrdenes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblOrdenesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrdenes);

        lblOrdenes.setFont(new java.awt.Font("Keter YG", 1, 30)); // NOI18N
        lblOrdenes.setForeground(new java.awt.Color(0, 0, 0));
        lblOrdenes.setText("Ordenes");

        javax.swing.GroupLayout pnPane1Layout = new javax.swing.GroupLayout(pnPane1);
        pnPane1.setLayout(pnPane1Layout);
        pnPane1Layout.setHorizontalGroup(
            pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrdenes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pnPane1Layout.setVerticalGroup(
            pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrdenes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(pnPane1);
        pnPane1.setBounds(60, 280, 900, 370);

        btnMenu.setBackground(new java.awt.Color(255, 141, 63));
        btnMenu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        btnMenu.setText("Menú");
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.setPreferredSize(new java.awt.Dimension(125, 100));
        btnMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        btnNuevaOrden.setBackground(new java.awt.Color(255, 141, 63));
        btnNuevaOrden.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevaOrden.setText("Nueva Orden");
        btnNuevaOrden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        btnNuevaOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaOrden.setPreferredSize(new java.awt.Dimension(125, 100));
        btnNuevaOrden.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevaOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaOrdenMouseClicked(evt);
            }
        });

        btnConfigMenu.setBackground(new java.awt.Color(255, 141, 63));
        btnConfigMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnConfigMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnConfigMenu.setText("Confugurar Menú");
        btnConfigMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        btnConfigMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfigMenu.setPreferredSize(new java.awt.Dimension(125, 100));
        btnConfigMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfigMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMenuMouseClicked(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(255, 141, 63));
        btnInicio.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 1, true));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicio.setPreferredSize(new java.awt.Dimension(125, 100));
        btnInicio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPane2Layout = new javax.swing.GroupLayout(pnPane2);
        pnPane2.setLayout(pnPane2Layout);
        pnPane2Layout.setHorizontalGroup(
            pnPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnNuevaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnConfigMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        pnPane2Layout.setVerticalGroup(
            pnPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfigMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        getContentPane().add(pnPane2);
        pnPane2.setBounds(60, 80, 900, 190);

        lblFondo.setBackground(new java.awt.Color(213, 214, 210));
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 1020, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioActionPerformed

    private void tblOrdenesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOrdenesKeyPressed
       
    }//GEN-LAST:event_tblOrdenesKeyPressed

    private void tblOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdenesMouseClicked
         if ((evt.getModifiers() & 4) !=0){
         jppMenu.setVisible(false);        
         }else{
        jppMenu.setVisible(true);
        jppMenu.setLocation(evt.getLocationOnScreen());
         }
    }//GEN-LAST:event_tblOrdenesMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       jppMenu.setVisible(false); 
    }//GEN-LAST:event_formMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        jppMenu.setVisible(false); 
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        jppMenu.setVisible(false); 
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnNuevaOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaOrdenMouseClicked
        jppMenu.setVisible(false); 
    }//GEN-LAST:event_btnNuevaOrdenMouseClicked

    private void btnConfigMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMenuMouseClicked
        jppMenu.setVisible(false); 
    }//GEN-LAST:event_btnConfigMenuMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        AgregarProducto agregar = new AgregarProducto();
        
        //AWTUtilities.setWindowOpacity(agregar, 0.5f);
        agregar.setVisible(true);
        jppMenu.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MouseClicked

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
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfigMenu;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevaOrden;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu jppMenu;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblOrdenes;
    private javax.swing.JPanel pnPane1;
    private javax.swing.JPanel pnPane2;
    private javax.swing.JTable tblOrdenes;
    // End of variables declaration//GEN-END:variables
}
