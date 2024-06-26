package proyecto2_segundocorte;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class view extends javax.swing.JFrame {

    list l = new list();

    public view() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        l.importer();

        jardinModel = (DefaultTableModel) jardinList.getModel();
        prejardinModel = (DefaultTableModel) prejardinList.getModel();

        updateLists();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        i = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        n = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ge = new javax.swing.JComboBox<>();
        gr = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        a = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        d = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prejardinList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jardinList = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        save.setText("Guardar");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 70, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("    X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Grado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        i.setBackground(new java.awt.Color(204, 204, 204));
        i.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        i.setForeground(new java.awt.Color(0, 0, 0));
        i.setBorder(null);
        jPanel1.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 140, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 170, -1));

        n.setBackground(new java.awt.Color(204, 204, 204));
        n.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        n.setForeground(new java.awt.Color(0, 0, 0));
        n.setBorder(null);
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 170, -1));

        ge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino", "Femenino" }));
        jPanel1.add(ge, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 130, -1));

        gr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grados", "Pre-jardin", "Jardin" }));
        jPanel1.add(gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 130, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Edad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        a.setBackground(new java.awt.Color(204, 204, 204));
        a.setForeground(new java.awt.Color(0, 0, 0));
        a.setMajorTickSpacing(1);
        a.setMaximum(6);
        a.setMinimum(4);
        a.setPaintLabels(true);
        a.setPaintTicks(true);
        a.setSnapToTicks(true);
        a.setValue(4);
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 150, 40));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 30));

        d.setBackground(new java.awt.Color(204, 204, 204));
        d.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        d.setForeground(new java.awt.Color(0, 0, 0));
        d.setBorder(null);
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese el id a eliminar:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        prejardinList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Prejardin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(prejardinList);
        if (prejardinList.getColumnModel().getColumnCount() > 0) {
            prejardinList.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 150, 200));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Genero:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jardinList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Jardin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jardinList);
        if (jardinList.getColumnModel().getColumnCount() > 0) {
            jardinList.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 150, 200));

        jButton2.setText("Reporte 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jButton3.setText("Reporte 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        l.addChildToEnd(i, n, ge, gr, a);

        updateLists();
        try {
            l.printTxt();
        } catch (IOException e) {
        }

    }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        l.Delete(d);
        updateLists();
        try {
            l.printTxt();
        } catch (IOException e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        l.reporte1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        l.reporte2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateLists() {
        jardinModel.setRowCount(0);
        prejardinModel.setRowCount(0);

        jardin current = l.fChild;
        if (current == null) {
            return;
        }

        do {
            if (current.Grade.equals("Pre-jardin")) {
                prejardinModel.addRow(new Object[]{current.toString()});
            } else {
                jardinModel.addRow(new Object[]{current.toString()});
            }
            current = current.next;
        } while (current != l.fChild);
    }

    private DefaultTableModel jardinModel;
    private DefaultTableModel prejardinModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider a;
    private javax.swing.JTextField d;
    private javax.swing.JComboBox<String> ge;
    private javax.swing.JComboBox<String> gr;
    private javax.swing.JTextField i;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jardinList;
    private javax.swing.JTextField n;
    private javax.swing.JTable prejardinList;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
