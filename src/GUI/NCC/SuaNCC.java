/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package GUI.NCC;

import DTO.NhaCungCapDTO;
import GUI.KHang.*;
import BUS.NhaCungCapBUS;
import DTO.NhaCungCapDTO;
import GUI.NhaCungCap;
import GUI.NhaCungCap;

import javax.swing.*;

/**
 *
 * @author QUAN
 */
public class SuaNCC extends javax.swing.JFrame {

    private NhaCungCapDTO nhaCungCapDTO;
    private NhaCungCap nhaCungCapGUI;

    /** Creates new form SuaKHang */
    public SuaNCC(NhaCungCap nhaCungCap, NhaCungCapDTO selectedNhaCungCap) {
        initComponents();
        initAtt(nhaCungCap, selectedNhaCungCap);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        loadFormData(nhaCungCapDTO);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        lblTenKH = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        lblSoDT = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTop.setBackground(new java.awt.Color(204, 51, 0));

        lblTitle.setBackground(new java.awt.Color(204, 51, 0));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CHỈNH SỬA NHÀ CUNG CẤP");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        lblTenKH.setText("Tên nhà cung cấp");

        txtTenNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNCCActionPerformed(evt);
            }
        });

        lblSoDT.setText("Số điện thoại");

        btnSave.setBackground(new java.awt.Color(0, 102, 204));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Lưu thông tin");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        jLabel1.setText("Email");

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTenKH)
                            .addComponent(lblSoDT))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTenKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSoDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int id = nhaCungCapDTO.getId();
        String name = txtTenNCC.getText();
        String phoneNumber = txtSoDT.getText();
        String email = txtEmail.getText();

        if (!this.isValidInput(name, phoneNumber, email)) {
            return;
        }

        NhaCungCapBUS nhaCungCapBUS = new NhaCungCapBUS();
        NhaCungCapDTO changedNhaCungCap = new NhaCungCapDTO(id, name, phoneNumber, email);
        int code = nhaCungCapBUS.updateNCC(changedNhaCungCap);

        if (code == 1) {
//            nhaCungCapGUI.updateTable(changedNhaCungCap, 2);
            nhaCungCapGUI.loadNCCData();
        }
        this.dbRespondHandler(code);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtTenNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNCCActionPerformed

    private void loadFormData(NhaCungCapDTO nhaCungCapDTO) {
        txtTenNCC.setText(nhaCungCapDTO.getName());
        txtSoDT.setText(nhaCungCapDTO.getPhone());
        txtEmail.setText(nhaCungCapDTO.getEmail());
    }

    public boolean isValidInput(String name, String phone, String email) {
        // Kiểm tra trường rỗng
        if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin nhà cung cấp", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra độ dài của các trường
        if (name.length() > 255) {
            JOptionPane.showMessageDialog(this, "Tên nhà cung cấp không được quá 255 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (phone.length() > 20) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được quá 20 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (email.length() > 255) {
            JOptionPane.showMessageDialog(this, "Email không được quá 255 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Regex kiểm tra số điện thoại: Chỉ chứa số, có thể bắt đầu bằng dấu +, tối thiểu 8 chữ số
        String phoneRegex = "^(\\+?[0-9]{8,20})$";
        if (!phone.matches(phoneRegex)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ. Vui lòng nhập đúng định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Regex kiểm tra email hợp lệ
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ. Vui lòng nhập đúng định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true; // Nếu không có lỗi nào, dữ liệu hợp lệ
    }

    private void dbRespondHandler(int code) {
        if (code == 1) {
            JOptionPane.showMessageDialog(this, "Sửa nhà cung cấp thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (code == -1) {
            JOptionPane.showMessageDialog(this, "Lỗi! Số điện thoại trùng với nhà cung cấp khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (code == -2) {
            JOptionPane.showMessageDialog(this, "Lỗi! Email trùng với nhà cung cấp khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Sửa nhà cung cấp thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initAtt(NhaCungCap nhaCungCap, NhaCungCapDTO selectedNhaCungCap) {
        this.nhaCungCapGUI = nhaCungCap;
        this.nhaCungCapDTO = selectedNhaCungCap;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables

}
