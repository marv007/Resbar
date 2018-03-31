/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frank
 */
public class frmDetalleOrden extends javax.swing.JFrame {

    /**
     * Creates new form frmDetalleOrden
     */
    public frmDetalleOrden() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.TablaDetalleOrden();
 }

    
    public void TablaDetalleOrden(){
        // se crea un objeto de tipo JTable
        DefaultTableModel modelo = new DefaultTableModel();
        
        //Agregar Columnas a la tabla
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        
        //agregar filas a la tabla
        modelo.addRow(new Object[]{"Carne Asada","$2.50","2"});
        modelo.addRow(new Object[]{"Bocadillos de camaron","$1.00","4"});
        modelo.addRow(new Object[]{"Michelada","$3.50","5"});
        modelo.addRow(new Object[]{"Pescado frito","$2.00","3"});
        modelo.addRow(new Object[]{"Bocadillos de calamar","$1.50","1"});
        
        //añadir modelo a la tabla
        this.tblDetalleOrden.setModel(modelo);
        
        //tamaño de las celdas de la tabla
        this.tblDetalleOrden.setRowHeight(40);
        
        //editor de la tabla
        this.tblDetalleOrden.setDefaultEditor(Object.class, null);
        
        //cambiar la fuente a la letra de la cabecera de la tabla
        this.tblDetalleOrden.getTableHeader().setFont(new Font("",Font.BOLD,20));
       this.tblDetalleOrden.getTableHeader().setBackground(Color.BLACK);
       this.tblDetalleOrden.getTableHeader().setForeground(Color.WHITE); 
       
       
       
       //Tamaño de las columnas
       this.tblDetalleOrden.getColumnModel().getColumn(0).setPreferredWidth(350);
       this.tblDetalleOrden.getColumnModel().getColumn(1).setPreferredWidth(5);
       this.tblDetalleOrden.getColumnModel().getColumn(2).setPreferredWidth(5);
       
       //centrar texto de la tabla
       DefaultTableCellRenderer modeloCentrar = new DefaultTableCellRenderer();
       modeloCentrar.setHorizontalAlignment(SwingConstants.CENTER);
       this.tblDetalleOrden.getColumnModel().getColumn(1).setCellRenderer(modeloCentrar);
       this.tblDetalleOrden.getColumnModel().getColumn(2).setCellRenderer(modeloCentrar);
    }
   
        

    
    
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
        jpnlPrincipal = new javax.swing.JPanel();
        jpnlMenus = new javax.swing.JPanel();
        btnEntradas = new javax.swing.JButton();
        btnBocas = new javax.swing.JButton();
        btnSopas = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleOrden = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        jppMenu.setBackground(new java.awt.Color(191, 169, 164));

        jMenuItem1.setBackground(new java.awt.Color(169, 119, 74));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenuItem1.setText("Más");
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
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenuItem2.setText("Menos");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseExited(evt);
            }
        });
        jppMenu.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Productos");
        setMinimumSize(new java.awt.Dimension(1020, 770));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jpnlPrincipal.setMaximumSize(new java.awt.Dimension(1024, 768));
        jpnlPrincipal.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpnlPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpnlPrincipalMouseEntered(evt);
            }
        });

        jpnlMenus.setBackground(new java.awt.Color(169, 119, 74));
        jpnlMenus.setComponentPopupMenu(jppMenu);
        jpnlMenus.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpnlMenus.setLayout(null);

        btnEntradas.setBackground(new java.awt.Color(191, 169, 164));
        btnEntradas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnEntradas.setText("Entradas");
        jpnlMenus.add(btnEntradas);
        btnEntradas.setBounds(30, 200, 190, 80);

        btnBocas.setBackground(new java.awt.Color(191, 169, 164));
        btnBocas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBocas.setText("Bocas");
        jpnlMenus.add(btnBocas);
        btnBocas.setBounds(30, 290, 190, 80);

        btnSopas.setBackground(new java.awt.Color(191, 169, 164));
        btnSopas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSopas.setText("Sopas");
        jpnlMenus.add(btnSopas);
        btnSopas.setBounds(30, 380, 190, 80);

        btnBebidas.setBackground(new java.awt.Color(191, 169, 164));
        btnBebidas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBebidas.setText("Bebidas");
        jpnlMenus.add(btnBebidas);
        btnBebidas.setBounds(30, 470, 190, 80);

        tblDetalleOrden.setBackground(new java.awt.Color(153, 153, 255));
        tblDetalleOrden.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tblDetalleOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDetalleOrden.setRowHeight(40);
        tblDetalleOrden.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblDetalleOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalleOrdenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalleOrden);

        jpnlMenus.add(jScrollPane1);
        jScrollPane1.setBounds(230, 200, 770, 350);

        btnOk.setBackground(new java.awt.Color(191, 169, 164));
        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jpnlMenus.add(btnOk);
        btnOk.setBounds(810, 580, 190, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo_125x125.png"))); // NOI18N
        jpnlMenus.add(jLabel1);
        jLabel1.setBounds(890, 20, 110, 130);

        jLabel2.setFont(new java.awt.Font("Forte", 0, 60)); // NOI18N
        jLabel2.setText("ResBar");
        jpnlMenus.add(jLabel2);
        jLabel2.setBounds(420, 20, 190, 60);

        jLabel3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel3.setText("Restaurante & Bar");
        jpnlMenus.add(jLabel3);
        jLabel3.setBounds(420, 90, 190, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo_125x125.png"))); // NOI18N
        jpnlMenus.add(jLabel4);
        jLabel4.setBounds(30, 20, 110, 125);

        jLabel5.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel5.setText("Menús");
        jpnlMenus.add(jLabel5);
        jLabel5.setBounds(80, 170, 90, 30);

        jLabel6.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel6.setText("Detalle de Ordenes");
        jpnlMenus.add(jLabel6);
        jLabel6.setBounds(240, 170, 200, 30);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtBuscar.setText("Buscar...");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(243, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        btnBuscar.setPreferredSize(new java.awt.Dimension(90, 31));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlPrincipalLayout = new javax.swing.GroupLayout(jpnlPrincipal);
        jpnlPrincipal.setLayout(jpnlPrincipalLayout);
        jpnlPrincipalLayout.setHorizontalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jpnlMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpnlPrincipalLayout.setVerticalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jpnlMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jpnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        frmNuevaOrden nuevaOrden = new frmNuevaOrden();
        nuevaOrden.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
          this.txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void tblDetalleOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetalleOrdenMouseClicked
         if ((evt.getModifiers() & 2) !=0){
         jppMenu.setVisible(false);        
         }else{
        jppMenu.setVisible(true);
        jppMenu.setLocation(evt.getLocationOnScreen());
         }
    }//GEN-LAST:event_tblDetalleOrdenMouseClicked

    private void jpnlPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlPrincipalMouseEntered
        this.jppMenu.setVisible(false);
    }//GEN-LAST:event_jpnlPrincipalMouseEntered

    private void jMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseEntered
        jMenuItem1.setBackground(Color.black);
        jMenuItem1.setForeground(new java.awt.Color(169,119,74));
    }//GEN-LAST:event_jMenuItem1MouseEntered

    private void jMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseEntered
        jMenuItem2.setBackground(Color.black);
        jMenuItem2.setForeground(new java.awt.Color(169,119,74));
    }//GEN-LAST:event_jMenuItem2MouseEntered

    private void jMenuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseExited
        jMenuItem1.setBackground(new java.awt.Color(169,119,74));
        jMenuItem1.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem1MouseExited

    private void jMenuItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseExited
        jMenuItem2.setBackground(new java.awt.Color(169,119,74));
        jMenuItem2.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem2MouseExited

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
            java.util.logging.Logger.getLogger(frmDetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDetalleOrden().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnBocas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSopas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnlMenus;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPopupMenu jppMenu;
    private javax.swing.JTable tblDetalleOrden;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
