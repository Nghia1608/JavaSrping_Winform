/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DoAnQLSV.GUI;

/**
 *
 * @author kshin
 */
import DoAnQLSV.BLL.MonHocBLL;
import DoAnQLSV.DTO.MonHocDTO;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class QuanLyMonHocGUI extends javax.swing.JFrame {
    protected MonHocBLL monhocBLL;  
    protected static String MaMon;
    
    String button;

    public QuanLyMonHocGUI() {
        initComponents();
        monhocBLL = new MonHocBLL();
        monhocBLL.laydanhsachMonHoc();
        monhocBLL.hienThiDanhSachMonHoc(jTable1);

        SetButton(true);
        LockTxt(true);
    }
    public void LockTxt(boolean val)       // Khóa hết Textbox và ComboBox trước khi chọn nút chức năng
        {
            txtMaMon.setEnabled(!val);
            txtTenMon.setEnabled(!val);
            txtSoTiet.setEnabled(!val);
            txtSoTinChi.setEnabled(!val);
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

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        btnThem = new com.k33ptoo.components.KButton();
        btnXoa = new com.k33ptoo.components.KButton();
        btnSua = new com.k33ptoo.components.KButton();
        btnLuu = new com.k33ptoo.components.KButton();
        btnHuy = new com.k33ptoo.components.KButton();
        btnQuayVe = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        MaKho = new javax.swing.JLabel();
        txtTenMon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSoTiet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSoTinChi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new com.k33ptoo.components.KButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã môn học", "Tên môn", "Số tiết", "Số tín chỉ"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 810, 250));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Study\\icons8-list-50.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        footer.setOpaque(false);
        footer.setLayout(new java.awt.GridLayout(1, 6, 35, 0));

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
        footer.add(btnThem);

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
        footer.add(btnXoa);

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
        footer.add(btnSua);

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
        footer.add(btnLuu);

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
        footer.add(btnHuy);

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
        footer.add(btnQuayVe);

        kGradientPanel1.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 780, 30));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(4, 2, 20, 20));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mã môn học");
        jPanel1.add(jLabel2);

        txtMaMon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaMon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaMon.setToolTipText("");
        txtMaMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMaMon.setCaretColor(new java.awt.Color(204, 0, 205));
        txtMaMon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaMon.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtMaMon.setName(""); // NOI18N
        txtMaMon.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMonActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaMon);

        MaKho.setForeground(new java.awt.Color(204, 204, 204));
        MaKho.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MaKho.setText("Tên môn học");
        jPanel1.add(MaKho);

        txtTenMon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenMon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTenMon.setToolTipText("");
        txtTenMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTenMon.setCaretColor(new java.awt.Color(204, 0, 205));
        txtTenMon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenMon.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtTenMon.setName(""); // NOI18N
        txtTenMon.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtTenMon);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Số tiết");
        jPanel1.add(jLabel3);

        txtSoTiet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoTiet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoTiet.setToolTipText("");
        txtSoTiet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtSoTiet.setCaretColor(new java.awt.Color(204, 0, 205));
        txtSoTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSoTiet.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtSoTiet.setName(""); // NOI18N
        txtSoTiet.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtSoTiet);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Số tín chỉ");
        jPanel1.add(jLabel5);

        txtSoTinChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoTinChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoTinChi.setToolTipText("");
        txtSoTinChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtSoTinChi.setCaretColor(new java.awt.Color(204, 0, 205));
        txtSoTinChi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSoTinChi.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtSoTinChi.setName(""); // NOI18N
        txtSoTinChi.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtSoTinChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTinChiActionPerformed(evt);
            }
        });
        jPanel1.add(txtSoTinChi);

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 410, 200));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 20, 20));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimKiem.setToolTipText("");
        txtTimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTimKiem.setCaretColor(new java.awt.Color(204, 0, 205));
        txtTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTimKiem.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtTimKiem.setName(""); // NOI18N
        txtTimKiem.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtTimKiem);

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
        jPanel2.add(btnTimKiem);

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 200, 100));

        header.setOpaque(false);
        header.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ MÔN HỌC");
        header.add(jLabel1);

        kGradientPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaMonActionPerformed

    private void txtSoTinChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTinChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTinChiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
            button ="them";
            LockTxt(false);
            SetButton(false);            
    }//GEN-LAST:event_btnThemActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
            int row = jTable1.getSelectedRow();
            this.txtMaMon.setText(jTable1.getModel().getValueAt(row, 0).toString());
            this.txtTenMon.setText(jTable1.getModel().getValueAt(row, 1).toString());
            this.txtSoTiet.setText(jTable1.getModel().getValueAt(row, 2).toString());
            this.txtSoTinChi.setText(jTable1.getModel().getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
            button ="xoa";
            LockTxt(false);
            SetButton(false);     
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
            button ="sua";
            LockTxt(false);
            SetButton(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
           MonHocDTO mh = new MonHocDTO();
            mh.setMaMon(txtTimKiem.getText());
            mh.setTenMon(txtTimKiem.getText());
            monhocBLL.Timkiem(mh, jTable1);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setVisible(false);
        new MenuGUI().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnQuayVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayVeActionPerformed
        this.setVisible(false);
        new MenuGUI().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_btnQuayVeActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        LockTxt(true);
        if(button=="them"){
         if (this.txtMaMon.getText().length() == 0)
        {
              JOptionPane.showMessageDialog(null,"Mã môn học không được bỏ trống","Thông báo",1);
            txtMaMon.grabFocus();
            txtMaMon.setBackground(Color.red);
            return;
        }
        if(this.txtMaMon.getText().length()>6)
        {
              JOptionPane.showMessageDialog(null,"Mã môn học không được vượt quá 6 ký tự","Thông báo",1);
            txtMaMon.grabFocus();
            txtMaMon.setBackground(Color.red);
            return;
        }
        if (this.txtTenMon.getText().length() == 0)
        {
                   JOptionPane.showMessageDialog(null,"Tên môn học không được bỏ trống","Thông báo",1);
            txtTenMon.grabFocus();
            txtTenMon.setBackground(Color.red);
            return;
        }
        if (this.txtTenMon.getText().length() > 30 )
        {
                   JOptionPane.showMessageDialog(null,"Tên môn học không được vượt quá 30 ký tự","Thông báo",1);
            txtTenMon.grabFocus();
            txtTenMon.setBackground(Color.red);
            return;
        }
        if (this.txtSoTiet.getText().length() == 0)
        {
             JOptionPane.showMessageDialog(null,"Số tiết không được bỏ trống","Thông báo",1);
             txtSoTiet.grabFocus();
             txtSoTiet.setBackground(Color.red);
             return;
        }
        if (Integer.parseInt(txtSoTiet.getText())>50)
        {
             JOptionPane.showMessageDialog(null,"Số tiết không được vượt quá 50","Thông báo",1);
             txtSoTiet.grabFocus();
             txtSoTiet.setBackground(Color.red);
             return;
        }
        if (this.txtSoTinChi.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Số tín chỉ không được bỏ trống","Thông báo",1);
             txtSoTinChi.grabFocus();
             txtSoTinChi.setBackground(Color.red);
             return;
        }
        if (Integer.parseInt(txtSoTinChi.getText())>5)
        {
            JOptionPane.showMessageDialog(null,"Số tín chỉ không được vượt quá 5","Thông báo",1);
             txtSoTinChi.grabFocus();
             txtSoTinChi.setBackground(Color.red);
             return;
        }

        MonHocDTO monhoc = new MonHocDTO();
        monhoc.setMaMon(txtMaMon.getText());
        monhoc.setTenMon(txtTenMon.getText());
        monhoc.setSoTiet(Integer.parseInt(txtSoTiet.getText()));
        monhoc.setSoTinChi(Integer.parseInt(txtSoTinChi.getText()));
        monhocBLL.themMonHoc(monhoc);
        monhocBLL.laydanhsachMonHoc();
        monhocBLL.hienThiDanhSachMonHoc(jTable1);
        JOptionPane.showMessageDialog(this, monhocBLL.message, "Thêm môn", JOptionPane.INFORMATION_MESSAGE);  
            }
        if(button=="sua"){
        if (this.txtMaMon.getText().length() == 0)
        {
              JOptionPane.showMessageDialog(null,"Mã môn học không được bỏ trống","Thông báo",1);
            txtMaMon.grabFocus();
            txtMaMon.setBackground(Color.red);
            return;
        }
        if(this.txtMaMon.getText().length()>6)
        {
              JOptionPane.showMessageDialog(null,"Mã môn học không được vượt quá 6 ký tự","Thông báo",1);
            txtMaMon.grabFocus();
            txtMaMon.setBackground(Color.red);
            return;
        }
        if (this.txtTenMon.getText().length() == 0)
        {
                   JOptionPane.showMessageDialog(null,"Tên môn học không được bỏ trống","Thông báo",1);
            txtTenMon.grabFocus();
            txtTenMon.setBackground(Color.red);
            return;
        }
        if (this.txtTenMon.getText().length() > 30 )
        {
                   JOptionPane.showMessageDialog(null,"Tên môn học không được vượt quá 30 ký tự","Thông báo",1);
            txtTenMon.grabFocus();
            txtTenMon.setBackground(Color.red);
            return;
        }
        if (this.txtSoTiet.getText().length() == 0)
        {
             JOptionPane.showMessageDialog(null,"Số tiết không được bỏ trống","Thông báo",1);
             txtSoTiet.grabFocus();
             txtSoTiet.setBackground(Color.red);
             return;
        }
        if (this.txtSoTiet.getText().length() > 2)
        {
             JOptionPane.showMessageDialog(null,"Số tiết không được vượt quá 2 ký tự","Thông báo",1);
             txtSoTiet.grabFocus();
             txtSoTiet.setBackground(Color.red);
             return;
        }
        if (this.txtSoTinChi.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Số tín chỉ không được bỏ trống","Thông báo",1);
             txtSoTinChi.grabFocus();
             txtSoTinChi.setBackground(Color.red);
             return;
        }
        if (this.txtSoTinChi.getText().length() > 1)
        {
            JOptionPane.showMessageDialog(null,"Số tín chỉ không được vượt quá 1 ký tự","Thông báo",1);
             txtSoTinChi.grabFocus();
             txtSoTinChi.setBackground(Color.red);
             return;
        }
        MonHocDTO monhoc = new MonHocDTO();
        monhoc.setMaMon(txtMaMon.getText());
        monhoc.setTenMon(txtTenMon.getText());
        monhoc.setSoTiet(Integer.parseInt(txtSoTiet.getText()));
        monhoc.setSoTinChi(Integer.parseInt(txtSoTinChi.getText()));
        monhocBLL.suaMonHoc(monhoc);
        monhocBLL.laydanhsachMonHoc();
        monhocBLL.hienThiDanhSachMonHoc(jTable1);
        JOptionPane.showMessageDialog(this, monhocBLL.message, "Sửa môn", JOptionPane.INFORMATION_MESSAGE);
        }
        if(button=="xoa"){
        if (this.txtMaMon.getText().length() == 0)
        {
              JOptionPane.showMessageDialog(null,"Mã môn học không được bỏ trống","Thông báo",1);
            txtMaMon.grabFocus();
            txtMaMon.setBackground(Color.red);
        }else{
        MonHocDTO monhoc = new MonHocDTO();
        monhoc.setMaMon(txtMaMon.getText());
        monhocBLL.xoaMonHoc(monhoc);
        monhocBLL.laydanhsachMonHoc();
        monhocBLL.hienThiDanhSachMonHoc(jTable1);       
        JOptionPane.showMessageDialog(this, monhocBLL.message, "Xóa môn", JOptionPane.INFORMATION_MESSAGE);
        }
            }
                    SetButton(true); 
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        LockTxt(true);
        SetButton(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed
    
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
            java.util.logging.Logger.getLogger(QuanLyMonHocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyMonHocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyMonHocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyMonHocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new QuanLyMonHocGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaKho;
    private com.k33ptoo.components.KButton btnHuy;
    private com.k33ptoo.components.KButton btnLuu;
    private com.k33ptoo.components.KButton btnQuayVe;
    private com.k33ptoo.components.KButton btnSua;
    private com.k33ptoo.components.KButton btnThem;
    private com.k33ptoo.components.KButton btnTimKiem;
    private com.k33ptoo.components.KButton btnXoa;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtSoTiet;
    private javax.swing.JTextField txtSoTinChi;
    private javax.swing.JTextField txtTenMon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
