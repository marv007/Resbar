/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Frank
 */
public class frmDetalleOrden extends javax.swing.JFrame {

    /**
     * Creates new form frmDetalleOrden
     */
    
    Color back = new java.awt.Color(154,119,50);
    Color fore = new java.awt.Color(248,227,128);
          
    public frmDetalleOrden() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.TablaDetalleOrden();
        this.ListaDetalleOrden();
        this.colores();
 }

    
    public void colores(){
         //COLOR LETRA de los label
        jLabelEncabezado1.setForeground(Color.BLACK);
        jLabelEncabezado2.setForeground(Color.BLACK);
        jLabelLogo1.setForeground(Color.BLACK);
        jLabelLogo2.setForeground(Color.BLACK);
        jLabelCategoria.setForeground(Color.WHITE);
        
        
        // color de fondo del panel 
        this.jPanelBotones.setBackground(new Color(0,0,0,100));
        this.jPanelTabla.setBackground(new Color(0,0,0,100));
        
     
        //color de letra JPOP
        //this.jMenuItem1.setForeground(Color.BLACK);
       // this.jMenuItem2.setForeground(Color.BLACK);
    }
    
    public void ListaDetalleOrden(){
        
        //delcarar una variable tipo lista
        DefaultListModel modeloLista= new DefaultListModel();
       
        //pasar el modelo a la lista
        this.jListCategoria.setModel(modeloLista);
        
        //llenar la lista
        modeloLista.addElement("Entradas");
        modeloLista.addElement("Carnes");
        modeloLista.addElement("Pescados & Mariscos");
        modeloLista.addElement("Sopas");
        modeloLista.addElement("Bebidas");
        modeloLista.addElement("Postres");
        
       
       //definir colores de la lista
       this.jListCategoria.setForeground(Color.BLACK);
       this.jListCategoria.setFont(new Font("",Font.BOLD,20));
       this.jListCategoria.setBackground(new Color(248,227,128));
       
       //Tamaño de la celda de la lista
       this.jListCategoria.setFixedCellHeight(40);
        
                
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
        modelo.addRow(new Object[]{"Pilsener","$1.50","6"});
        modelo.addRow(new Object[]{"Cuba libre","$4.50","3"});
        modelo.addRow(new Object[]{"Bocadillos de cangrejo","$1.50","5"});
        modelo.addRow(new Object[]{"Tacos al pastor","$2.50","3"});
        modelo.addRow(new Object[]{"Coca cola lite","$1.00","2"});
              
        
        //añadir modelo a la tabla
        this.tblDetalleOrden.setModel(modelo);
        
        //tamaño de las celdas de la tabla
        this.tblDetalleOrden.setRowHeight(40);
        
        //editor de la tabla
        this.tblDetalleOrden.setDefaultEditor(Object.class, null);
        
        //cambiar la fuente a la letra de la cabecera de la tabla
       this.tblDetalleOrden.getTableHeader().setFont(new Font("Verdana",Font.BOLD,20));
       this.tblDetalleOrden.getTableHeader().setBackground(new Color(116,85,31));
       this.tblDetalleOrden.getTableHeader().setForeground(new Color(245,168,12)); 
       
       
       
       //Tamaño de las columnas
       this.tblDetalleOrden.getColumnModel().getColumn(0).setPreferredWidth(300);
       this.tblDetalleOrden.getColumnModel().getColumn(1).setPreferredWidth(5);
       this.tblDetalleOrden.getColumnModel().getColumn(2).setPreferredWidth(5);
       
       //centrar texto de la tabla
       DefaultTableCellRenderer modeloCentrar = new DefaultTableCellRenderer();
       modeloCentrar.setHorizontalAlignment(SwingConstants.CENTER);
       this.tblDetalleOrden.getColumnModel().getColumn(1).setCellRenderer(modeloCentrar);
       this.tblDetalleOrden.getColumnModel().getColumn(2).setCellRenderer(modeloCentrar);
       
       //ordenar tabla por columnas en ascendente
       this.tblDetalleOrden.setRowSorter(new TableRowSorter(modelo));
       //this.tblDetalleOrden.getTableHeader().setForeground(Color.BLACK);
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
        btnOk = new javax.swing.JButton();
        jLabelLogo2 = new javax.swing.JLabel();
        jLabelEncabezado1 = new javax.swing.JLabel();
        jLabelEncabezado2 = new javax.swing.JLabel();
        jLabelLogo1 = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jLabelCategoria = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCategoria = new javax.swing.JList<>();
        jPanelTabla = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleOrden = new javax.swing.JTable();

        jppMenu.setBackground(new java.awt.Color(191, 169, 164));

        jMenuItem1.setBackground(new java.awt.Color(154, 119, 50));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
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
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Productos");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/logo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1024, 768));
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

        jpnlMenus.setBackground(new java.awt.Color(154, 119, 50));
        jpnlMenus.setComponentPopupMenu(jppMenu);
        jpnlMenus.setPreferredSize(new java.awt.Dimension(1024, 768));
        jpnlMenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpnlMenusMouseEntered(evt);
            }
        });
        jpnlMenus.setLayout(null);

        btnOk.setBackground(new java.awt.Color(245, 168, 12));
        btnOk.setFont(btnOk.getFont().deriveFont(btnOk.getFont().getStyle() | java.awt.Font.BOLD, btnOk.getFont().getSize()+9));
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right.png"))); // NOI18N
        btnOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jpnlMenus.add(btnOk);
        btnOk.setBounds(920, 670, 80, 60);

        jLabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo_125x125.png"))); // NOI18N
        jpnlMenus.add(jLabelLogo2);
        jLabelLogo2.setBounds(890, 20, 110, 130);

        jLabelEncabezado1.setFont(new java.awt.Font("Forte", 0, 70)); // NOI18N
        jLabelEncabezado1.setText("ResBar");
        jpnlMenus.add(jLabelEncabezado1);
        jLabelEncabezado1.setBounds(400, 30, 220, 60);

        jLabelEncabezado2.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabelEncabezado2.setText("Restaurante & Bar");
        jpnlMenus.add(jLabelEncabezado2);
        jLabelEncabezado2.setBounds(420, 100, 190, 30);

        jLabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo_125x125.png"))); // NOI18N
        jpnlMenus.add(jLabelLogo1);
        jLabelLogo1.setBounds(30, 20, 110, 125);

        jPanelBotones.setBackground(new java.awt.Color(154, 119, 50));
        jPanelBotones.setLayout(null);

        jLabelCategoria.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categorías");
        jPanelBotones.add(jLabelCategoria);
        jLabelCategoria.setBounds(70, 10, 120, 30);

        jListCategoria.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jListCategoria.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListCategoria);

        jPanelBotones.add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 230, 420);

        jpnlMenus.add(jPanelBotones);
        jPanelBotones.setBounds(20, 170, 250, 480);

        jPanelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtBuscar.setText("Buscar...");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        jPanelTabla.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 580, 39));

        btnBuscar.setBackground(new java.awt.Color(117, 104, 103));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setPreferredSize(new java.awt.Dimension(90, 31));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanelTabla.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 11, 111, 39));

        tblDetalleOrden.setBackground(new java.awt.Color(248, 227, 128));
        tblDetalleOrden.setFont(tblDetalleOrden.getFont().deriveFont(tblDetalleOrden.getFont().getStyle() & ~java.awt.Font.BOLD, tblDetalleOrden.getFont().getSize()+9));
        tblDetalleOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDetalleOrden.setGridColor(new java.awt.Color(0, 0, 0));
        tblDetalleOrden.setRowHeight(40);
        tblDetalleOrden.setSelectionBackground(new java.awt.Color(154, 119, 50));
        tblDetalleOrden.setSelectionForeground(new java.awt.Color(248, 227, 128));
        tblDetalleOrden.getTableHeader().setResizingAllowed(false);
        tblDetalleOrden.getTableHeader().setReorderingAllowed(false);
        tblDetalleOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalleOrdenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalleOrden);

        jPanelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 700, 410));

        jpnlMenus.add(jPanelTabla);
        jPanelTabla.setBounds(280, 170, 720, 480);

        javax.swing.GroupLayout jpnlPrincipalLayout = new javax.swing.GroupLayout(jpnlPrincipal);
        jpnlPrincipal.setLayout(jpnlPrincipalLayout);
        jpnlPrincipalLayout.setHorizontalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpnlPrincipalLayout.setVerticalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                .addComponent(jpnlMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jpnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseEntered
        jMenuItem1.setBackground(back);
        jMenuItem1.setForeground(fore);
    }//GEN-LAST:event_jMenuItem1MouseEntered

    private void jMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseEntered
        jMenuItem2.setBackground(back);
        jMenuItem2.setForeground(fore);
    }//GEN-LAST:event_jMenuItem2MouseEntered

    private void jMenuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseExited
        jMenuItem1.setBackground(fore);
        jMenuItem1.setForeground(back);
    }//GEN-LAST:event_jMenuItem1MouseExited

    private void jMenuItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseExited
        jMenuItem2.setBackground(fore);
        jMenuItem2.setForeground(back);
    }//GEN-LAST:event_jMenuItem2MouseExited

    private void jpnlPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlPrincipalMouseEntered
        this.jppMenu.setVisible(false);
    }//GEN-LAST:event_jpnlPrincipalMouseEntered

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        this.txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void jpnlMenusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlMenusMouseEntered
        this.jppMenu.setVisible(false);
    }//GEN-LAST:event_jpnlMenusMouseEntered

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        frmNuevaOrden nuevaOrden = new frmNuevaOrden();
        nuevaOrden.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void tblDetalleOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetalleOrdenMouseClicked
        if ((evt.getModifiers() & 2) !=0){
            jppMenu.setVisible(false);
        }else{
            jppMenu.setVisible(true);
            jppMenu.setLocation(evt.getLocationOnScreen());
        }
    }//GEN-LAST:event_tblDetalleOrdenMouseClicked

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelEncabezado1;
    private javax.swing.JLabel jLabelEncabezado2;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JList<String> jListCategoria;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnlMenus;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPopupMenu jppMenu;
    private javax.swing.JTable tblDetalleOrden;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
