/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.MiRender;
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

    
    public frmActualizarMenu() {
        initComponents();
       //colorletra
       lblEncabezado.setForeground(Color.BLACK);
       lblLogo2.setForeground(Color.BLACK);
       lblLogo3.setForeground(Color.BLACK);
     
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/iconos/logo.png")).getImage());
        
        tbTabla.setDefaultRenderer(Object.class, r);
     
     miTabla();
     pnPane1.setBackground(new Color(0,0,0,100));
     pnPaneTabla.setBackground(new Color(0,0,0,100));
     
     lblLogo2.setForeground(Color.BLACK);
     lblLogo3.setForeground(Color.BLACK);
     lblEncabezado.setForeground(Color.BLACK);
     
     //Botones
     btnEntradas.setForeground(Color.BLACK);
     btnCarnes.setForeground(Color.BLACK);
     btnPescadosY.setForeground(Color.BLACK);
     btnSopas.setForeground(Color.BLACK);
     btnPostres.setForeground(Color.BLACK);
     btnBebidas.setForeground(Color.BLACK);
     btnAñadir.setForeground(Color.BLACK);
     btnOk.setForeground(Color.BLACK);
     
       
     
    
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

        ppMenuAct = new javax.swing.JPopupMenu();
        ppItem1 = new javax.swing.JMenuItem();
        ppItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        pnPane1 = new javax.swing.JPanel();
        btnEntradas = new javax.swing.JButton();
        btnCarnes = new javax.swing.JButton();
        btnPescadosY = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSopas = new javax.swing.JButton();
        pnPaneTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblCabecera = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLogo2 = new javax.swing.JLabel();
        lblLogo3 = new javax.swing.JLabel();
        lblEncabezado = new javax.swing.JLabel();

        ppItem1.setBackground(new java.awt.Color(169, 119, 74));
        ppItem1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        ppItem1.setText("Editar Producto");
        ppItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ppItem1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ppItem1MouseEntered(evt);
            }
        });
        ppMenuAct.add(ppItem1);

        ppItem2.setBackground(new java.awt.Color(169, 119, 74));
        ppItem2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        ppItem2.setText("Borrar Producto");
        ppItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ppItem2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ppItem2MouseEntered(evt);
            }
        });
        ppMenuAct.add(ppItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resbar v0.1 Administrar Menú");

        jPanel1.setBackground(new java.awt.Color(154, 119, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(null);

        btnAñadir.setBackground(new java.awt.Color(245, 168, 12));
        btnAñadir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnAñadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAñadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir);
        btnAñadir.setBounds(330, 630, 110, 83);

        btnOk.setBackground(new java.awt.Color(245, 168, 12));
        btnOk.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk);
        btnOk.setBounds(880, 630, 110, 83);

        pnPane1.setBackground(new java.awt.Color(255, 255, 255));
        pnPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        btnEntradas.setBackground(new java.awt.Color(245, 168, 12));
        btnEntradas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEntradas.setText("Entradas");
        btnEntradas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });

        btnCarnes.setBackground(new java.awt.Color(245, 168, 12));
        btnCarnes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCarnes.setText("Carnes");
        btnCarnes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarnesActionPerformed(evt);
            }
        });

        btnPescadosY.setBackground(new java.awt.Color(245, 168, 12));
        btnPescadosY.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnPescadosY.setText("Pescados y Mariscos");
        btnPescadosY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnPescadosY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPescadosYActionPerformed(evt);
            }
        });

        btnPostres.setBackground(new java.awt.Color(245, 168, 12));
        btnPostres.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPostres.setText("Postres");
        btnPostres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });

        btnBebidas.setBackground(new java.awt.Color(245, 168, 12));
        btnBebidas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBebidas.setText("Bebidas");
        btnBebidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Free Chancery", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categoría:");

        btnSopas.setBackground(new java.awt.Color(245, 168, 12));
        btnSopas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSopas.setText("Sopas");
        btnSopas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnSopas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSopasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPane1Layout = new javax.swing.GroupLayout(pnPane1);
        pnPane1.setLayout(pnPane1Layout);
        pnPane1Layout.setHorizontalGroup(
            pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarnes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPescadosY, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btnPostres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSopas, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
        );
        pnPane1Layout.setVerticalGroup(
            pnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarnes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPescadosY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSopas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnPane1);
        pnPane1.setBounds(30, 140, 290, 470);

        pnPaneTabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));

        tbTabla.setBackground(new java.awt.Color(248, 227, 128));
        tbTabla.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        tbTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTabla.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbTablaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbTablaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbTabla);

        txtBuscar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtBuscar.setText("Buscar Entradas...");
        txtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton2.setBackground(new java.awt.Color(117, 104, 103));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblCabecera.setBackground(new java.awt.Color(0, 0, 0));
        lblCabecera.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblCabecera.setForeground(new java.awt.Color(255, 255, 255));
        lblCabecera.setText("Entradas");
        lblCabecera.setOpaque(true);

        javax.swing.GroupLayout pnPaneTablaLayout = new javax.swing.GroupLayout(pnPaneTabla);
        pnPaneTabla.setLayout(pnPaneTablaLayout);
        pnPaneTablaLayout.setHorizontalGroup(
            pnPaneTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPaneTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPaneTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnPaneTablaLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPaneTablaLayout.createSequentialGroup()
                        .addComponent(lblCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnPaneTablaLayout.setVerticalGroup(
            pnPaneTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPaneTablaLayout.createSequentialGroup()
                .addComponent(lblCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPaneTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscar)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnPaneTabla);
        pnPaneTabla.setBounds(330, 140, 660, 470);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_116x116.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(893, 10, 97, 110);

        lblLogo2.setFont(new java.awt.Font("Forte", 0, 60)); // NOI18N
        lblLogo2.setText("Resbar");
        jPanel1.add(lblLogo2);
        lblLogo2.setBounds(700, 30, 190, 50);

        lblLogo3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        lblLogo3.setText("Restaurante y Bar");
        jPanel1.add(lblLogo3);
        lblLogo3.setBounds(690, 80, 210, 30);

        lblEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setFont(new java.awt.Font("Forte", 1, 40)); // NOI18N
        lblEncabezado.setText("Administrar Menú");
        jPanel1.add(lblEncabezado);
        lblEncabezado.setBounds(40, 30, 520, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked
       if ((evt.getModifiers() & 4) !=0){
         ppMenuAct.setVisible(false);        
         }else{
        ppMenuAct.setVisible(true);
        ppMenuAct.setLocation(evt.getLocationOnScreen());
         }
    }//GEN-LAST:event_tbTablaMouseClicked

    private void tbTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseEntered
      
    }//GEN-LAST:event_tbTablaMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
         ppMenuAct.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void ppItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppItem1MouseEntered
        ppItem1.setBackground(Color.BLACK);
         ppItem1.setForeground(new Color(169,119,74));
        
    }//GEN-LAST:event_ppItem1MouseEntered

    private void tbTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseExited
      
    }//GEN-LAST:event_tbTablaMouseExited

    private void ppItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppItem1MouseExited
          ppItem1.setBackground(new Color(169,119,74));
         ppItem1.setForeground(Color.BLACK);
    }//GEN-LAST:event_ppItem1MouseExited

    private void ppItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppItem2MouseEntered
        ppItem2.setBackground(Color.BLACK);
         ppItem2.setForeground(new Color(169,119,74));
    }//GEN-LAST:event_ppItem2MouseEntered

    private void ppItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppItem2MouseExited
         ppItem2.setBackground(new Color(169,119,74));
         ppItem2.setForeground(Color.BLACK);
    }//GEN-LAST:event_ppItem2MouseExited

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
       lblCabecera.setText("Entradas");
       txtBuscar.setText("Buscar Entradas...");
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnesActionPerformed
        lblCabecera.setText("Carnes");
        txtBuscar.setText("Buscar Carnes...");
    }//GEN-LAST:event_btnCarnesActionPerformed

    private void btnPescadosYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPescadosYActionPerformed
        lblCabecera.setText("Pescados Y Mariscos");
        txtBuscar.setText("Buscar Pescados Y Mariscos...");
    }//GEN-LAST:event_btnPescadosYActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        lblCabecera.setText("Postres");
        txtBuscar.setText("Buscar Postres...");
    }//GEN-LAST:event_btnPostresActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
       lblCabecera.setText("Bebidas");
       txtBuscar.setText("Buscar Bebidas...");
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
       frmDashboard board = new frmDashboard();
       board.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        frmAgregarProductos agregar = new frmAgregarProductos();
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnSopasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSopasActionPerformed
        lblCabecera.setText("Sopas");
        txtBuscar.setText("Buscar Sopas...");
    }//GEN-LAST:event_btnSopasActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private void miTabla(){
     //Modelo de mi tabla
     DefaultTableModel modelo = new DefaultTableModel();
     //Agregar columnas
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
       tbTabla.getTableHeader().setBackground(new java.awt.Color(116,85,31));
       tbTabla.getTableHeader().setForeground(Color.BLACK);
       //Tamaño de columnas
       tbTabla.getColumnModel().getColumn(0).setPreferredWidth(150);
       tbTabla.getColumnModel().getColumn(1).setPreferredWidth(10);
       //Centrar texto de columnas
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tbTabla.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnCarnes;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPescadosY;
    private javax.swing.JButton btnPostres;
    private javax.swing.JButton btnSopas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblLogo3;
    private javax.swing.JPanel pnPane1;
    private javax.swing.JPanel pnPaneTabla;
    private javax.swing.JMenuItem ppItem1;
    private javax.swing.JMenuItem ppItem2;
    private javax.swing.JPopupMenu ppMenuAct;
    private javax.swing.JTable tbTabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
