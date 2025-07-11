/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI;

import BUS.NhomQuyenBUS;
import GUI.NQuyen.ChiTietNQuyen;
import GUI.NQuyen.SuaNQuyen;
import GUI.NQuyen.ThemNQuyen;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import util.DialogUtil;


/**
 *
 * @author hoang
 */
public class NhomQuyen extends javax.swing.JPanel {
    private int selectedGroupId = -1;

    /** Creates new form NhomQuyen */
    public NhomQuyen() {
        initComponents();
        addIcon();
        loadData();
        
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
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnChiTiet = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhomQuyen = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));
        pnlTop.setPreferredSize(new java.awt.Dimension(1000, 80));

        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlTop.add(btnSua);

        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlTop.add(btnXoa);

        btnChiTiet.setText("Chi tiết");
        btnChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });
        pnlTop.add(btnChiTiet);

        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlTop.add(btnThem);

        add(pnlTop, java.awt.BorderLayout.NORTH);

        pnlCenter.setPreferredSize(new java.awt.Dimension(1200, 700));

        tblNhomQuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhóm quyền", "Tên nhóm quyền"
            }
        ));
        tblNhomQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhomQuyenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhomQuyen);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadData() {
    // Lấy model và reset
    DefaultTableModel model = (DefaultTableModel) tblNhomQuyen.getModel();
    model.setRowCount(0);

    // 1) Thiết lập thuộc tính hiển thị cho bảng
    //    - Khóa chỉnh sửa
    tblNhomQuyen.setDefaultEditor(Object.class, null);
    //    - Chỉ cho chọn nguyên hàng
    tblNhomQuyen.setRowSelectionAllowed(true);
    tblNhomQuyen.setColumnSelectionAllowed(false);
    //    - Không cho reorder cột
    tblNhomQuyen.getTableHeader().setReorderingAllowed(false);
    //    - Căn giữa nội dung
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
    for (int i = 0; i < tblNhomQuyen.getColumnCount(); i++) {
        tblNhomQuyen.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    //    - Tắt grid lines nếu muốn
    tblNhomQuyen.setShowGrid(false);

    // 2) Lấy dữ liệu gộp từ BUS/DAO
    NhomQuyenBUS bus = new NhomQuyenBUS();
    for (Object[] row : bus.getAllNhomQuyenThongTin()) {
        model.addRow(row);
    }


}




    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
    
    JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
    DialogUtil.showPanelInDialog(new ThemNQuyen(), "Thêm nhóm quyền", parent);
    loadData();

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
    if (selectedGroupId != -1) {
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        DialogUtil.showPanelInDialog(new SuaNQuyen(selectedGroupId), "Sửa nhóm quyền", parent);
        loadData();
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn nhóm quyền cần sửa!");
    }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
    if (selectedGroupId != -1) {
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            NhomQuyenBUS bus = new NhomQuyenBUS();
            if (bus.delete(selectedGroupId)) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                loadData();
                selectedGroupId = -1;
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn nhóm quyền cần xóa!");
    }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
    if (selectedGroupId != -1) {
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        DialogUtil.showPanelInDialog(new ChiTietNQuyen(selectedGroupId), "Chi tiết nhóm quyền", parent);
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn nhóm quyền để xem chi tiết!");
    }
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void tblNhomQuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhomQuyenMouseClicked
       int row = tblNhomQuyen.getSelectedRow();
    if (row != -1) {
        selectedGroupId = Integer.parseInt(tblNhomQuyen.getValueAt(row, 0).toString());
    }
    }//GEN-LAST:event_tblNhomQuyenMouseClicked

    private void addIcon() {
        btnThem.setIcon(new FlatSVGIcon("./res/icon/add.svg"));
        btnSua.setIcon(new FlatSVGIcon("./res/icon/edit.svg"));
        btnXoa.setIcon(new FlatSVGIcon("./res/icon/delete.svg"));
        btnChiTiet.setIcon(new FlatSVGIcon("./res/icon/detail.svg"));
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tblNhomQuyen;
    // End of variables declaration//GEN-END:variables

}
