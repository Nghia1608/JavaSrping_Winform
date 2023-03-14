/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DoAnQLSV.GUI;

/**
 *
 * @author kshin
 */
import DoAnQLSV.BLL.KhoaBLL;
import DoAnQLSV.DTO.KhoaDTO;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class QuanLyKhoaGUI extends javax.swing.JFrame {

        protected KhoaBLL khoaBLL;  
        protected static String MaKhoa;
                String button;
                
        public QuanLyKhoaGUI(){
            initComponents();
            khoaBLL = new KhoaBLL();
            khoaBLL.laydanhsachKhoa();
            khoaBLL.hienThiDanhSachKhoa(jTableKhoa);
            
                        SetButton(true);
            LockTxt(true);
        }
    public void LockTxt(boolean val)       // Khóa hết Textbox và ComboBox trước khi chọn nút chức năng
        {
            txtMaKhoa.setEnabled(!val);
            txtTenKhoa.setEnabled(!val);

        }
        public void SetButton(boolean val)
        {
            btnThem.setEnabled(val);
            btnXoa.setEnabled(val);
            btnSua.setEnabled(val);
            btnLuu.setEnabled(!val);
            btnHuy.setEnabled(!val);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KGradientPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKhoa = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new com.k33ptoo.components.KButton();
        txtTimKiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        MaKho = new javax.swing.JLabel();
        txtMaKhoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhoa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        footer1 = new javax.swing.JPanel();
        btnThem = new com.k33ptoo.components.KButton();
        btnXoa = new com.k33ptoo.components.KButton();
        btnSua = new com.k33ptoo.components.KButton();
        btnLuu = new com.k33ptoo.components.KButton();
        btnHuy = new com.k33ptoo.components.KButton();
        btnQuayVe = new com.k33ptoo.components.KButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KGradientPanel.setkEndColor(new java.awt.Color(204, 0, 204));
        KGradientPanel.setkStartColor(new java.awt.Color(0, 204, 204));
        KGradientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        KGradientPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 150, -1));

        jTableKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Khoa", "Tên Khoa"
            }
        ));
        jTableKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKhoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKhoa);

        KGradientPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 810, 210));

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        jPanel4.setToolTipText("Quản lý khoa");
        jPanel4.setAutoscrolls(true);
        jPanel4.setOpaque(false);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 10, 20));

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setkBorderRadius(30);
        btnTimKiem.setkEndColor(new java.awt.Color(0, 255, 255));
        btnTimKiem.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnTimKiem.setkStartColor(new java.awt.Color(252, 203, 252));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimKiem);

        txtTimKiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimKiem.setToolTipText("");
        txtTimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTimKiem.setCaretColor(new java.awt.Color(204, 0, 205));
        txtTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTimKiem.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtTimKiem.setName(""); // NOI18N
        txtTimKiem.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(txtTimKiem);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 30, 30));

        MaKho.setForeground(new java.awt.Color(204, 204, 204));
        MaKho.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MaKho.setText("Mã khoa");
        jPanel2.add(MaKho);

        txtMaKhoa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaKhoa.setToolTipText("");
        txtMaKhoa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMaKhoa.setCaretColor(new java.awt.Color(204, 0, 205));
        txtMaKhoa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaKhoa.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtMaKhoa.setName(""); // NOI18N
        txtMaKhoa.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMaKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKhoaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMaKhoa);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tên khoa");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2);

        txtTenKhoa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTenKhoa.setToolTipText("");
        txtTenKhoa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTenKhoa.setCaretColor(new java.awt.Color(204, 0, 205));
        txtTenKhoa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenKhoa.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtTenKhoa.setName(""); // NOI18N
        txtTenKhoa.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTenKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhoaActionPerformed(evt);
            }
        });
        jPanel2.add(txtTenKhoa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        KGradientPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 470, 160));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Study\\icons8-list-50.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        KGradientPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        footer1.setOpaque(false);
        footer1.setLayout(new java.awt.GridLayout(1, 6, 35, 0));

        btnThem.setText("Thêm");
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setkBorderRadius(30);
        btnThem.setkEndColor(new java.awt.Color(0, 204, 255));
        btnThem.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnThem.setkHoverStartColor(new java.awt.Color(204, 0, 204));
        btnThem.setkStartColor(new java.awt.Color(252, 203, 252));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        footer1.add(btnThem);

        btnXoa.setText("Xóa");
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setkBorderRadius(30);
        btnXoa.setkEndColor(new java.awt.Color(0, 255, 255));
        btnXoa.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnXoa.setkStartColor(new java.awt.Color(252, 203, 252));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        footer1.add(btnXoa);

        btnSua.setText("Sửa");
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setkBorderRadius(30);
        btnSua.setkEndColor(new java.awt.Color(0, 255, 255));
        btnSua.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSua.setkStartColor(new java.awt.Color(252, 203, 252));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        footer1.add(btnSua);

        btnLuu.setText("Lưu");
        btnLuu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLuu.setkBorderRadius(30);
        btnLuu.setkEndColor(new java.awt.Color(0, 255, 255));
        btnLuu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLuu.setkStartColor(new java.awt.Color(252, 203, 252));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        footer1.add(btnLuu);

        btnHuy.setText("Hủy");
        btnHuy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHuy.setkBorderRadius(30);
        btnHuy.setkEndColor(new java.awt.Color(0, 255, 255));
        btnHuy.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnHuy.setkStartColor(new java.awt.Color(252, 203, 252));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        footer1.add(btnHuy);

        btnQuayVe.setText("Quay về");
        btnQuayVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuayVe.setkBorderRadius(30);
        btnQuayVe.setkEndColor(new java.awt.Color(0, 255, 255));
        btnQuayVe.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnQuayVe.setkStartColor(new java.awt.Color(252, 203, 252));
        btnQuayVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayVeActionPerformed(evt);
            }
        });
        footer1.add(btnQuayVe);

        KGradientPanel.add(footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 780, 30));

        header.setOpaque(false);
        header.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHOA");
        header.add(jLabel1);

        KGradientPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KGradientPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        LockTxt(true);
        SetButton(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        LockTxt(true);
        if(button=="them"){
            if (this.txtMaKhoa.getText().length() == 0)
        {
              JOptionPane.showMessageDialog(null,"Mã khoa không được bỏ trống","Thông báo",1);
            txtMaKhoa.grabFocus();
            txtMaKhoa.setBackground(Color.red);
            return;
        }
        if(this.txtMaKhoa.getText().length()>3)
        {
              JOptionPane.showMessageDialog(null,"Mã khoa không được vượt quá 3 ký tự","Thông báo",1);
            txtMaKhoa.grabFocus();
            txtMaKhoa.setBackground(Color.red);
            return;
        }
        if (this.txtTenKhoa.getText().length() == 0)
        {
                   JOptionPane.showMessageDialog(null,"Tên khoa không được bỏ trống","Thông báo",1);
                  txtTenKhoa.grabFocus();
                   txtTenKhoa.setBackground(Color.red);
                   return;
        }
        if (this.txtTenKhoa.getText().length() > 30)
        {
                   JOptionPane.showMessageDialog(null,"Tên khoa không được vượt quá 30 ký tự","Thông báo",1);
                  txtTenKhoa.grabFocus();
                   txtTenKhoa.setBackground(Color.red);
                   return;
        }
        KhoaDTO khoa = new KhoaDTO();
        khoa.setMaKhoa(txtMaKhoa.getText());
        khoa.setTenKhoa(txtTenKhoa.getText());
        khoaBLL.themKhoa(khoa);
        khoaBLL.laydanhsachKhoa();
        khoaBLL.hienThiDanhSachKhoa(jTableKhoa);
        JOptionPane.showMessageDialog(this, khoaBLL.message, "Thêm khoa", JOptionPane.INFORMATION_MESSAGE);
            }
        if(button=="sua"){
        if (this.txtMaKhoa.getText().length() == 0)
        {
              JOptionPane.showMessageDialog(null,"Mã khoa không được bỏ trống","Thông báo",1);
            txtMaKhoa.grabFocus();
            txtMaKhoa.setBackground(Color.red);
            return;
        }
        if(this.txtMaKhoa.getText().length()>3)
        {
              JOptionPane.showMessageDialog(null,"Mã khoa không được vượt quá 3 ký tự","Thông báo",1);
            txtMaKhoa.grabFocus();
            txtMaKhoa.setBackground(Color.red);
            return;
        }
        if (this.txtTenKhoa.getText().length() == 0)
        {
                   JOptionPane.showMessageDialog(null,"Tên khoa không được bỏ trống","Thông báo",1);
                  txtTenKhoa.grabFocus();
                   txtTenKhoa.setBackground(Color.red);
                   return;
        }
        if (this.txtTenKhoa.getText().length() > 30)
        {
                   JOptionPane.showMessageDialog(null,"Tên khoa không được vượt quá 30 ký tự","Thông báo",1);
                  txtTenKhoa.grabFocus();
                   txtTenKhoa.setBackground(Color.red);
                   return;
        }
        
        KhoaDTO khoa = new KhoaDTO();
        khoa.setMaKhoa(txtMaKhoa.getText());
        khoa.setTenKhoa(txtTenKhoa.getText());
        khoaBLL.suaKhoa(khoa);
        khoaBLL.laydanhsachKhoa();
        khoaBLL.hienThiDanhSachKhoa(jTableKhoa);
        JOptionPane.showMessageDialog(this, khoaBLL.message, "Sửa khoa", JOptionPane.INFORMATION_MESSAGE);
        }
        if(button=="xoa"){
 if (this.txtMaKhoa.getText().length() == 0)
        {
              JOptionPane.showMessageDialog(null,"Mã khoa không được bỏ trống","Thông báo",1);
            txtMaKhoa.grabFocus();
            txtMaKhoa.setBackground(Color.red);
        }else{
        KhoaDTO khoa = new KhoaDTO();
        khoa.setMaKhoa(txtMaKhoa.getText());
        khoaBLL.xoaKhoa(khoa);
        khoaBLL.laydanhsachKhoa();
        khoaBLL.hienThiDanhSachKhoa(jTableKhoa);
        JOptionPane.showMessageDialog(this, khoaBLL.message, "Xóa khoa", JOptionPane.INFORMATION_MESSAGE);            
            }    
        }
        SetButton(true);  
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
            button ="sua";
            LockTxt(false);
            SetButton(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtMaKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKhoaActionPerformed

    private void txtTenKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhoaActionPerformed

    private void jTableKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKhoaMouseClicked
            DefaultTableModel model =(DefaultTableModel) jTableKhoa.getModel();
            int row = jTableKhoa.getSelectedRow();
            this.txtMaKhoa.setText(jTableKhoa.getModel().getValueAt(row, 0).toString());
            this.txtTenKhoa.setText(jTableKhoa.getModel().getValueAt(row, 1).toString());
    }//GEN-LAST:event_jTableKhoaMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
            button ="them";
            LockTxt(false);
            SetButton(false);        

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
            button ="xoa";
            LockTxt(false);
            SetButton(false);  

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
            KhoaDTO k = new KhoaDTO();
            k.setMaKhoa(txtTimKiem.getText());
            k.setTenKhoa(txtTimKiem.getText());
            khoaBLL.Timkiem(k, jTableKhoa);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        new MenuGUI().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnQuayVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayVeActionPerformed
        this.setVisible(false);
        new MenuGUI().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_btnQuayVeActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyKhoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhoaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel KGradientPanel;
    private javax.swing.JLabel MaKho;
    private com.k33ptoo.components.KButton btnHuy;
    private com.k33ptoo.components.KButton btnLuu;
    private com.k33ptoo.components.KButton btnQuayVe;
    private com.k33ptoo.components.KButton btnSua;
    private com.k33ptoo.components.KButton btnThem;
    private com.k33ptoo.components.KButton btnTimKiem;
    private com.k33ptoo.components.KButton btnXoa;
    private javax.swing.JPanel footer1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKhoa;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtTenKhoa;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
