/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.MiRender;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marvin
 */
public class frmDashboard extends javax.swing.JFrame {

    /**
     * Creates new form frmDashboard
     */
    public frmDashboard() {
        initComponents();
        tabla();       
        this.setLocationRelativeTo(null);        
        tblOrdenes.setDefaultRenderer(Object.class, r);
        jLabel3.setForeground(Color.BLACK);
        jLabel4.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.BLACK);
    }

    MiRender r = new MiRender();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jppMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jppMenu.setBackground(new java.awt.Color(255, 141, 63));
        jppMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem1.setBackground(new java.awt.Color(169, 119, 74));
        jMenuItem1.setFont(jMenuItem1.getFont().deriveFont(jMenuItem1.getFont().getStyle() | java.awt.Font.BOLD, jMenuItem1.getFont().getSize()+8));
        jMenuItem1.setText("Agregar Productos");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseExited(evt);
            }
        });
        jppMenu.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(169, 119, 74));
        jMenuItem2.setFont(jMenuItem2.getFont().deriveFont(jMenuItem2.getFont().getStyle() | java.awt.Font.BOLD, jMenuItem2.getFont().getSize()+8));
        jMenuItem2.setText("Imprimir Cuenta");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseExited(evt);
            }
        });
        jppMenu.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(169, 119, 74));
        jMenuItem3.setFont(jMenuItem3.getFont().deriveFont(jMenuItem3.getFont().getStyle() | java.awt.Font.BOLD, jMenuItem3.getFont().getSize()+8));
        jMenuItem3.setText("Modificar Cuenta");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseExited(evt);
            }
        });
        jppMenu.add(jMenuItem3);

        jMenuItem5.setBackground(new java.awt.Color(169, 119, 74));
        jMenuItem5.setFont(jMenuItem5.getFont().deriveFont(jMenuItem5.getFont().getStyle() | java.awt.Font.BOLD, jMenuItem5.getFont().getSize()+8));
        jMenuItem5.setText("Cancelar Orden");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseExited(evt);
            }
        });
        jppMenu.add(jMenuItem5);

        jMenuItem4.setBackground(new java.awt.Color(169, 119, 74));
        jMenuItem4.setFont(jMenuItem4.getFont().deriveFont(jMenuItem4.getFont().getStyle() | java.awt.Font.BOLD, jMenuItem4.getFont().getSize()+8));
        jMenuItem4.setText("Cobrar");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseExited(evt);
            }
        });
        jppMenu.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resbar v0.1");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/logo.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(154, 119, 50));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo_125x125.png"))); // NOI18N

        tblOrdenes.setBackground(new java.awt.Color(248, 227, 128));
        tblOrdenes.setFont(tblOrdenes.getFont().deriveFont(tblOrdenes.getFont().getSize()+9f));
        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblOrdenes.setGridColor(new java.awt.Color(0, 0, 0));
        tblOrdenes.setOpaque(false);
        tblOrdenes.setRowHeight(24);
        tblOrdenes.setSelectionBackground(new java.awt.Color(169, 119, 74));
        tblOrdenes.setSelectionForeground(new java.awt.Color(255, 153, 51));
        tblOrdenes.getTableHeader().setResizingAllowed(false);
        tblOrdenes.getTableHeader().setReorderingAllowed(false);
        tblOrdenes.getTableHeader().setBackground(new java.awt.Color(0, 0, 0));
        tblOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrdenes);

        jLabel2.setFont(new java.awt.Font("Forte", 1, 26)); // NOI18N
        jLabel2.setText("Ordenes Activas");

        jButton2.setBackground(new java.awt.Color(245, 168, 12));
        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getStyle() | java.awt.Font.BOLD, jButton2.getFont().getSize()+1));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new-file.png"))); // NOI18N
        jButton2.setText("Nueva Orden");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(245, 168, 12));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/settings-three-gears-interface-symbol.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setLabel("Admin Menú");
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Forte", 0, 60)); // NOI18N
        jLabel3.setText("Resbar");

        jLabel4.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel4.setText("Restaurante & Bar");

        jButton4.setBackground(new java.awt.Color(245, 168, 12));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grafico-de-lineas.png"))); // NOI18N
        jButton4.setText("Historial Ventas");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(379, 379, 379)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTextField1.setFont(jTextField1.getFont().deriveFont(jTextField1.getFont().getSize()+9f));
        jTextField1.setText("Buscar...");

        jButton1.setBackground(new java.awt.Color(245, 168, 12));
        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()+9f));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(90, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdenesMouseClicked
         
         
         if ((evt.getModifiers() & 4) !=0){
         jppMenu.setVisible(false);        
         }else{
        jppMenu.setVisible(true);
        jppMenu.setLocation(evt.getLocationOnScreen());
         }
         
         
    }//GEN-LAST:event_tblOrdenesMouseClicked

    private void jMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseEntered
        jMenuItem1.setBackground(Color.black);
        jMenuItem1.setForeground(new java.awt.Color(169,119,74));
    }//GEN-LAST:event_jMenuItem1MouseEntered

    private void jMenuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseExited
        jMenuItem1.setBackground(new java.awt.Color(169,119,74));
        jMenuItem1.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem1MouseExited

    private void jMenuItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseExited
        jMenuItem2.setBackground(new java.awt.Color(169,119,74));
        jMenuItem2.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem2MouseExited

    private void jMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseEntered
        jMenuItem2.setBackground(Color.black);
        jMenuItem2.setForeground(new java.awt.Color(169,119,74));
        
        
    }//GEN-LAST:event_jMenuItem2MouseEntered

    private void jMenuItem3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseExited
        jMenuItem3.setBackground(new java.awt.Color(169,119,74));
        jMenuItem3.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem3MouseExited

    private void jMenuItem3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseEntered
        jMenuItem3.setBackground(Color.black);
        jMenuItem3.setForeground(new java.awt.Color(169,119,74));
    }//GEN-LAST:event_jMenuItem3MouseEntered

    private void jMenuItem5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseExited
        jMenuItem5.setBackground(new java.awt.Color(169,119,74));
        jMenuItem5.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem5MouseExited

    private void jMenuItem5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseEntered
        jMenuItem5.setBackground(Color.black);
        jMenuItem5.setForeground(new java.awt.Color(169,119,74));
    }//GEN-LAST:event_jMenuItem5MouseEntered

    private void jMenuItem4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseExited
        jMenuItem4.setBackground(new java.awt.Color(169,119,74));
        jMenuItem4.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem4MouseExited

    private void jMenuItem4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseEntered
        jMenuItem4.setBackground(Color.black);
        jMenuItem4.setForeground(new java.awt.Color(169,119,74));
    }//GEN-LAST:event_jMenuItem4MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmNuevaOrden v = new frmNuevaOrden();
        v.setVisible(true);
        this.dispose();
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
       jppMenu.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frmActualizarMenu v = new frmActualizarMenu();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        frmConsultaVentas v = new frmConsultaVentas();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
        
      
    
    
    
    
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
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDashboard().setVisible(true);
            }
        });
    }
    
    private void tabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        //Añadir columnas a modelo de tabla
       modelo.addColumn("N°");
       modelo.addColumn("Mesa");
       modelo.addColumn("Mesero");
       modelo.addColumn("Cliente");
       modelo.addColumn("Total");
       
       
       //Añadir Filas
       modelo.addRow(new Object[] {"1","A1","JUAN PEREZ","--","$15.90"});
       modelo.addRow(new Object[] {"2","C2","RODOLFO ZELAYA","--","$25.50"});
       modelo.addRow(new Object[] {"3","E1","JUAN PEREZ","CARLOS GOMEZ","$12.54"});
       modelo.addRow(new Object[] {"4","J1","LUIS SUAREZ","--","$35.50"});
       modelo.addRow(new Object[] {"5","B1","LUIS SUAREZ","--","$27.30"});
       //Añadir modelo a tabla
       tblOrdenes.setModel(modelo);
       tblOrdenes.setRowHeight(40);
       //tblOrdenes.setDefaultEditor(Object.class, );
       //Cambiar fuente a cabecera de tabla
       tblOrdenes.getTableHeader().setFont(new Font("", Font.BOLD, 20));
       tblOrdenes.getTableHeader().setBackground(new java.awt.Color(116,85,31));
       tblOrdenes.getTableHeader().setForeground(new java.awt.Color(245,168,12));
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
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPopupMenu jppMenu;
    private javax.swing.JTable tblOrdenes;
    // End of variables declaration//GEN-END:variables
}
