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

    Color fore = new java.awt.Color(154,119,50);
    Color back = new java.awt.Color(248,227,128);
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
        AgregarP = new javax.swing.JMenuItem();
        Imprimir = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        Cancel = new javax.swing.JMenuItem();
        Cobrar = new javax.swing.JMenuItem();
        jppAdmin = new javax.swing.JPopupMenu();
        Categorias = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenuItem();
        Reporte = new javax.swing.JMenuItem();
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jppMenu.setBackground(new java.awt.Color(255, 141, 63));
        jppMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jppMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AgregarP.setBackground(new java.awt.Color(154, 119, 50));
        AgregarP.setFont(AgregarP.getFont().deriveFont(AgregarP.getFont().getStyle() | java.awt.Font.BOLD, AgregarP.getFont().getSize()+8));
        AgregarP.setForeground(new java.awt.Color(248, 227, 128));
        AgregarP.setText("Agregar Productos");
        AgregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarPMouseExited(evt);
            }
        });
        AgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPActionPerformed(evt);
            }
        });
        jppMenu.add(AgregarP);

        Imprimir.setBackground(new java.awt.Color(154, 119, 50));
        Imprimir.setFont(Imprimir.getFont().deriveFont(Imprimir.getFont().getStyle() | java.awt.Font.BOLD, Imprimir.getFont().getSize()+8));
        Imprimir.setForeground(new java.awt.Color(248, 227, 128));
        Imprimir.setText("Imprimir Cuenta");
        Imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImprimirMouseExited(evt);
            }
        });
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        jppMenu.add(Imprimir);

        Modificar.setBackground(new java.awt.Color(154, 119, 50));
        Modificar.setFont(Modificar.getFont().deriveFont(Modificar.getFont().getStyle() | java.awt.Font.BOLD, Modificar.getFont().getSize()+8));
        Modificar.setForeground(new java.awt.Color(248, 227, 128));
        Modificar.setText("Modificar Cuenta");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificarMouseExited(evt);
            }
        });
        jppMenu.add(Modificar);

        Cancel.setBackground(new java.awt.Color(154, 119, 50));
        Cancel.setFont(Cancel.getFont().deriveFont(Cancel.getFont().getStyle() | java.awt.Font.BOLD, Cancel.getFont().getSize()+8));
        Cancel.setForeground(new java.awt.Color(248, 227, 128));
        Cancel.setText("Cancelar Orden");
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
        });
        jppMenu.add(Cancel);

        Cobrar.setBackground(new java.awt.Color(154, 119, 50));
        Cobrar.setFont(Cobrar.getFont().deriveFont(Cobrar.getFont().getStyle() | java.awt.Font.BOLD, Cobrar.getFont().getSize()+8));
        Cobrar.setForeground(new java.awt.Color(248, 227, 128));
        Cobrar.setText("Cobrar");
        Cobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CobrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CobrarMouseExited(evt);
            }
        });
        Cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobrarActionPerformed(evt);
            }
        });
        jppMenu.add(Cobrar);

        Categorias.setFont(Categorias.getFont().deriveFont(Categorias.getFont().getStyle() | java.awt.Font.BOLD, Categorias.getFont().getSize()+9));
        Categorias.setText("Categorias Menú");
        Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriasActionPerformed(evt);
            }
        });
        jppAdmin.add(Categorias);

        Productos.setFont(Productos.getFont().deriveFont(Productos.getFont().getStyle() | java.awt.Font.BOLD, Productos.getFont().getSize()+9));
        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jppAdmin.add(Productos);

        Reporte.setFont(Reporte.getFont().deriveFont(Reporte.getFont().getStyle() | java.awt.Font.BOLD, Reporte.getFont().getSize()+9));
        Reporte.setText("Reporte");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        jppAdmin.add(Reporte);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resbar v0.1");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/logo.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(154, 119, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 768));
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
        tblOrdenes.setSelectionBackground(new java.awt.Color(154, 119, 50));
        tblOrdenes.setSelectionForeground(new java.awt.Color(248, 227, 128));
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
        jButton3.setText("Administración");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
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
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/impresora.png"))); // NOI18N
        jButton4.setText("Imprimir");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(245, 168, 12));
        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()+9f));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(90, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(jTextField1.getFont().deriveFont(jTextField1.getFont().getSize()+9f));
        jTextField1.setText("Buscar...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(570, 570, 570)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarPMouseEntered
        AgregarP.setBackground(back);
        AgregarP.setForeground(fore);
    }//GEN-LAST:event_AgregarPMouseEntered

    private void AgregarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarPMouseExited
        AgregarP.setBackground(fore);
        AgregarP.setForeground(back);
    }//GEN-LAST:event_AgregarPMouseExited

    private void ImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImprimirMouseExited
        Imprimir.setBackground(fore);
        Imprimir.setForeground(back);
    }//GEN-LAST:event_ImprimirMouseExited

    private void ImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImprimirMouseEntered
        Imprimir.setBackground(back);
        Imprimir.setForeground(fore);
        
        
    }//GEN-LAST:event_ImprimirMouseEntered

    private void ModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseExited
        Modificar.setBackground(fore);
        Modificar.setForeground(back);
    }//GEN-LAST:event_ModificarMouseExited

    private void ModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseEntered
        Modificar.setBackground(back);
        Modificar.setForeground(fore);
    }//GEN-LAST:event_ModificarMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        Cancel.setBackground(fore);
        Cancel.setForeground(back);
    }//GEN-LAST:event_CancelMouseExited

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        Cancel.setBackground(back);
        Cancel.setForeground(fore);
    }//GEN-LAST:event_CancelMouseEntered

    private void CobrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CobrarMouseExited
        Cobrar.setBackground(fore);
        Cobrar.setForeground(back);
    }//GEN-LAST:event_CobrarMouseExited

    private void CobrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CobrarMouseEntered
        Cobrar.setBackground(back);
        Cobrar.setForeground(fore);
    }//GEN-LAST:event_CobrarMouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jppMenu.setVisible(false);
        jppAdmin.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        frmTicket t = new frmTicket();
        t.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmNuevaOrden v = new frmNuevaOrden();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdenesMouseClicked

        if ((evt.getModifiers() & 4) !=0){
            jppMenu.setVisible(false);
        }else{
            jppMenu.setVisible(true);
            jppMenu.setLocation(evt.getLocationOnScreen());
        }
        
        
    }//GEN-LAST:event_tblOrdenesMouseClicked

    private void AgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPActionPerformed
        frmDetalleOrden v = new frmDetalleOrden();
        v.setVisible(true);
        this.dispose();
        jppMenu.setVisible(false);
    }//GEN-LAST:event_AgregarPActionPerformed

    private void CobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobrarActionPerformed
        frmCobrar cobro = new frmCobrar();
        cobro.setVisible(true);
        this.dispose();
        jppMenu.setVisible(false);
    }//GEN-LAST:event_CobrarActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            jppAdmin.setVisible(false);
        }else{
            jppAdmin.setVisible(true);
            jppAdmin.setLocation(evt.getLocationOnScreen());
        }
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriasActionPerformed
        frmAgregarCategoria a = new frmAgregarCategoria();
        a.setVisible(true);
        jppAdmin.setVisible(false);
    }//GEN-LAST:event_CategoriasActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
       frmConsultaVentas ventas = new frmConsultaVentas();
       ventas.setVisible(true);
       this.dispose();
       jppAdmin.setVisible(false);
    }//GEN-LAST:event_ReporteActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        frmActualizarMenu v = new frmActualizarMenu();
        v.setVisible(true);
        this.dispose();
       jppAdmin.setVisible(false);
    }//GEN-LAST:event_ProductosActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        frmTicket t = new frmTicket();
        t.setVisible(true);
        this.dispose();
        jppMenu.setVisible(false);
    }//GEN-LAST:event_ImprimirActionPerformed

    
        
      
    
    
    
    
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
    private javax.swing.JMenuItem AgregarP;
    private javax.swing.JMenuItem Cancel;
    private javax.swing.JMenuItem Categorias;
    private javax.swing.JMenuItem Cobrar;
    private javax.swing.JMenuItem Imprimir;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenuItem Reporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPopupMenu jppAdmin;
    private javax.swing.JPopupMenu jppMenu;
    private javax.swing.JTable tblOrdenes;
    // End of variables declaration//GEN-END:variables
}
