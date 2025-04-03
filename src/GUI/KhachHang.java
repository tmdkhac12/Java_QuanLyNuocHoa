/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI;

import BUS.KhachHangBUS;
import DTO.KhachHangDTO;
import GUI.KHang.ChiTietKHang;
import GUI.KHang.SuaKHang;
import GUI.KHang.ThemKHang;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;

/**
 *
 * @author QUAN
 */
public class KhachHang extends javax.swing.JPanel {

    private KhachHangBUS khachHangBUS;

    /** Creates new form KhachHang */
    public KhachHang() {
        // Setup Panel's Components
        initComponents();
        addIcon();
        setUpTable();

        initAtt();
        loadKhachHangData();
        timKiemHandler();
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
        btnThemKH = new javax.swing.JButton();
        btnSuaKH = new javax.swing.JButton();
        btnXoaKH = new javax.swing.JButton();
        btnChiTietKH = new javax.swing.JButton();
        btnXuatExcel1KH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));
        pnlTop.setPreferredSize(new java.awt.Dimension(1200, 70));

        btnThemKH.setText("Thêm");
        btnThemKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKHActionPerformed(evt);
            }
        });
        pnlTop.add(btnThemKH);

        btnSuaKH.setText("Sửa");
        btnSuaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKHActionPerformed(evt);
            }
        });
        pnlTop.add(btnSuaKH);

        btnXoaKH.setText("Xóa");
        btnXoaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKHActionPerformed(evt);
            }
        });
        pnlTop.add(btnXoaKH);

        btnChiTietKH.setText("Chi tiết");
        btnChiTietKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTietKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietKHActionPerformed(evt);
            }
        });
        pnlTop.add(btnChiTietKH);

        btnXuatExcel1KH.setText("Xuất excel");
        btnXuatExcel1KH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuatExcel1KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcel1KHActionPerformed(evt);
            }
        });
        pnlTop.add(btnXuatExcel1KH);

        jLabel1.setText("Tìm kiếm :");
        pnlTop.add(jLabel1);

        txtTimKiem.setPreferredSize(new java.awt.Dimension(150, 30));
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        pnlTop.add(txtTimKiem);

        add(pnlTop, java.awt.BorderLayout.NORTH);

        pnlCenter.setPreferredSize(new java.awt.Dimension(1200, 700));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Nguyễn Văn Nam", "0898433611", "vannam@gmail.com "},
                {"2", "Nguyễn Gia Khang", "0644577823 ", "khang2@gmail.com "}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại ", "Email "
            }
        ));
        jScrollPane1.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(0).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(1).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(2).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(3).setResizable(false);
        }
        tblKhachHang.getAccessibleContext().setAccessibleParent(tblKhachHang);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKHActionPerformed
        // TODO add your handling code here:
        new ThemKHang(this).setVisible(true);
    }//GEN-LAST:event_btnThemKHActionPerformed

    private void btnSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKHActionPerformed
        // TODO add your handling code here:
        KhachHangDTO selectedKhachHang = this.getSelectedRowData();
        if (selectedKhachHang != null) {
            new SuaKHang(this, selectedKhachHang).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng muốn sửa thông tin");
        }
    }//GEN-LAST:event_btnSuaKHActionPerformed

    private void btnXoaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKHActionPerformed
        // TODO add your handling code here:
        KhachHangDTO selectedKhachHang = this.getSelectedRowData();
        if (selectedKhachHang != null) {
            int id = selectedKhachHang.getId();

            int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa khách hàng này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if(khachHangBUS.xoaKhachHang(id)) {
                    JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    updateTable(null, 3);
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa khách hàng thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng muốn xóa");
        }
    }//GEN-LAST:event_btnXoaKHActionPerformed

    private void btnChiTietKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietKHActionPerformed
        // TODO add your handling code here:
        KhachHangDTO selectedKhachHang = this.getSelectedRowData();
        if (selectedKhachHang != null) {
            new ChiTietKHang(selectedKhachHang).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng muốn xem chi tiết");
        }
    }//GEN-LAST:event_btnChiTietKHActionPerformed

    private void btnXuatExcel1KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcel1KHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatExcel1KHActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void initAtt() {
        khachHangBUS = new KhachHangBUS();
    }

    private void addIcon() {
        btnThemKH.setIcon(new FlatSVGIcon("./res/icon/add.svg"));
        btnSuaKH.setIcon(new FlatSVGIcon("./res/icon/edit.svg"));
        btnXoaKH.setIcon(new FlatSVGIcon("./res/icon/delete.svg"));
        btnChiTietKH.setIcon(new FlatSVGIcon("./res/icon/detail.svg"));
        btnXuatExcel1KH.setIcon(new FlatSVGIcon("./res/icon/export_excel.svg"));
    }

    private void setUpTable() {
        // Set ẩn hiển thị ô vuông khi bấm vào cell 
        tblKhachHang.setFocusable(false);
        
        // Set không cho cell có thể chỉnh sửa 
        tblKhachHang.setDefaultEditor(Object.class, null);
    }

    public void loadKhachHangData() {
        ArrayList<KhachHangDTO> khachHangDTOArrayList = khachHangBUS.getAllKhachHangs();

        // Get Table Model and clear data
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);

        for (KhachHangDTO khachHangDTO : khachHangDTOArrayList) {
            model.addRow(new Object[]{
                    khachHangDTO.getId(),
                    khachHangDTO.getName(),
                    khachHangDTO.getPhone(),
                    khachHangDTO.getEmail()
            });
        }

        // Create renderer for table to align text center
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tblKhachHang.getColumnCount(); i++) {
            tblKhachHang.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    private KhachHangDTO getSelectedRowData() {
        int selectedRowIndex = tblKhachHang.getSelectedRow();

        if (selectedRowIndex == -1) {
            return null;
        }

        int id = (int) tblKhachHang.getValueAt(selectedRowIndex, 0);
        return khachHangBUS.getKhachHang(id);
    }

    public void updateTable(KhachHangDTO khachHangDTO, int code) {
        // 1: Them, 2: Sua, 3: Xoa
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();

        if (code == 1) {
            model.addRow(new Object[] {
                    khachHangDTO.getId(),
                    khachHangDTO.getName(),
                    khachHangDTO.getPhone(),
                    khachHangDTO.getEmail()
            });
        } else if (code == 2) {
            int selectedRow = tblKhachHang.getSelectedRow();
            model.setValueAt(khachHangDTO.getName(), selectedRow, 1);
            model.setValueAt(khachHangDTO.getPhone(), selectedRow, 2);
            model.setValueAt(khachHangDTO.getEmail(), selectedRow, 3);
        } else if (code == 3) {
            int selectedRow = tblKhachHang.getSelectedRow();
            model.removeRow(selectedRow);
        }
    }

    private void timKiemHandler() {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) tblKhachHang.getModel());
        tblKhachHang.setRowSorter(sorter);

        // Ô nhập tìm kiếm
        txtTimKiem.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }

            private void filter() {
                String keyword = txtTimKiem.getText().trim();
                if (keyword.isEmpty()) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword));
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietKH;
    private javax.swing.JButton btnSuaKH;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnXoaKH;
    private javax.swing.JButton btnXuatExcel1KH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
