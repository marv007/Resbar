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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

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
        
        tblDetalle.setDefaultEditor(Object.class, null);
       // tblDetalleOrden.getColumnModel().getColumn(1).setPreferredWidth(5);       
        encabezado();
        
        this.jMenuItem1.setForeground(fore);
        this.jMenuItem2.setBackground(back);
        
        
    }
    
    Color back = new java.awt.Color(154,119,50);
    Color fore = new java.awt.Color(248,227,128);
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
        
       //crear y llenar el objeto tabla
       DefaultTableModel modelo = new DefaultTableModel();
      
       //Agregar columna
       modelo.addColumn("Producto");
       modelo.addColumn("Cantidad");
       
       //agregar filas a la tabla
        modelo.addRow(new Object[]{"Combo alitas barbacoa","2"});
        modelo.addRow(new Object[]{"Botella con agua","2"});
        modelo.addRow(new Object[]{"Ensalada cesar","1"});
        modelo.addRow(new Object[]{"Soda","1"});
        
        //añadir modelo a la tabla
        this.tblDetalle.setModel(modelo);
        
        //tamaño de las celdas
        this.tblDetalle.setRowHeight(40);
        
        //editor de la tabla
        this.tblDetalle.setDefaultEditor(Object.class, null);
       
        //ordenar la tabla
       this.tblDetalle.setRowSorter(new TableRowSorter(modelo));
       
       //color de la tabla
       tblDetalle.getTableHeader().setFont(new Font("", Font.BOLD, 20));
       tblDetalle.getTableHeader().setBackground(new java.awt.Color(116,85,31));
       tblDetalle.getTableHeader().setForeground(new java.awt.Color(245,168,12));
       
       //Tamaño de las columnas
       this.tblDetalle.getColumnModel().getColumn(0).setPreferredWidth(300);
       this.tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(5);
       
       //centrar texto de la tabla
       DefaultTableCellRenderer modeloCentrar = new DefaultTableCellRenderer();
       modeloCentrar.setHorizontalAlignment(SwingConstants.CENTER);
       this.tblDetalle.getColumnModel().getColumn(1).setCellRenderer(modeloCentrar);
       
       //ordenar tabla por columnas en ascendente
       this.tblDetalle.setRowSorter(new TableRowSorter(modelo));
      
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
        btnEnviarOrden = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMesa = new javax.swing.JTextField();
        txtMesero = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        btnAgregarProductos = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnviarOrden.setBackground(new java.awt.Color(245, 168, 12));
        btnEnviarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right.png"))); // NOI18N
        btnEnviarOrden.setText("Enviar Orden");
        btnEnviarOrden.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnviarOrden.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnviarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 111, -1));

        lblFecha.setFont(lblFecha.getFont().deriveFont(lblFecha.getFont().getSize()+9f));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("00/00/00");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 117, -1));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+9));
        jLabel1.setText("Mesa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lblHora.setFont(lblHora.getFont().deriveFont(lblHora.getFont().getSize()+9f));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setText("00:00:00");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 101, -1));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+9));
        jLabel2.setText("Mesero:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+9));
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtMesa.setFont(txtMesa.getFont().deriveFont(txtMesa.getFont().getSize()+9f));
        jPanel1.add(txtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 160, 30));

        txtMesero.setFont(txtMesero.getFont().deriveFont(txtMesero.getFont().getSize()+9f));
        txtMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMeseroKeyTyped(evt);
            }
        });
        jPanel1.add(txtMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 310, 30));

        txtCliente.setFont(txtCliente.getFont().deriveFont(txtCliente.getFont().getSize()+9f));
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 320, 30));

        tblDetalle.setBackground(new java.awt.Color(248, 227, 128));
        tblDetalle.setFont(tblDetalle.getFont().deriveFont(tblDetalle.getFont().getSize()+9f));
        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDetalle.setGridColor(new java.awt.Color(0, 0, 0));
        tblDetalle.setRowHeight(30);
        tblDetalle.setSelectionBackground(new java.awt.Color(154, 119, 50));
        tblDetalle.setSelectionForeground(new java.awt.Color(248, 227, 128));
        tblDetalle.getTableHeader().setResizingAllowed(false);
        tblDetalle.getTableHeader().setReorderingAllowed(false);
        tblDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 620, 370));

        btnAgregarProductos.setBackground(new java.awt.Color(245, 168, 12));
        btnAgregarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnAgregarProductos.setText("Agregar Productos");
        btnAgregarProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_116x116.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Forte", 0, 60)); // NOI18N
        jLabel4.setText("Resbar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 53));

        jLabel5.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel5.setText("Detalle Orden");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel6.setText("Restaurante & Bar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 320, 370));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Comentarios");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 146, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 780));

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

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
                 frmDetalleOrden detalleOrden = new frmDetalleOrden();
                 detalleOrden.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new frmDashboard().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnEnviarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarOrdenActionPerformed
        new frmDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEnviarOrdenActionPerformed

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

    private void tblDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetalleMouseClicked
        if ((evt.getModifiers() & 2) !=0){
         jppMenu.setVisible(false);        
         }else{
        jppMenu.setVisible(true);
        jppMenu.setLocation(evt.getLocationOnScreen());
         }
    }//GEN-LAST:event_tblDetalleMouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jppMenu.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
       char c = evt.getKeyChar();
        
        if((c<'a' || c>'z')&&(c<'A' || c>'Z')&&(c!=' '))  evt.consume();
    }//GEN-LAST:event_txtClienteKeyTyped

    private void txtMeseroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMeseroKeyTyped
       char c = evt.getKeyChar();
        
        if((c<'a' || c>'z')&&(c<'A' || c>'Z')&&(c!=' '))  evt.consume();
    }//GEN-LAST:event_txtMeseroKeyTyped

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
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnEnviarOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPopupMenu jppMenu;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMesa;
    private javax.swing.JTextField txtMesero;
    // End of variables declaration//GEN-END:variables
}
