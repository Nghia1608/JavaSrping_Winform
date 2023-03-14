
package DoAnQLSV.GUI;


import DoAnQLSV.BLL.*;
import DoAnQLSV.DAO.*;
import DoAnQLSV.DTO.*;
import java.awt.Color;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class QuanLyLopGUI extends javax.swing.JFrame {
    

    public static String MaLop;
    protected LopBLL lopBLL;  
    protected KhoaBLL khoaBLL;
    protected KhoaHocBLL khoaHocBLL;
    String button;
    
    public QuanLyLopGUI(){
        initComponents();
        lopBLL = new LopBLL();
        lopBLL.laydanhsachLop();
        lopBLL.hienThiDanhSachLop(jTableLop);
        
        khoaBLL = new KhoaBLL();
        khoaBLL.laydanhsachKhoa();
        khoaBLL.LoadCBBMaKhoa(cbbMaKhoa);
        
        khoaHocBLL = new KhoaHocBLL();
        khoaHocBLL.laydanhsachKhoaHoc();
        khoaHocBLL.LoadCBBMaKhoaHoc(cbbMaKhoaHoc);
        
        SetButton(true);
        LockTxt(true);
    }
    public void LockTxt(boolean val)       // Khóa hết Textbox và ComboBox trước khi chọn nút chức năng
        {
            cbbMaKhoa.setEnabled(!val);
            txtMaLop.setEnabled(!val);
            txtTenLop.setEnabled(!val);
            txtSiSo.setEnabled(!val);
            cbbMaKhoaHoc.setEnabled(!val);
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
        jTableLop = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbbMaKhoa = new javax.swing.JComboBox<>();
        MaKho1 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSiSo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbMaKhoaHoc = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new com.k33ptoo.components.KButton();
        jLabel6 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        btnThem = new com.k33ptoo.components.KButton();
        btnXoa = new com.k33ptoo.components.KButton();
        btnSua = new com.k33ptoo.components.KButton();
        btnLuu = new com.k33ptoo.components.KButton();
        btnHuy = new com.k33ptoo.components.KButton();
        btnQuayVe = new com.k33ptoo.components.KButton();
        header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý lớp");

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 150, -1));

        jTableLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Lớp", "Tên lớp", "Sỉ số", "Mã khóa học", "Mã Khoa"
            }
        ));
        jTableLop.setGridColor(new java.awt.Color(204, 204, 204));
        jTableLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLop);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 810, 250));

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        jPanel4.setOpaque(false);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(5, 2, 20, 10));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mã Khoa");
        jPanel2.add(jLabel2);

        cbbMaKhoa.setBorder(null);
        cbbMaKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaKhoaActionPerformed(evt);
            }
        });
        jPanel2.add(cbbMaKhoa);

        MaKho1.setForeground(new java.awt.Color(204, 204, 204));
        MaKho1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MaKho1.setText("Mã Lớp");
        jPanel2.add(MaKho1);

        txtMaLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaLop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaLop.setToolTipText("");
        txtMaLop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMaLop.setCaretColor(new java.awt.Color(204, 0, 205));
        txtMaLop.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaLop.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtMaLop.setName(""); // NOI18N
        txtMaLop.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtMaLop);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tên lớp");
        jPanel2.add(jLabel3);

        txtTenLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenLop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTenLop.setToolTipText("");
        txtTenLop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTenLop.setCaretColor(new java.awt.Color(204, 0, 205));
        txtTenLop.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenLop.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtTenLop.setName(""); // NOI18N
        txtTenLop.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtTenLop);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sỉ số");
        jPanel2.add(jLabel5);

        txtSiSo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSiSo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSiSo.setToolTipText("");
        txtSiSo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtSiSo.setCaretColor(new java.awt.Color(204, 0, 205));
        txtSiSo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSiSo.setMargin(new java.awt.Insets(16, 6, 2, 6));
        txtSiSo.setName(""); // NOI18N
        txtSiSo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtSiSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiSoActionPerformed(evt);
            }
        });
        jPanel2.add(txtSiSo);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Mã khóa học");
        jPanel2.add(jLabel4);

        jPanel2.add(cbbMaKhoaHoc);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 10, 20));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 550, 230));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Study\\icons8-list-50.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        header.setOpaque(false);
        header.setLayout(new java.awt.GridLayout(1, 1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("QUẢN LÝ LỚP");
        header.add(jLabel7);

        kGradientPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSiSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiSoActionPerformed

    private void cbbMaKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaKhoaActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_cbbMaKhoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
            button ="them";
            LockTxt(false);
            SetButton(false); 
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
            LopDTO lop = new LopDTO();
            lop.setMaLop(txtTimKiem.getText());
            lop.setTenLop(txtTimKiem.getText());
            lopBLL.Timkiem(lop, jTableLop);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
                    button ="xoa";
            LockTxt(false);
            SetButton(false); 
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jTableLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLopMouseClicked
            DefaultTableModel model =(DefaultTableModel) jTableLop.getModel();
            int row = jTableLop.getSelectedRow();
            this.txtMaLop.setText(jTableLop.getModel().getValueAt(row, 0).toString());
            this.txtTenLop.setText(jTableLop.getModel().getValueAt(row, 1).toString());
            this.txtSiSo.setText(jTableLop.getModel().getValueAt(row, 2).toString());
            this.cbbMaKhoaHoc.setSelectedItem(jTableLop.getModel().getValueAt(row, 3).toString());             
            this.cbbMaKhoa.setSelectedItem(jTableLop.getModel().getValueAt(row, 4).toString());       // TODO add your handling code here:

    }//GEN-LAST:event_jTableLopMouseClicked
    
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
	    button ="sua";
            LockTxt(false);
            SetButton(false);
               
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setVisible(false);
        new MenuGUI().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnQuayVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayVeActionPerformed
        this.setVisible(false);
        new MenuGUI().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_btnQuayVeActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        LockTxt(true);
        SetButton(true);            // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        LockTxt(true);
        if(button=="them"){
            if (this.txtMaLop.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Mã lớp không được bỏ trống","Thông báo",1);
            txtMaLop.grabFocus();
            txtMaLop.setBackground(Color.red);
            return ;
        }
        if(this.txtMaLop.getText().length()>7)
        {
              JOptionPane.showMessageDialog(null,"Mã lớp không được vượt quá 7 ký tự","Thông báo",1);
            txtMaLop.grabFocus();
            txtMaLop.setBackground(Color.red);
            return;
        }
        if (this.txtTenLop.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Tên lớp không được bỏ trống","Thông báo",1);
           txtTenLop.grabFocus();
            txtTenLop.setBackground(Color.red);
            return;
        }
        if (this.txtTenLop.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null,"Tên lớp không được vượt quá 50 ký tự","Thông báo",1);
           txtTenLop.grabFocus();
            txtTenLop.setBackground(Color.red);
            return;
        }
        if (this.txtSiSo.getText().length() == 0)
            {
                 JOptionPane.showMessageDialog(null,"Sỉ số không được bỏ trống","Thông báo",1);
                 txtSiSo.grabFocus();
                 txtSiSo.setBackground(Color.red);
                 return;
            }
        if (Integer.parseInt(txtSiSo.getText())>60)
        {
             JOptionPane.showMessageDialog(null,"Sỉ số không được vượt quá 60","Thông báo",1);
             txtSiSo.grabFocus();
             txtSiSo.setBackground(Color.red);
             return;
        }

        LopDTO lop = new LopDTO();
        lop.setMaKhoa((String) cbbMaKhoa.getSelectedItem());
        lop.setMaLop(txtMaLop.getText());
        lop.setTenLop(txtTenLop.getText());
        lop.setSiSo(Integer.parseInt(txtSiSo.getText()));
        lop.setMaKhoaHoc((String) cbbMaKhoaHoc.getSelectedItem());
        lopBLL.themLop(lop);
        lopBLL.laydanhsachLop();
        lopBLL.hienThiDanhSachLop(jTableLop);
        JOptionPane.showMessageDialog(this, lopBLL.message, "Thêm lớp", JOptionPane.INFORMATION_MESSAGE); 
            }
        if(button=="sua"){
                   if (this.txtMaLop.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Mã lớp không được bỏ trống","Thông báo",1);
            txtMaLop.grabFocus();
            txtMaLop.setBackground(Color.red);
            return ;
        }
        if(this.txtMaLop.getText().length()>7)
        {
              JOptionPane.showMessageDialog(null,"Mã lớp không được vượt quá 7 ký tự","Thông báo",1);
            txtMaLop.grabFocus();
            txtMaLop.setBackground(Color.red);
            return;
        }
        if (this.txtTenLop.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Tên lớp không được bỏ trống","Thông báo",1);
           txtTenLop.grabFocus();
            txtTenLop.setBackground(Color.red);
            return;
        }
        if (this.txtTenLop.getText().length() > 50)
        {
            JOptionPane.showMessageDialog(null,"Tên lớp không được vượt quá 50 ký tự","Thông báo",1);
           txtTenLop.grabFocus();
            txtTenLop.setBackground(Color.red);
            return;
        }
        if (this.txtSiSo.getText().length() == 0)
            {
                 JOptionPane.showMessageDialog(null,"Sỉ số không được bỏ trống","Thông báo",1);
                 txtSiSo.grabFocus();
                 txtSiSo.setBackground(Color.red);
                 return;
            }
        if (Integer.parseInt(txtSiSo.getText())>60)
        {
             JOptionPane.showMessageDialog(null,"Sỉ số không được vượt quá 60","Thông báo",1);
             txtSiSo.grabFocus();
             txtSiSo.setBackground(Color.red);
             return;
        }
        LopDTO lop = new LopDTO();
        lop.setMaKhoa((String) cbbMaKhoa.getSelectedItem());
        lop.setMaLop(txtMaLop.getText());
        lop.setTenLop(txtTenLop.getText());
        lop.setSiSo(Integer.parseInt(txtSiSo.getText()));
        lop.setMaKhoaHoc((String) cbbMaKhoaHoc.getSelectedItem());
        lopBLL.suaLop(lop);
        lopBLL.laydanhsachLop();
        lopBLL.hienThiDanhSachLop(jTableLop);
        JOptionPane.showMessageDialog(this, lopBLL.message, "Sửa lớp", JOptionPane.INFORMATION_MESSAGE); 
        
        }
        if(button=="xoa"){
        if (this.txtMaLop.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Mã lớp không được bỏ trống","Thông báo",1);
            txtMaLop.grabFocus();
            txtMaLop.setBackground(Color.red);
        }else{
            LopDTO lop = new LopDTO();
            lop.setMaLop(txtMaLop.getText());
            lopBLL.xoaLop(lop);
            lopBLL.laydanhsachLop();
            lopBLL.hienThiDanhSachLop(jTableLop);
            JOptionPane.showMessageDialog(this, lopBLL.message, "Xóa lớp", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        SetButton(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed
    
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
            java.util.logging.Logger.getLogger(QuanLyLopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyLopGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaKho1;
    private com.k33ptoo.components.KButton btnHuy;
    private com.k33ptoo.components.KButton btnLuu;
    private com.k33ptoo.components.KButton btnQuayVe;
    private com.k33ptoo.components.KButton btnSua;
    private com.k33ptoo.components.KButton btnThem;
    private com.k33ptoo.components.KButton btnTimKiem;
    private com.k33ptoo.components.KButton btnXoa;
    private javax.swing.JComboBox<String> cbbMaKhoa;
    private javax.swing.JComboBox<String> cbbMaKhoaHoc;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLop;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtSiSo;
    private javax.swing.JTextField txtTenLop;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
