/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package GUI.NVien;

import BUS.NhanVienBUS;
import BUS.NhomQuyenBUS;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DTO.NhomQuyenDTO;
import GUI.KhachHang;
import GUI.NhanVien;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author QUAN
 */
public class SuaNhanVien extends javax.swing.JFrame {

    private NhanVienDTO nhanVienDTO;
    private NhanVien nhanVienGUI;

    /** Creates new form SuaNhanVien */
    public SuaNhanVien(NhanVien nhanVien, NhanVienDTO nhanVienDTO) {
        initComponents();
        loadNhomQuyenData();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        initAtt(nhanVien, nhanVienDTO);
        loadFormData(nhanVienDTO);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGioiTinh = new javax.swing.ButtonGroup();
        pnlTop = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        txtTenNV = new javax.swing.JTextField();
        btnThemNV = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTenNV = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblNhomQuyen = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTop.setBackground(new java.awt.Color(204, 51, 0));

        lblTitle.setBackground(new java.awt.Color(0, 102, 204));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SỬA NHÂN VIÊN");

        btnThemNV.setBackground(new java.awt.Color(0, 102, 204));
        btnThemNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemNV.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNV.setText("Lưu thông tin");
        btnThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNVActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 0, 102));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Hủy bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblTenNV.setText("Họ và tên");

        lblUsername.setText("Tên đăng nhập");

        lblPassword.setText("Mật khẩu");

        lblNhomQuyen.setText("Nhóm quyền");

        lblTrangThai.setText("Trạng thái tài khoản");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngưng hoạt động ", "Hoạt động" }));

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNV)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addComponent(lblNhomQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addComponent(btnThemNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTenNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNhomQuyen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTrangThai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNVActionPerformed
        // TODO add your handling code here:
        int id = nhanVienDTO.getId();
        int rolegroup_id = jComboBox1.getSelectedIndex() + 1;
        String name = txtTenNV.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        int status = jComboBox2.getSelectedIndex();

        if (!this.isValidInput(name, username, password)) {
            return;
        }

        NhanVienBUS nhanVienBUS = new NhanVienBUS();
        NhanVienDTO nhanVienDTO = new NhanVienDTO(id, rolegroup_id, name, username, password, null, (status == 0 ? false : true));
        int code = nhanVienBUS.suaNhanVien(nhanVienDTO);

        if (code == 1) {
            // khachHangGUI.updateTable(khachHangDTO, 1);
            nhanVienGUI.loadDataToTable();
        }
        dbRespondHandler(code);
    }//GEN-LAST:event_btnThemNVActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void initAtt(NhanVien nhanVien, NhanVienDTO selectedNhanVien) {
        this.nhanVienGUI = nhanVien;
        this.nhanVienDTO = selectedNhanVien;
    }

    private void loadNhomQuyenData() {
        NhomQuyenBUS nhomQuyenBUS = new NhomQuyenBUS();
        ArrayList<NhomQuyenDTO> nhomQuyenDTOArrayList = nhomQuyenBUS.getAllNhomQuyens();

        jComboBox1.removeAllItems();
        for (NhomQuyenDTO nhomQuyenDTO : nhomQuyenDTOArrayList) {
            jComboBox1.addItem(nhomQuyenDTO.getName());
        }
    }

    private boolean isValidInput(String name, String username, String password) {
        // Kiểm tra trường rỗng
        if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra độ dài của các trường
        if (name.length() > 255) {
            JOptionPane.showMessageDialog(this, "Tên khách hàng không được quá 255 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (username.length() > 255) {
            JOptionPane.showMessageDialog(this, "Username không được quá 255 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (password.length() > 255) {
            JOptionPane.showMessageDialog(this, "Password không được quá 255 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Regex kiểm tra username: chỉ chứa chữ cái, số, dấu gạch dưới
        if (!username.matches("^[a-zA-Z0-9_]{3,255}$")) {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập không hợp lệ! Chỉ được chứa chữ, số, dấu gạch dưới, ít nhất 3 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Regex kiểm tra password: tối thiểu 6 ký tự, có ít nhất 1 chữ và 1 số
        if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,255}$")) {
            JOptionPane.showMessageDialog(null, "Mật khẩu phải có ít nhất 6 ký tự, bao gồm cả chữ và số", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void dbRespondHandler(int code) {
        if (code == 1) {
            JOptionPane.showMessageDialog(this, "Sửa thông tin nhân viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (code == -1) {
            JOptionPane.showMessageDialog(this, "Lỗi! Username này đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Sửa nhân viên thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadFormData(NhanVienDTO nhanVienDTO) {
        txtTenNV.setText(nhanVienDTO.getName());
        txtUsername.setText(nhanVienDTO.getUsername());
        txtPassword.setText(nhanVienDTO.getPassword());
        jComboBox1.setSelectedIndex(nhanVienDTO.getRoleGroupId() - 1);
        jComboBox2.setSelectedIndex((nhanVienDTO.isStatus() == true ? 1 : 0));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupGioiTinh;
    private javax.swing.JButton btnThemNV;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel lblNhomQuyen;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
