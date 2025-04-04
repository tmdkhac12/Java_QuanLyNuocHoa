/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI;

import com.formdev.flatlaf.extras.FlatSVGIcon;

/**
 *
 * @author Admin
 */
public class SanPham extends javax.swing.JPanel {

    /** Creates new form SanPham */
    public SanPham() {
        initComponents();
        addIcon();
        setUpTable();
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
        btnThemSP = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        btnChiTietSP = new javax.swing.JButton();
        btnXuatExcelSP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));
        pnlTop.setPreferredSize(new java.awt.Dimension(1000, 80));

        btnThemSP.setText("Thêm");
        btnThemSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTop.add(btnThemSP);

        btnSuaSP.setText("Sửa");
        btnSuaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTop.add(btnSuaSP);

        btnXoaSP.setText("Xóa");
        btnXoaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTop.add(btnXoaSP);

        btnChiTietSP.setText("Chi tiết");
        btnChiTietSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTop.add(btnChiTietSP);

        btnXuatExcelSP.setText("Xuất excel");
        btnXuatExcelSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTop.add(btnXuatExcelSP);

        jLabel1.setLabelFor(txtTimKiem);
        jLabel1.setText("Tìm kiếm :");
        pnlTop.add(jLabel1);

        txtTimKiem.setPreferredSize(new java.awt.Dimension(100, 30));
        pnlTop.add(txtTimKiem);

        add(pnlTop, java.awt.BorderLayout.NORTH);

        pnlCenter.setPreferredSize(new java.awt.Dimension(1200, 700));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng tồn", "Dung tích", "Nồng độ", "Thương hiệu", "Giớii tính", "Giá nhập", "Giá xuất"
            }
        ));
        jScrollPane2.setViewportView(tblSanPham);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

     private void addIcon() {
        btnThemSP.setIcon(new FlatSVGIcon("./res/icon/add.svg"));
        btnSuaSP.setIcon(new FlatSVGIcon("./res/icon/edit.svg"));
        btnXoaSP.setIcon(new FlatSVGIcon("./res/icon/delete.svg"));
        btnChiTietSP.setIcon(new FlatSVGIcon("./res/icon/detail.svg"));
        btnXuatExcelSP.setIcon(new FlatSVGIcon("./res/icon/export_excel.svg"));
    }

    private void setUpTable() {
        // Set ẩn hiển thị ô vuông khi bấm vào cell 
        tblSanPham.setFocusable(false);
        
        // Set không cho cell có thể chỉnh sửa 
        tblSanPham.setDefaultEditor(Object.class, null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietSP;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JButton btnXuatExcelSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
