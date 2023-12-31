/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pxu.com.views;

import java.sql.Connection;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import pxu.com.connect.connecting;
import pxu.com.dao.UserDao;
import pxu.com.dialogchek.showuser;
import pxu.com.model.StudentModel;
import pxu.com.model.TableUserModel;
import pxu.com.model.UserModel;

/**
 *
 * @author NGUYEN DUNG
 */
public class user extends javax.swing.JFrame {

    Connection cn;
    long count, soTrang, trang = 1;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form sinhvien
     */
    public user() {

        initComponents();
        this.setSize(935, 685);
        this.setLocationRelativeTo(null);

        titleTable();
        countDb();
        if (count % 5 == 0) {
            soTrang = count / 5;
        } else {
            soTrang = count / 5 + 1;
        }
        loadData(1);
        lblsotrang1.setText("1/" + soTrang);
        lbltrang1.setText("1");
    }
    DefaultTableModel tblModel;
    ArrayList<UserModel> lstuser;
    TableUserModel tbm;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbVaiTro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JFormattedTextField();
        cbDiaChi = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTTK = new javax.swing.JTextField();
        txtPW = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        lblanh = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblnhanSu = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        btnnhomax1 = new javax.swing.JButton();
        btnnho1 = new javax.swing.JButton();
        lbltrang1 = new javax.swing.JLabel();
        btnlon1 = new javax.swing.JButton();
        btnlonmax1 = new javax.swing.JButton();
        lblsotrang1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ NHÂN  SỰ ");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Nhân Sự", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 13))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jPanel7.setBackground(new java.awt.Color(255, 255, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Nhân Sự:");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtMaNS.setColumns(40);
        txtMaNS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaNSKeyReleased(evt);
            }
        });
        jPanel7.add(txtMaNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 220, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên Nhân Sự :");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtTenNS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenNSKeyReleased(evt);
            }
        });
        jPanel7.add(txtTenNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Địa Chỉ       :");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        cbVaiTro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản Lý", "Nhân Viên" }));
        cbVaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVaiTroActionPerformed(evt);
            }
        });
        jPanel7.add(cbVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vai Trò :");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Số Điện Thoại :");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        try {
            txtSDT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        jPanel7.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, -1));

        cbDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbDiaChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Thành phố Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
        cbDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaChiActionPerformed(evt);
            }
        });
        jPanel7.add(cbDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Tên Tài Khoản :");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Mật Khẩu :");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel7.add(txtTTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 220, -1));
        jPanel7.add(txtPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 220, -1));

        jPanel6.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(16, 13, 45, 14);
        jPanel8.add(lblanh, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Chọn ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new java.awt.GridBagConstraints());

        jPanel6.add(jPanel8);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 18, 910, 260));

        jPanel5.setBackground(new java.awt.Color(255, 255, 153));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20);
        flowLayout2.setAlignOnBaseline(true);
        jPanel5.setLayout(flowLayout2);

        btnMoi.setBackground(new java.awt.Color(255, 204, 204));
        btnMoi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMoi.setText("Làm Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel5.add(btnMoi);

        btnThem.setBackground(new java.awt.Color(255, 204, 204));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel5.add(btnThem);

        btnXoa.setBackground(new java.awt.Color(255, 204, 204));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoa);

        btnSua.setBackground(new java.awt.Color(255, 204, 204));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSua);

        btnXuatExcel.setBackground(new java.awt.Color(255, 204, 204));
        btnXuatExcel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXuatExcel.setText("Xuất Excel");
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });
        jPanel5.add(btnXuatExcel);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 900, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 920, 350));

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Nhân Sự", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 13))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(668, 127));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 153));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Nhập Tên Nhân Sự :");
        jPanel9.add(jLabel6);

        txtTK.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTK.setPreferredSize(new java.awt.Dimension(170, 29));
        txtTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTKKeyReleased(evt);
            }
        });
        jPanel9.add(txtTK);

        jPanel4.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblnhanSu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblnhanSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tblnhanSu.setRowHeight(23);
        tblnhanSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnhanSuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblnhanSu);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 900, 130));

        jPanel4.add(jPanel10, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 920, 210));

        jPanel13.setBackground(new java.awt.Color(255, 255, 153));

        btnnhomax1.setBackground(new java.awt.Color(255, 204, 204));
        btnnhomax1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnnhomax1.setText("<<");
        btnnhomax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhomax1ActionPerformed(evt);
            }
        });
        jPanel13.add(btnnhomax1);

        btnnho1.setBackground(new java.awt.Color(255, 204, 204));
        btnnho1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        btnnho1.setText("<");
        btnnho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnho1ActionPerformed(evt);
            }
        });
        jPanel13.add(btnnho1);

        lbltrang1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lbltrang1.setText("jLabel6");
        jPanel13.add(lbltrang1);

        btnlon1.setBackground(new java.awt.Color(255, 204, 204));
        btnlon1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        btnlon1.setText(">");
        btnlon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlon1ActionPerformed(evt);
            }
        });
        jPanel13.add(btnlon1);

        btnlonmax1.setBackground(new java.awt.Color(255, 204, 204));
        btnlonmax1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnlonmax1.setText(">>");
        btnlonmax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlonmax1ActionPerformed(evt);
            }
        });
        jPanel13.add(btnlonmax1);

        lblsotrang1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lblsotrang1.setText("jLabel7");
        jPanel13.add(lblsotrang1);

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNSKeyReleased
    }//GEN-LAST:event_txtMaNSKeyReleased

    private void txtTenNSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenNSKeyReleased
    }//GEN-LAST:event_txtTenNSKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed

    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMaNS.getText().equals("")) {
            sb.append("Vui Lòng Nhập Mã San PhẨM \n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            UserModel bk = new UserModel();
            bk.setUser_id(txtMaNS.getText());
            bk.setFull_name(txtTenNS.getText());
            bk.setPhone_number(txtSDT.getText());
            bk.setAddress(cbDiaChi.getSelectedItem().toString());
            bk.setPosition(cbVaiTro.getSelectedItem().toString());
            bk.setUsername(txtTTK.getText());
            bk.setPassword(txtPW.getText());
            UserDao dk = new UserDao();
            dk.insertin(bk);
            LoadNhanSuTable();
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sản Phẩm Này đã tồn tại trong cửa hàng.");
            e.printStackTrace();
        }
     }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMaNS.getText().equals("")) {
            sb.append("Vui Lòng Nhập Mã San PhẨM \n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            UserModel bk = new UserModel();
            bk.setUser_id(txtMaNS.getText());
            bk.setFull_name(txtTenNS.getText());
            bk.setPhone_number(txtSDT.getText());
            bk.setAddress(cbDiaChi.getSelectedItem().toString());
            bk.setPosition(cbVaiTro.getSelectedItem().toString());
            bk.setUsername(txtTTK.getText());
            bk.setPassword(txtPW.getText());
            UserDao dk = new UserDao();
            dk.delete(bk);
            LoadNhanSuTable();
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sản Phẩm Này đã tồn tại trong cửa hàng.");
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMaNS.getText().equals("")) {
            sb.append("Vui Lòng Nhập Mã San PhẨM \n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            UserModel bk = new UserModel();
            bk.setUser_id(txtMaNS.getText());
            bk.setFull_name(txtTenNS.getText());
            bk.setPhone_number(txtSDT.getText());
            bk.setAddress(cbDiaChi.getSelectedItem().toString());
            bk.setPosition(cbVaiTro.getSelectedItem().toString());
            bk.setUsername(txtTTK.getText());
            bk.setPassword(txtPW.getText());
            UserDao dk = new UserDao();
            dk.update(bk);
            LoadNhanSuTable();
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sản Phẩm Này đã tồn tại trong cửa hàng.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed

    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void txtTKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTKKeyReleased
        String timkiem = txtTK.getText();
        timmkiem(timkiem);

    }//GEN-LAST:event_txtTKKeyReleased

    private void tblnhanSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanSuMouseClicked
        try {
            int row = tblnhanSu.getSelectedRow();
            if (row >= 0) {
                String tennhansu = String.valueOf(tblnhanSu.getValueAt(row, 0));
                UserDao dk = new UserDao();
                UserModel b = dk.FindManv(tennhansu);
                txtMaNS.setText(b.getUser_id());
                txtTenNS.setText(b.getFull_name());
                txtSDT.setText(b.getPhone_number());
                cbDiaChi.setSelectedItem(b.getAddress());
                txtTTK.setText(b.getUsername());
                cbVaiTro.setSelectedItem(b.getPosition());
                txtPW.setText(b.getPassword());
                btnXoa.setEnabled(true);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }        // TODO add your handling code here:

    }//GEN-LAST:event_tblnhanSuMouseClicked

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
    }//GEN-LAST:event_txtSDTActionPerformed

    private void cbDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaChiActionPerformed

    private void cbVaiTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVaiTroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVaiTroActionPerformed
    public void countDb() {
        try {
            String query = "Select count(*) from USER";
            try {
                cn = (Connection) connecting.getConnection();
            } catch (Exception ex) {
                Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (Statement st = cn.createStatement()) {
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    count = rs.getLong(1);
                }
                rs.close();
            }
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void titleTable() {
        tbm = new TableUserModel();
        tblnhanSu.setModel(tbm);
        tblnhanSu.setShowHorizontalLines(true);
        tblnhanSu.setShowVerticalLines(true);
    }

    public void loadData(long trang) {
        titleTable();
        tbm.getDataVector().removeAllElements();
        try {
            String query = "SELECT * FROM USER LIMIT " + (trang - 1) * 5 + ", 5";
            //Trong đó, biến trang chứa số trang cần lấy. Câu lệnh trên sẽ lấy ra 5 dòng dữ liệu bắt đầu từ dòng 5*(trang-1) + 1 đến dòng 5*trang.
            try {
                cn = connecting.getConnection();
            } catch (Exception ex) {
                Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            }
            st = cn.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                Vector v = new Vector();
                String idns = rs.getString(1);
                String tenns = rs.getString(2);
                String sdt = rs.getString(3);
                String diachi = rs.getString(4);
                String tentk = rs.getString(5);
                String vaitro = rs.getString(6);
                String matkhau = rs.getString(7);

                v.add(idns);
                v.add(tenns);
                v.add(sdt);
                v.add(diachi);
                v.add(tentk);
                v.add(vaitro);
                v.add(matkhau);

                tbm.addRow(v);
            }
            rs.close();
            st.close();
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnnhomax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhomax1ActionPerformed
        trang = 1;
        loadData(trang);
        lbltrang1.setText("1");
        lblsotrang1.setText("1/" + soTrang);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnnhomax1ActionPerformed

    private void btnnho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnho1ActionPerformed
        if (trang > 1) {
            trang--;
            loadData(trang);
            lbltrang1.setText("" + trang);
            lblsotrang1.setText(trang + "/" + soTrang);

        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnnho1ActionPerformed

    private void btnlon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlon1ActionPerformed
        if (trang < soTrang) {
            trang++;
            loadData(trang);
            lbltrang1.setText("" + trang);
            lblsotrang1.setText(trang + "/" + soTrang);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btnlon1ActionPerformed

    private void btnlonmax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlonmax1ActionPerformed
        trang = soTrang;
        loadData(trang);
        lbltrang1.setText("" + soTrang);
        lblsotrang1.setText(soTrang + "/" + soTrang);      // TODO add your handling code here:
    }//GEN-LAST:event_btnlonmax1ActionPerformed
    public void timmkiem(String st) {
        tblModel = (DefaultTableModel) tblnhanSu.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblModel);
        tblnhanSu.setRowSorter(trs);
        RowFilter<DefaultTableModel, Object> filter = new RowFilter<DefaultTableModel, Object>() {
            public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String searchString = st.toLowerCase(); // Chuyển tất cả sang chữ thường
                for (int i = entry.getValueCount() - 1; i >= 0; i--) {
                    if (entry.getStringValue(i).toLowerCase().contains(searchString)) {
                        return true;
                    }
                }
                return false;
            }
        };

        trs.setRowFilter(filter);
    }

    public void LoadNhanSuTable() throws Exception {
        lstuser = UserDao.getall();
        if (lstuser != null) {
            tblModel.setRowCount(0);
            for (UserModel pn : lstuser) {
                Vector vec = new Vector();
                vec.add(pn.getUser_id());
                vec.add(pn.getFull_name());
                vec.add(pn.getPhone_number());
                vec.add(pn.getAddress());
                vec.add(pn.getUsername());
                vec.add(pn.getPosition());
                vec.add(pn.getPassword());
                tblModel.addRow(vec);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login h = new login();
                h.setVisible(true);
                if (showuser.nguoiDangNhap.getPosition().equals("Quản lý")) {
                    new user().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JButton btnlon1;
    private javax.swing.JButton btnlonmax1;
    private javax.swing.JButton btnnho1;
    private javax.swing.JButton btnnhomax1;
    private javax.swing.JComboBox<String> cbDiaChi;
    private javax.swing.JComboBox<String> cbVaiTro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblanh;
    private javax.swing.JLabel lblsotrang1;
    private javax.swing.JLabel lbltrang1;
    private javax.swing.JTable tblnhanSu;
    private javax.swing.JTextField txtMaNS;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JFormattedTextField txtSDT;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtTTK;
    private javax.swing.JTextField txtTenNS;
    // End of variables declaration//GEN-END:variables
}
