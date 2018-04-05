/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author sofia
 */
public class frmNuevaOrden extends javax.swing.JFrame implements Runnable{
    String hora,minutos,segundos;
    Thread hilo;

    /**
     * Creates new form frmNuevaOrden
     */
    public frmNuevaOrden() {
        initComponents();
        //COLOR LETRA
        jLabel1.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(Color.BLACK);
        jLabel4.setForeground(Color.BLACK);
        jLabel5.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.BLACK);
        lblHora.setForeground(Color.BLACK);
        lblFecha.setForeground(Color.BLACK);
        //HORA Y FECHA
        this.setLocationRelativeTo(null);
        lblFecha.setText(fecha());
        hilo =new Thread (this);
        hilo.start();
        setVisible(true);
        
        tblDetalleOrden.setDefaultEditor(Object.class, null);
        tblDetalleOrden.getColumnModel().getColumn(1).setPreferredWidth(5);       
        encabezado();
        
        
    }
    
    Color fore = new java.awt.Color(154,119,50);
    Color back = new java.awt.Color(248,227,128);
    public void hora(){
    Calendar calendario= new GregorianCalendar();
    Date horaActual = new Date();
    calendario.setTime(horaActual);
    hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
    minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    
    }
    public void run(){
    Thread current= Thread.currentThread();
    while (current==hilo){
    
    hora();
    lblHora.setText(hora+":"+minutos+":"+segundos);
    }
    
     
    }
    
    public void encabezado(){
       tblDetalleOrden.getTableHeader().setFont(new Font("", Font.BOLD, 20));
       tblDetalleOrden.getTableHeader().setBackground(new java.awt.Color(116,85,31));
       tblDetalleOrden.getTableHeader().setForeground(new java.awt.Color(245,168,12));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jppMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleOrden = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jppMenu.setBackground(new java.awt.Color(191, 169, 164));

        jMenuItem1.setBackground(new java.awt.Color(154, 119, 50));
        jMenuItem1.setFont(jMenuItem1.getFont().deriveFont(jMenuItem1.getFont().getSize()+8f));
        jMenuItem1.setForeground(new java.awt.Color(248, 227, 128));
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

        jMenuItem2.setBackground(new java.awt.Color(154, 119, 50));
        jMenuItem2.setFont(jMenuItem2.getFont().deriveFont(jMenuItem2.getFont().getSize()+8f));
        jMenuItem2.setForeground(new java.awt.Color(248, 227, 128));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Orden | Resbar v0.1");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/logo.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(154, 119, 50));
        jPanel1.setForeground(new java.awt.Color(169, 119, 74));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(245, 168, 12));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right.png"))); // NOI18N
        jButton2.setText("Enviar Orden");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblFecha.setFont(lblFecha.getFont().deriveFont(lblFecha.getFont().getSize()+9f));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("00/00/00");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+9));
        jLabel1.setText("Mesa:");

        lblHora.setFont(lblHora.getFont().deriveFont(lblHora.getFont().getSize()+9f));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setText("00:00:00");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+9));
        jLabel2.setText("Mesero:");

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+9));
        jLabel3.setText("Cliente:");

        jTextField1.setFont(jTextField1.getFont().deriveFont(jTextField1.getFont().getSize()+9f));

        jTextField2.setFont(jTextField2.getFont().deriveFont(jTextField2.getFont().getSize()+9f));

        jTextField3.setFont(jTextField3.getFont().deriveFont(jTextField3.getFont().getSize()+9f));

        tblDetalleOrden.setBackground(new java.awt.Color(248, 227, 128));
        tblDetalleOrden.setFont(tblDetalleOrden.getFont().deriveFont(tblDetalleOrden.getFont().getSize()+9f));
        tblDetalleOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"COMBO ALITAS BARBACOA", "2"},
                {"BOTELLA CON AGUA", "2"},
                {"ENSALADA CESAR", "1"},
                {"SODA", "1"},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD"
            }
        ));
        tblDetalleOrden.setGridColor(new java.awt.Color(0, 0, 0));
        tblDetalleOrden.setRowHeight(30);
        tblDetalleOrden.setSelectionBackground(new java.awt.Color(154, 119, 50));
        tblDetalleOrden.setSelectionForeground(new java.awt.Color(248, 227, 128));
        tblDetalleOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalleOrdenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalleOrden);

        jButton1.setBackground(new java.awt.Color(245, 168, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        jButton1.setText("Agregar Productos");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_116x116.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Forte", 0, 60)); // NOI18N
        jLabel4.setText("Resbar");

        jLabel5.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel5.setText("Detalle Orden");

        jLabel6.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel6.setText("Restaurante & Bar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFondo)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(202, 202, 202)
                    .addComponent(jLabel6)
                    .addContainerGap(638, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecha)
                            .addComponent(lblHora)))
                    .addComponent(lblFondo)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(7, 7, 7))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel6)
                    .addContainerGap(665, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1030, 670));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 frmDetalleOrden detalleOrden = new frmDetalleOrden();
                 detalleOrden.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new frmDashboard().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new frmDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseEntered
        jMenuItem1.setBackground(back);
        jMenuItem1.setForeground(fore);
    }//GEN-LAST:event_jMenuItem1MouseEntered

    private void jMenuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseExited
        jMenuItem1.setBackground(fore);
        jMenuItem1.setForeground(back);
    }//GEN-LAST:event_jMenuItem1MouseExited

    private void jMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseEntered
        jMenuItem2.setBackground(back);
        jMenuItem2.setForeground(fore);
    }//GEN-LAST:event_jMenuItem2MouseEntered

    private void jMenuItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseExited
        jMenuItem2.setBackground(fore);
        jMenuItem2.setForeground(back);
    }//GEN-LAST:event_jMenuItem2MouseExited

    private void tblDetalleOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetalleOrdenMouseClicked
        if ((evt.getModifiers() & 2) !=0){
         jppMenu.setVisible(false);        
         }else{
        jppMenu.setVisible(true);
        jppMenu.setLocation(evt.getLocationOnScreen());
         }
    }//GEN-LAST:event_tblDetalleOrdenMouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jppMenu.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseEntered

    /**
     * @param args the command line arguments
     */
    public static String fecha() {
    Date fecha= new Date ();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
    
    return formatoFecha.format(fecha);
    
    }
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
            java.util.logging.Logger.getLogger(frmNuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNuevaOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPopupMenu jppMenu;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTable tblDetalleOrden;
    // End of variables declaration//GEN-END:variables
}
