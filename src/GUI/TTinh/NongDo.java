/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI.TTinh;

import com.formdev.flatlaf.extras.FlatSVGIcon;

/**
 *
 * @author QUAN
 */
public class NongDo extends javax.swing.JPanel {

    /** Creates new form NongDo */
    public NongDo() {
        initComponents();
        setUpTable();
        addIcon();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollThuongHieu = new javax.swing.JScrollPane();
        tblNongDo = new javax.swing.JTable();
        pnlTop = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        lblThuongHieu = new javax.swing.JLabel();
        tenThuongHieu = new javax.swing.JPanel();
        lblTenNongDo = new javax.swing.JLabel();
        txtTenThuongHieu = new javax.swing.JTextField();
        pnlLeft = new javax.swing.JPanel();
        btnThemNongDo = new javax.swing.JButton();
        btnSuaNongDo = new javax.swing.JButton();
        btnXoaNongDo = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        tblNongDo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "EDP"},
                {"2", "EDT"},
                {"3", "EDC "},
                {"4", "Perfume "}
            },
            new String [] {
                "Mã nồng độ", "Tên loại nồng độ"
            }
        ));
        scrollThuongHieu.setViewportView(tblNongDo);

        add(scrollThuongHieu, java.awt.BorderLayout.CENTER);

        title.setBackground(new java.awt.Color(255, 51, 0));
        title.setForeground(new java.awt.Color(255, 255, 255));

        lblThuongHieu.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblThuongHieu.setForeground(new java.awt.Color(255, 255, 255));
        lblThuongHieu.setText("NỒNG ĐỘ SẢN PHẨM");
        title.add(lblThuongHieu);

        tenThuongHieu.setBackground(new java.awt.Color(255, 255, 255));

        lblTenNongDo.setText("Tên nồng độ :");
        tenThuongHieu.add(lblTenNongDo);

        txtTenThuongHieu.setMinimumSize(new java.awt.Dimension(150, 30));
        txtTenThuongHieu.setPreferredSize(new java.awt.Dimension(150, 30));
        tenThuongHieu.add(txtTenThuongHieu);

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tenThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tenThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(pnlTop, java.awt.BorderLayout.NORTH);

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft.setPreferredSize(new java.awt.Dimension(130, 580));

        btnThemNongDo.setText("Thêm");
        btnThemNongDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNongDoActionPerformed(evt);
            }
        });

        btnSuaNongDo.setText("Sửa");
        btnSuaNongDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNongDoActionPerformed(evt);
            }
        });

        btnXoaNongDo.setText("Xóa");
        btnXoaNongDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNongDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThemNongDo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(btnSuaNongDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoaNongDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnThemNongDo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSuaNongDo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoaNongDo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        add(pnlLeft, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNongDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNongDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemNongDoActionPerformed

    private void btnSuaNongDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNongDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaNongDoActionPerformed

    private void btnXoaNongDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNongDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNongDoActionPerformed

    private void setUpTable() {
        // Set ẩn hiển thị ô vuông khi bấm vào cell 
        tblNongDo.setFocusable(false);
        
        // Set không cho cell có thể chỉnh sửa 
        tblNongDo.setDefaultEditor(Object.class, null);
    }
    
    private void addIcon() {
        btnThemNongDo.setIcon(new FlatSVGIcon("./res/icon/add.svg"));
        btnSuaNongDo.setIcon(new FlatSVGIcon("./res/icon/edit.svg"));
        btnXoaNongDo.setIcon(new FlatSVGIcon("./res/icon/delete.svg"));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaNongDo;
    private javax.swing.JButton btnThemNongDo;
    private javax.swing.JButton btnXoaNongDo;
    private javax.swing.JLabel lblTenNongDo;
    private javax.swing.JLabel lblThuongHieu;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JScrollPane scrollThuongHieu;
    private javax.swing.JTable tblNongDo;
    private javax.swing.JPanel tenThuongHieu;
    private javax.swing.JPanel title;
    private javax.swing.JTextField txtTenThuongHieu;
    // End of variables declaration//GEN-END:variables

}
