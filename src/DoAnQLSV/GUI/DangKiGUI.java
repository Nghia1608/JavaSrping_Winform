
package DoAnQLSV.GUI;


import DoAnQLSV.BLL.DangKiBLL;
import DoAnQLSV.DTO.DangKiDTO;
import DoAnQLSV.DTO.SinhVienDTO;
import DoAnQLSV.util.Validation;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;


public class DangKiGUI extends javax.swing.JFrame {

    protected DangKiBLL dangKiBLL;  
    protected static String ID;
    
    public DangKiGUI() {
        initComponents();
        dangKiBLL = new DangKiBLL();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        btnDangKi = new com.k33ptoo.components.KButton();
        btnDangNhap = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        btnReset = new com.k33ptoo.components.KButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(500, 250));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel1KeyPressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDangKi.setText("Đăng kí");
        btnDangKi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDangKi.setkBorderRadius(30);
        btnDangKi.setkEndColor(new java.awt.Color(0, 255, 255));
        btnDangKi.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnDangKi.setkStartColor(new java.awt.Color(252, 203, 252));
        btnDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnDangKi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 150, 30));

        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDangNhap.setkBorderRadius(30);
        btnDangNhap.setkEndColor(new java.awt.Color(0, 204, 255));
        btnDangNhap.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnDangNhap.setkHoverStartColor(new java.awt.Color(204, 0, 204));
        btnDangNhap.setkStartColor(new java.awt.Color(252, 203, 252));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 160, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Study\\icons8-list-50.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnReset.setText("Quay về");
        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setkBorderRadius(30);
        btnReset.setkEndColor(new java.awt.Color(0, 255, 255));
        btnReset.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnReset.setkStartColor(new java.awt.Color(252, 203, 252));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 90, 30));

        header.setOpaque(false);
        header.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG KÍ");
        header.add(jLabel1);

        kGradientPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, 30));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(8, 1, 20, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tên đăng nhập");
        jPanel1.add(jLabel5);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setToolTipText("");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsername.setCaretColor(new java.awt.Color(204, 0, 205));
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsername.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtUsername.setName(""); // NOI18N
        txtUsername.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gmail");
        jPanel1.add(jLabel6);

        txtGmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGmail.setToolTipText("");
        txtGmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtGmail.setCaretColor(new java.awt.Color(204, 0, 205));
        txtGmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtGmail.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtGmail.setName(""); // NOI18N
        txtGmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtGmail);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mật khẩu");
        jPanel1.add(jLabel7);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPassword.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtPassword.setName(""); // NOI18N
        jPanel1.add(txtPassword);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Xác nhận mật khẩu");
        jPanel1.add(jLabel9);

        txtConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtConfirmPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtConfirmPassword.setName(""); // NOI18N
        jPanel1.add(txtConfirmPassword);

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 280, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKiActionPerformed
        if (this.txtUsername.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Tên tài khoản không được bỏ trống","Thông báo",1);
            txtUsername.grabFocus();
            txtUsername.setBackground(Color.red);
            return;
        }
        if (this.txtUsername.getText().length() > 10)
        {
            JOptionPane.showMessageDialog(null,"Tên tài khoản không được vượt quá 10 ký tự","Thông báo",1);
            txtUsername.grabFocus();
            txtUsername.setBackground(Color.red);
            return;
        }
        if (this.txtPassword.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Mật khẩu không được bỏ trống","Thông báo",1);
            txtPassword.grabFocus();
            txtPassword.setBackground(Color.red);
            return;
        }
        if (this.txtPassword.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null,"Mật khẩu không được vượt quá 50 ký tự","Thông báo",1);
            txtPassword.grabFocus();
            txtPassword.setBackground(Color.red);
            return;
        }        
        boolean flag;
        flag = Validation.isEmail(txtGmail.getText());
        if (flag == false)
        {
            JOptionPane.showMessageDialog(null,"Email không đúng định dạng","Thông báo",1);
            txtGmail.grabFocus();
            txtGmail.setBackground(Color.red);
            return;
        }
        if (this.txtConfirmPassword.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Mật khẩu xác nhận không được bỏ trống","Thông báo",1);
            txtConfirmPassword.grabFocus();
            txtConfirmPassword.setBackground(Color.red);
            return;
        }
        if (this.txtConfirmPassword.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null,"Mật khẩu xác nhận không được vượt quá 50 ký tự","Thông báo",1);
            txtConfirmPassword.grabFocus();
            txtConfirmPassword.setBackground(Color.red);
            return;
        } 
        if (this.txtConfirmPassword.getText().compareTo(this.txtPassword.getText())!=0)
        {
            JOptionPane.showMessageDialog(null,"Mật khẩu xác nhận không khớp mật khẩu","Thông báo",1);
            txtConfirmPassword.grabFocus();
            txtConfirmPassword.setBackground(Color.red);
            return;
        }
        DangKiDTO taikhoan = new DangKiDTO();
        taikhoan.setID(txtUsername.getText());
        taikhoan.setMSSV(txtUsername.getText());
        taikhoan.setGmail(txtGmail.getText());
        taikhoan.setPassword(txtPassword.getText());
        taikhoan.setCofirm(txtConfirmPassword.getText());
        taikhoan.setQuyen("SV");        
        dangKiBLL.themTaiKhoan(taikhoan);
        JOptionPane.showMessageDialog(this, dangKiBLL.message, "Thêm tài khoản", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDangKiActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        this.setVisible(false);
        new LoginGUI().setVisible(true);         
    }//GEN-LAST:event_btnDangNhapActionPerformed
    
    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed

    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void txtGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGmailActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        new MenuGUI().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.setVisible(false);
        new MenuGUI().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(DangKiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DangKiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnDangKi;
    private com.k33ptoo.components.KButton btnDangNhap;
    private com.k33ptoo.components.KButton btnReset;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
