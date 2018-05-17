/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;


import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author jairoartist
 */
public class frmAgregarProductos extends javax.swing.JFrame {
    int posX, posY;
    
    public frmAgregarProductos() {
        this.setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);
        
        initComponents();
        //colorletra
        lblLogo2.setForeground(Color.BLACK);
        lblLogo3.setForeground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/iconos/logo.png")).getImage());
        
        //pane tranparente
        pnFondo.setBackground(new Color(154,119,50,240));
        jPanel1.setBackground(new Color(0,0,0,150));
        
        lblLogo1.setForeground(Color.BLACK);
        lblLogo2.setForeground(Color.BLACK);
        lblLogo3.setForeground(Color.BLACK);
        lblUno.setForeground(Color.BLACK);
        lblDos.setForeground(Color.BLACK);
        lblTres.setForeground(Color.BLACK);
        lblCuatro.setForeground(Color.BLACK);
        //Botones
        btnCancelar.setForeground(Color.BLACK);
        btnOk.setForeground(Color.BLACK);
        
       
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
        pnFondo = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();
        lblLogo2 = new javax.swing.JLabel();
        lblLogo3 = new javax.swing.JLabel();
        lblUno = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblDos = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblTres = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCuatro = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resbar v0.1 Agregar Productos");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        pnFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        pnFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnFondoMouseDragged(evt);
            }
        });
        pnFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnFondoMousePressed(evt);
            }
        });

        lblLogo1.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo_125x125.png"))); // NOI18N

        lblLogo2.setFont(new java.awt.Font("Forte", 0, 50)); // NOI18N
        lblLogo2.setText("Resbar");

        lblLogo3.setFont(new java.awt.Font("Forte", 0, 20)); // NOI18N
        lblLogo3.setText("Restaurante y Bar");

        lblUno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUno.setText("Categoria:");

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(245, 168, 12));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Carnes", "Pescados Y Mariscos", "Sopas", "Postres", "Bebidas" }));

        lblDos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDos.setText("Producto:");

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblTres.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTres.setText("Precio:");

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(245, 168, 12));
        btnOk.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnOk.setText("Ok");
        btnOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));

        btnCancelar.setBackground(new java.awt.Color(245, 168, 12));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnCancelar.setMinimumSize(new java.awt.Dimension(134, 34));
        btnCancelar.setPreferredSize(new java.awt.Dimension(134, 34));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCuatro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCuatro.setText("Enviar a:");

        jComboBox2.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(245, 168, 12));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Bebida" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("$");

        javax.swing.GroupLayout pnFondoLayout = new javax.swing.GroupLayout(pnFondo);
        pnFondo.setLayout(pnFondoLayout);
        pnFondoLayout.setHorizontalGroup(
            pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(pnFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnFondoLayout.createSequentialGroup()
                            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUno)
                                .addGroup(pnFondoLayout.createSequentialGroup()
                                    .addComponent(lblTres)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFondoLayout.createSequentialGroup()
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCuatro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFondoLayout.setVerticalGroup(
            pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFondoLayout.createSequentialGroup()
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogo3)
                        .addGap(46, 46, 46)
                        .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUno)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDos)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTres)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuatro)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(pnFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(674, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(pnFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1379, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFondoMousePressed
       posX = evt.getX();
       posY = evt.getY();
    }//GEN-LAST:event_pnFondoMousePressed

    private void pnFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnFondoMouseDragged
       int movX = evt.getXOnScreen()- posX;
        int movY = evt.getYOnScreen()- posY;
        this.setLocation(movX, movY);
    }//GEN-LAST:event_pnFondoMouseDragged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        
        if((c<'0' || c>'9')&& (c!='.'))  evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

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
            java.util.logging.Logger.getLogger(frmAgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCuatro;
    private javax.swing.JLabel lblDos;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblLogo3;
    private javax.swing.JLabel lblTres;
    private javax.swing.JLabel lblUno;
    private javax.swing.JPanel pnFondo;
    // End of variables declaration//GEN-END:variables
}