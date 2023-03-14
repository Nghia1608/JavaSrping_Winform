
package DoAnQLSV.GUI;


import DoAnQLSV.BLL.LoginBLL;
import DoAnQLSV.BLL.LopBLL;
import DoAnQLSV.BLL.SinhVienBLL;
import DoAnQLSV.DAO.SinhVienDAO;
import DoAnQLSV.DTO.SinhVienDTO;
import DoAnQLSV.util.Validation;
import java.awt.Color;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.Messager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class QuanLySinhVienGUI extends javax.swing.JFrame {
    
    protected SinhVienBLL svBLL;    
    protected LopBLL lopBLL;    

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String button;
        
    public QuanLySinhVienGUI() {
        initComponents();

        if(LoginBLL.quyen=="SV")
        {
            txtMSSV.setEnabled(false);
            cbbMaLop.setEnabled(false);
            cbbTrangThai.setEnabled(false);
            btnThem.setVisible(false);
            btnXoa.setVisible(false);
            jRadioButtonNam.setEnabled(false);            
            jRadioButtonNu.setEnabled(false);
            
            svBLL = new SinhVienBLL();
            svBLL.laysinhvientheoma();
            svBLL.hienthisinhvien(jTableSinhVien);
        }
        else{
            svBLL = new SinhVienBLL();
            svBLL.laydanhsachSV();
            svBLL.hienThiDanhSachSV(jTableSinhVien);
        }
        jRadioButtonNam.setSelected(true);
        
        lopBLL = new LopBLL();
        lopBLL.laydanhsachLop();
        lopBLL.LoadCBBMaLop(cbbMaLop);
        
            SetButton(true);
            LockTxt(true);

    }
    public void LockTxt(boolean val)       // Khóa hết Textbox và ComboBox trước khi chọn nút chức năng
        {
            txtMSSV.setEnabled(!val);
            txtHo.setEnabled(!val);
            txtTen.setEnabled(!val);
            txtCCCD.setEnabled(!val);
            txtDanToc.setEnabled(!val);
            jRadioButtonNam.setEnabled(!val);
            jRadioButtonNu.setEnabled(!val);
            jDateChooser1.setEnabled(!val);
            txtSDT.setEnabled(!val);
            txtEmail.setEnabled(!val);
            cbbMaLop.setEnabled(!val);
            cbbTrangThai.setEnabled(!val);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        footer = new javax.swing.JPanel();
        btnThem = new com.k33ptoo.components.KButton();
        btnXoa = new com.k33ptoo.components.KButton();
        btnSua = new com.k33ptoo.components.KButton();
        btnLuu = new com.k33ptoo.components.KButton();
        btnHuy = new com.k33ptoo.components.KButton();
        btnQuayVe = new com.k33ptoo.components.KButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDanToc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbbMaLop = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbTrangThai = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSinhVien = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new com.k33ptoo.components.KButton();

        setTitle("Quản lý sinh viên");
        setPreferredSize(new java.awt.Dimension(850, 550));
        setSize(new java.awt.Dimension(850, 550));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(500, 250));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 270));
        kGradientPanel1.setRequestFocusEnabled(false);
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
        btnSua.setkEndColor(new java.awt.Color(0, 204, 255));
        btnSua.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSua.setkHoverStartColor(new java.awt.Color(204, 0, 204));
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
        btnHuy.setkEndColor(new java.awt.Color(0, 204, 255));
        btnHuy.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnHuy.setkHoverStartColor(new java.awt.Color(204, 0, 204));
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
        header.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SINH VIÊN");
        header.add(jLabel1);

        kGradientPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, 30));
        kGradientPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 200, 50));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 100, 20));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(5, 2, 20, 20));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Mã SV");
        jLabel9.setToolTipText("");
        jPanel4.add(jLabel9);

        txtMSSV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMSSV.setBorder(null);
        txtMSSV.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMSSV.setOpaque(true);
        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });
        jPanel4.add(txtMSSV);

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Họ");
        jPanel4.add(jLabel10);

        txtHo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHo.setBorder(null);
        txtHo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtHo.setOpaque(true);
        txtHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoActionPerformed(evt);
            }
        });
        jPanel4.add(txtHo);

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Tên");
        jPanel4.add(jLabel11);

        txtTen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTen.setBorder(null);
        txtTen.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTen.setOpaque(true);
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        jPanel4.add(txtTen);

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("CCCD");
        jPanel4.add(jLabel12);

        txtCCCD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCCCD.setBorder(null);
        txtCCCD.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCCCD.setOpaque(true);
        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDActionPerformed(evt);
            }
        });
        jPanel4.add(txtCCCD);

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Dân tộc");
        jPanel4.add(jLabel13);

        txtDanToc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDanToc.setBorder(null);
        txtDanToc.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDanToc.setOpaque(true);
        txtDanToc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDanTocActionPerformed(evt);
            }
        });
        jPanel4.add(txtDanToc);

        jPanel1.add(jPanel4);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(5, 2, 10, 20));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Mã lớp");
        jPanel3.add(jLabel5);

        cbbMaLop.setBorder(null);
        jPanel3.add(cbbMaLop);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email");
        jPanel3.add(jLabel4);

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.setOpaque(true);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("SDT");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3);

        txtSDT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSDT.setBorder(null);
        txtSDT.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSDT.setOpaque(true);
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        jPanel3.add(txtSDT);

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Trạng thái");
        jPanel3.add(jLabel6);

        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang học", "Bảo lưu", "Nghỉ", "Đã tốt nghiệp" }));
        jPanel3.add(cbbTrangThai);

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Ngày sinh");
        jLabel8.setToolTipText("");
        jPanel3.add(jLabel8);

        jPanel1.add(jPanel3);

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 800, 180));

        jTableSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ", "Tên", "CCCD", "Dân tộc", "Giới tính", "Ngày sinh", "SĐT", "Email", "Mã Lớp", "Trạng thái"
            }
        ));
        jTableSinhVien.setOpaque(false);
        jTableSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSinhVien);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 810, 210));

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Giới tính");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        buttonGroup1.add(jRadioButtonNam);
        jRadioButtonNam.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButtonNam.setText("Nam");
        kGradientPanel1.add(jRadioButtonNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        buttonGroup1.add(jRadioButtonNu);
        jRadioButtonNu.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButtonNu.setText("Nữ");
        kGradientPanel1.add(jRadioButtonNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Study\\icons8-list-50.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 20, 20));

        txtTimKiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtTimKiem);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setkBorderRadius(30);
        btnTimKiem.setkEndColor(new java.awt.Color(0, 204, 255));
        btnTimKiem.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnTimKiem.setkHoverStartColor(new java.awt.Color(204, 0, 204));
        btnTimKiem.setkStartColor(new java.awt.Color(252, 203, 252));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimKiem);

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
            button ="xoa";
            LockTxt(false);
            SetButton(false);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
            button ="them";
            LockTxt(false);
            SetButton(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed

    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
            button ="sua";
            LockTxt(false);
                    if(LoginBLL.quyen=="SV")
        {
            txtMSSV.setEnabled(false);
            txtHo.setEnabled(false);
            txtTen.setEnabled(false);
            cbbMaLop.setEnabled(false);
            cbbTrangThai.setEnabled(false);
            btnThem.setVisible(false);
            btnXoa.setVisible(false);
            jRadioButtonNam.setEnabled(false);            
            jRadioButtonNu.setEnabled(false);
        }
            SetButton(false);

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        LockTxt(true);
            if(button=="them"){
                 boolean flag;
        flag = Validation.isEmail(txtEmail.getText());
        if (this.txtMSSV.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"MSSV không được bỏ trống","Thông báo",1);
            txtMSSV.grabFocus();
            txtMSSV.setBackground(Color.red);
            return;
        }
        if(this.txtMSSV.getText().length()>10)
        {
            JOptionPane.showMessageDialog(null,"MSSV không được vượt quá 10 ký tự","Thông báo",1);
            txtMSSV.grabFocus();
            txtMSSV.setBackground(Color.red);
            return;
        }
        if (this.txtHo.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Họ sinh viên không được bỏ trống","Thông báo",1);
            txtHo.grabFocus();
            txtHo.setBackground(Color.red);
            return;
        }
        if (this.txtHo.getText().length() > 6)
        {
            JOptionPane.showMessageDialog(null,"Họ sinh viên không được vượt quá 6 ký tự","Thông báo",1);
            txtHo.grabFocus();
            txtHo.setBackground(Color.red);
            return;
        }
        
        if (this.txtTen.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Tên sinh viên không được bỏ trống","Thông báo",1);
            txtTen.grabFocus();
            txtTen.setBackground(Color.red);
            return;
        }        
        if (this.txtTen.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(null,"Tên sinh viên không được vượt quá 30 ký tự","Thông báo",1);
            txtTen.grabFocus();
            txtTen.setBackground(Color.red);
            return;
        }
        if (this.txtCCCD.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"CCCD không được bỏ trống","Thông báo",1);
             txtCCCD.grabFocus();
             txtCCCD.setBackground(Color.red);
            return;
        }
        if (this.txtCCCD.getText().length() > 12)
        {
            JOptionPane.showMessageDialog(null,"CCCD không được vượt quá 12 ký tự","Thông báo",1);
            txtCCCD.grabFocus();
            txtCCCD.setBackground(Color.red);
            return;
        }

        if (this.txtDanToc.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Dân tộc không được bỏ trống","Thông báo",1);
            txtDanToc.grabFocus();
            txtDanToc.setBackground(Color.red);
            return;
        }
        if (this.txtDanToc.getText().length() > 12)
        {
            JOptionPane.showMessageDialog(null,"Dân tộc không được vượt quá 12 ký tự","Thông báo",1);
            txtDanToc.grabFocus();
            txtDanToc.setBackground(Color.red);
            return;
        }

        if (flag == false)
        {
            JOptionPane.showMessageDialog(null,"Email không đúng định dạng","Thông báo",1);
            txtEmail.grabFocus();
            txtEmail.setBackground(Color.red);
            return;
        }

        if (this.txtSDT.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"SĐT không được bỏ trống","Thông báo",1);
            txtSDT.grabFocus();
            txtSDT.setBackground(Color.red);
            return;
        }
        if (this.txtSDT.getText().length() > 12)
        {
            JOptionPane.showMessageDialog(null,"SĐT không được vượt quá 12 ký tự","Thông báo",1);
            txtSDT.grabFocus();
            txtSDT.setBackground(Color.red);
            return;
        }

        if (this.jDateChooser1.getDate() == null )
        {
             JOptionPane.showMessageDialog(null,"Ngày sinh không được bỏ trống","Thông báo",1);
             return;
        }
        // thoa dieu kien data input
            SinhVienDTO sv = new SinhVienDTO();
            sv.setMSSV(txtMSSV.getText());
            sv.setHo(txtHo.getText());
            sv.setTen(txtTen.getText());
            sv.setCCCD(txtCCCD.getText());
            sv.setDanToc(txtDanToc.getText());
            if( jRadioButtonNam.isSelected()){
                sv.setGioiTinh("Nam");
            }
            else{
                sv.setGioiTinh("Nữ");
            }
            sv.setNgaySinh(sdf.format( this.jDateChooser1.getDate()));
            sv.setSDT(txtSDT.getText());
            sv.setEmail(txtEmail.getText());
            sv.setMaLop((String) cbbMaLop.getSelectedItem());
            sv.setTrangThai((String) cbbTrangThai.getSelectedItem());
            svBLL.themSinhVien(sv);
            svBLL.laydanhsachSV();
            svBLL.hienThiDanhSachSV(jTableSinhVien);            
            JOptionPane.showMessageDialog(this, svBLL.message, "Thêm SV", JOptionPane.INFORMATION_MESSAGE);
            }
            if(button=="sua"){
                 boolean flag;
        flag = Validation.isEmail(txtEmail.getText());
        if (this.txtMSSV.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"MSSV không được bỏ trống","Thông báo",1);
            txtMSSV.grabFocus();
            txtMSSV.setBackground(Color.red);
            return;
        }
        if(this.txtMSSV.getText().length()>10)
        {
            JOptionPane.showMessageDialog(null,"MSSV không được vượt quá 10 ký tự","Thông báo",1);
            txtMSSV.grabFocus();
            txtMSSV.setBackground(Color.red);
            return;
        }
        if (this.txtHo.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Họ sinh viên không được bỏ trống","Thông báo",1);
            txtHo.grabFocus();
            txtHo.setBackground(Color.red);
            return;
        }
        if (this.txtHo.getText().length() > 6)
        {
            JOptionPane.showMessageDialog(null,"Họ sinh viên không được vượt quá 6 ký tự","Thông báo",1);
            txtHo.grabFocus();
            txtHo.setBackground(Color.red);
            return;
        }
        
        if (this.txtTen.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Tên sinh viên không được bỏ trống","Thông báo",1);
            txtTen.grabFocus();
            txtTen.setBackground(Color.red);
            return;
        }        
        if (this.txtTen.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(null,"Tên sinh viên không được vượt quá 30 ký tự","Thông báo",1);
            txtTen.grabFocus();
            txtTen.setBackground(Color.red);
            return;
        }
        if (this.txtCCCD.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"CCCD không được bỏ trống","Thông báo",1);
             txtCCCD.grabFocus();
             txtCCCD.setBackground(Color.red);
            return;
        }
        if (this.txtCCCD.getText().length() > 12)
        {
            JOptionPane.showMessageDialog(null,"CCCD không được vượt quá 12 ký tự","Thông báo",1);
            txtCCCD.grabFocus();
            txtCCCD.setBackground(Color.red);
            return;
        }

        if (this.txtDanToc.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Dân tộc không được bỏ trống","Thông báo",1);
            txtDanToc.grabFocus();
            txtDanToc.setBackground(Color.red);
            return;
        }
        if (this.txtDanToc.getText().length() > 12)
        {
            JOptionPane.showMessageDialog(null,"Dân tộc không được vượt quá 12 ký tự","Thông báo",1);
            txtDanToc.grabFocus();
            txtDanToc.setBackground(Color.red);
            return;
        }

        if (flag == false)
        {
            JOptionPane.showMessageDialog(null,"Email không đúng định dạng","Thông báo",1);
            txtEmail.grabFocus();
            txtEmail.setBackground(Color.red);
            return;
        }

        if (this.txtSDT.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"SĐT không được bỏ trống","Thông báo",1);
            txtSDT.grabFocus();
            txtSDT.setBackground(Color.red);
            return;
        }
        if (this.txtSDT.getText().length() > 12)
        {
            JOptionPane.showMessageDialog(null,"SĐT không được vượt quá 12 ký tự","Thông báo",1);
            txtSDT.grabFocus();
            txtSDT.setBackground(Color.red);
            return;
        }

        if (this.jDateChooser1.getDate() == null )
        {
             JOptionPane.showMessageDialog(null,"Ngày sinh không được bỏ trống","Thông báo",1);
             return;
        }
        SinhVienDTO sv = new SinhVienDTO();
        sv.setMSSV(txtMSSV.getText());
        sv.setHo(txtHo.getText());
        sv.setTen(txtTen.getText());
        sv.setCCCD(txtCCCD.getText());
        sv.setDanToc(txtDanToc.getText());
        if( jRadioButtonNam.isSelected()){
            sv.setGioiTinh("Nam");
        }
        else{
            sv.setGioiTinh("Nữ");
        }
        sv.setNgaySinh(sdf.format( this.jDateChooser1.getDate()));
        sv.setSDT(txtSDT.getText());
        sv.setEmail(txtEmail.getText());
        sv.setMaLop((String) cbbMaLop.getSelectedItem());
        sv.setTrangThai((String) cbbTrangThai.getSelectedItem());
            if(LoginBLL.quyen=="SV"){
                svBLL.suaSinhVien(sv);
                svBLL.laysinhvientheoma();
                svBLL.hienthisinhvien(jTableSinhVien);
            }
            else{
                svBLL.suaSinhVien(sv);
                svBLL.laydanhsachSV();
                svBLL.hienThiDanhSachSV(jTableSinhVien);
            }
        JOptionPane.showMessageDialog(this, svBLL.message, "Sửa SV", JOptionPane.INFORMATION_MESSAGE);   
            }
            if(button=="xoa"){
                if (this.txtMSSV.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"MSSV không được bỏ trống","Thông báo",1);
            txtMSSV.grabFocus();
            txtMSSV.setBackground(Color.red);
            return;
        }
        if(this.txtMSSV.getText().length()>10)
        {
            JOptionPane.showMessageDialog(null,"MSSV không được vượt quá 10 ký tự","Thông báo",1);
            txtMSSV.grabFocus();
            txtMSSV.setBackground(Color.red);
            return;
        }
        else{
        SinhVienDTO sv = new SinhVienDTO();
        sv.setMSSV(txtMSSV.getText());
        svBLL.xoaSinhVien(sv);
        svBLL.laydanhsachSV();
        svBLL.hienThiDanhSachSV(jTableSinhVien);
        JOptionPane.showMessageDialog(this, svBLL.message, "Xóa SV", JOptionPane.INFORMATION_MESSAGE); 
        }
            }
            SetButton(true); 
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        LockTxt(true);
        SetButton(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnQuayVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayVeActionPerformed
        this.setVisible(false);
        new MenuGUI().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnQuayVeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDActionPerformed

    private void txtDanTocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDanTocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDanTocActionPerformed

    private void jTableSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSinhVienMouseClicked
            int column = 1;
            DefaultTableModel model =(DefaultTableModel) jTableSinhVien.getModel();
            int row = jTableSinhVien.getSelectedRow();
            this.txtMSSV.setText(jTableSinhVien.getModel().getValueAt(row, 0).toString());
            this.txtHo.setText(jTableSinhVien.getModel().getValueAt(row, 1).toString());
            this.txtTen.setText(jTableSinhVien.getModel().getValueAt(row, 2).toString());
            this.txtCCCD.setText(jTableSinhVien.getModel().getValueAt(row, 3).toString());
            this.txtDanToc.setText(jTableSinhVien.getModel().getValueAt(row, 4).toString());
            if("Nam".equals(jTableSinhVien.getModel().getValueAt(row, 5).toString())){
                this.jRadioButtonNam.setSelected(true);
                this.jRadioButtonNu.setSelected(false);
            }
            else
            {
                this.jRadioButtonNu.setSelected(true);
                this.jRadioButtonNam.setSelected(false);
            }
            this.txtSDT.setText(jTableSinhVien.getModel().getValueAt(row, 7).toString());
            this.txtEmail.setText(jTableSinhVien.getModel().getValueAt(row, 8).toString());
            this.cbbMaLop.setSelectedItem(jTableSinhVien.getModel().getValueAt(row, 9).toString());
            this.cbbTrangThai.setSelectedItem(jTableSinhVien.getModel().getValueAt(row, 10).toString());
                        //load jdate chooser
        try {

            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 6).toString());
            jDateChooser1.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLySinhVienGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableSinhVienMouseClicked

    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSSVActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        new MenuGUI().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        SinhVienDTO sv = new SinhVienDTO();
        sv.setMSSV(txtTimKiem.getText());
        sv.setTen(txtTimKiem.getText());
        sv.setHo(txtTimKiem.getText());
       svBLL.Timkiem(sv, jTableSinhVien);        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QuanLySinhVienGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnHuy;
    private com.k33ptoo.components.KButton btnLuu;
    private com.k33ptoo.components.KButton btnQuayVe;
    private com.k33ptoo.components.KButton btnSua;
    private com.k33ptoo.components.KButton btnThem;
    private com.k33ptoo.components.KButton btnTimKiem;
    private com.k33ptoo.components.KButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbMaLop;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSinhVien;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
