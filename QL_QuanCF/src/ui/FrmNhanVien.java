package ui;

import dao.NhanVienDAO;
import entity.NhanVien;
import java.awt.event.KeyEvent;
import utils.Auth;
import utils.MsgBox;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmNhanVien extends javax.swing.JFrame {

    public FrmNhanVien(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
        init();
        btnTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimKeyPressed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        home1 = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbMaNV = new javax.swing.JLabel();
        lbHoten = new javax.swing.JLabel();
        lbGioitinh = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        lblPhanQuyen = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        txtMaNV = new javax.swing.JTextField();
        btnMoi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        lblTrangThai = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hình/Nước.jpg"))); // NOI18N
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hình/dấu tích.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hình/Sửa.jpg"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hình/Xóa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hình/Tìm (1).png"))); // NOI18N
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        btnTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTimKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tìm kiếm");

        txtTim.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        txtTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimMouseClicked(evt);
            }
        });
        txtTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKeyPressed(evt);
            }
        });

        lbMaNV.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbMaNV.setText("Mã Nhân viên:");

        lbHoten.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbHoten.setText("Họ và Tên:");

        lbGioitinh.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbGioitinh.setText("Giới tính:");

        lbSDT.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lbSDT.setText("Số điện thoại:");

        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSDTKeyReleased(evt);
            }
        });

        lblPhanQuyen.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblPhanQuyen.setText("Phân quyền:");

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNu.setText("Nữ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("THÔNG TIN NHÂN VIÊN");

        buttonGroup2.add(rdoTruongPhong);
        rdoTruongPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoTruongPhong.setText("Trưởng phòng");

        buttonGroup2.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lbHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoTruongPhong)
                        .addGap(128, 128, 128)
                        .addComponent(lbGioitinh)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMaNV)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbHoten)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPhanQuyen)
                        .addComponent(rdoNhanVien))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGioitinh)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdoNu)
                                .addComponent(rdoNam))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoTruongPhong)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hình/Thêm.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("QUẢN LÍ NHÂN VIÊN");

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hình/Nước.jpg"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaNV", "TenNV", "SDT", "GioiTinh", "PhanQuyen"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))))
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblTrangThai))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyReleased

    }//GEN-LAST:event_txtSDTKeyReleased

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        FrmGiaoDienChinh home = new FrmGiaoDienChinh();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        this.timKiem();
    }//GEN-LAST:event_btnTimActionPerformed

    // Sự kiện của nút Sửa
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    // Sự kiện của nút Xóa
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    // Sự kiện người dùng click vào text field tìm kiếm
    private void txtTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimMouseClicked

    }//GEN-LAST:event_txtTimMouseClicked

    // Sự kiện cancel
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

    }//GEN-LAST:event_formMouseReleased

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblNhanVien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnTimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTimKeyPressed

    }//GEN-LAST:event_btnTimKeyPressed

    private void txtTimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        timKiem();
        }
    }//GEN-LAST:event_txtTimKeyPressed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home1ActionPerformed
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
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmNhanVien dialog = new FrmNhanVien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbGioitinh;
    private javax.swing.JLabel lbHoten;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lblPhanQuyen;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
    NhanVienDAO dao = new NhanVienDAO();
    int row = -1;

    void init() {
        setLocationRelativeTo(null); // đưa cửa sổ ra giữa màn hình
        this.fillTable(); // đổ dữ liệu nhân viên vào bảng
        this.updateStatus(); // cập nhật trạng thái form
        rdoNhanVien.setSelected(true);
        rdoNu.setSelected(true);
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTim.getText();
            List<NhanVien> list = dao.selectByKeyword(keyword);
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getTenNV(),
                    nv.getSDT(),
                    nv.isGioitinh() ? "Nữ" : "Nam",
                    nv.isPhanquyen() ? "Trưởng phòng" : "Nhân viên"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        NhanVien nv = this.getForm();
        try {
            dao.insert(nv); // thêm mới
            this.fillTable(); // đỗ lại bảng
            this.clearForm(); // xóa trắng form
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        NhanVien nv = this.getForm();
        try {
            dao.update(nv); // cập nhật
            this.fillTable(); // đổ lại bảng
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            String manv = txtMaNV.getText();
            if (manv.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không được xóa chính bạn!");
            } else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
                try {
                    dao.delete(manv);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
    }

    private void timKiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String manv = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien nv = dao.selectById(manv);
        this.setForm(nv);
        this.updateStatus();
        rdoNhanVien.setSelected(true);
        rdoNu.setSelected(true);
    }

    void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtTenNV.setText(nv.getTenNV());
        txtSDT.setText(nv.getSDT());
        rdoNhanVien.setSelected(nv.isPhanquyen());
        rdoTruongPhong.setSelected(nv.isPhanquyen());
        rdoNam.setSelected(!nv.isGioitinh());
        rdoNu.setSelected(!nv.isGioitinh());
    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtTenNV.getText());
        nv.setSDT(txtSDT.getText());
        nv.setPhanquyen(rdoTruongPhong.isSelected());
        nv.setGioitinh(rdoNam.isSelected());
        return nv;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        // Trạng thái form
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    boolean isValidated() {
        NhanVien nv = this.getForm();
        if (nv.getMaNV().length() == 0) {
            MsgBox.alert(this, "Không để trống mã nhân viên!");
        } else if (nv.getTenNV().length() == 0) {
            MsgBox.alert(this, "Không để trống họ và tên nhân viên!");
        } else if (nv.getSDT().length() == 0) {
            MsgBox.alert(this, "Không để trống số điện thoại!");
        } else {
            return true;
        }
        return false;
    }
}
