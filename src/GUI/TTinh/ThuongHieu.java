/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI.TTinh;

import BUS.ThuongHieuBUS;
import DTO.ThuongHieuDTO;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author QUAN
 */
public class ThuongHieu extends javax.swing.JPanel {

    /** Creates new form ThuongHieu */
    public ThuongHieu() {
        initComponents();
        setUpTable();
        addIcon();
        loadDataToTable();
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
        tblThuongHieu = new javax.swing.JTable();
        pnlTop = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        lblThuongHieu = new javax.swing.JLabel();
        tenThuongHieu = new javax.swing.JPanel();
        lblTenThuongHieu = new javax.swing.JLabel();
        txtTenThuongHieu = new javax.swing.JTextField();
        pnlLeft = new javax.swing.JPanel();
        btnThemThuongHieu = new javax.swing.JButton();
        btnSuaThuongHieu = new javax.swing.JButton();
        btnXoaThuongHieu = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        tblThuongHieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Lelabo"},
                {"2", "Tomford "}
            },
            new String [] {
                "Mã thương hiệu", "Tên thương hiệu"
            }
        ));
        scrollThuongHieu.setViewportView(tblThuongHieu);
        if (tblThuongHieu.getColumnModel().getColumnCount() > 0) {
            tblThuongHieu.getColumnModel().getColumn(0).setResizable(false);
            tblThuongHieu.getColumnModel().getColumn(1).setResizable(false);
        }

        add(scrollThuongHieu, java.awt.BorderLayout.CENTER);

        title.setBackground(new java.awt.Color(255, 51, 0));
        title.setForeground(new java.awt.Color(255, 255, 255));

        lblThuongHieu.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblThuongHieu.setForeground(new java.awt.Color(255, 255, 255));
        lblThuongHieu.setText("THƯƠNG HIỆU SẢN PHẨM");
        title.add(lblThuongHieu);

        tenThuongHieu.setBackground(new java.awt.Color(255, 255, 255));

        lblTenThuongHieu.setText("Tên thương hiệu :");
        tenThuongHieu.add(lblTenThuongHieu);

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

        btnThemThuongHieu.setText("Thêm");
        btnThemThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThuongHieuActionPerformed(evt);
            }
        });

        btnSuaThuongHieu.setText("Sửa");
        btnSuaThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThuongHieuActionPerformed(evt);
            }
        });

        btnXoaThuongHieu.setText("Xóa");
        btnXoaThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThuongHieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThemThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(btnSuaThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoaThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnThemThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSuaThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoaThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        add(pnlLeft, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThuongHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemThuongHieuActionPerformed

    private void btnSuaThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThuongHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaThuongHieuActionPerformed

    private void btnXoaThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThuongHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaThuongHieuActionPerformed

    private void setUpTable() {
        // Set ẩn hiển thị ô vuông khi bấm vào cell 
        tblThuongHieu.setFocusable(false);
        
        // Set không cho cell có thể chỉnh sửa 
        tblThuongHieu.setDefaultEditor(Object.class, null);
    }
    
    private void addIcon() {
        btnThemThuongHieu.setIcon(new FlatSVGIcon("./res/icon/add.svg"));
        btnSuaThuongHieu.setIcon(new FlatSVGIcon("./res/icon/edit.svg"));
        btnXoaThuongHieu.setIcon(new FlatSVGIcon("./res/icon/delete.svg"));
    }

    private void loadDataToTable() {
        ThuongHieuBUS thuongHieuBUS = new ThuongHieuBUS();
        ArrayList<ThuongHieuDTO> thuongHieuDTOArrayList = thuongHieuBUS.getAllThuongHieus();

        DefaultTableModel model = (DefaultTableModel) tblThuongHieu.getModel();
        model.setRowCount(0);

        for (ThuongHieuDTO thuongHieuDTO : thuongHieuDTOArrayList) {
            model.addRow(new Object[]{
                    thuongHieuDTO.getId(),
                    thuongHieuDTO.getName()
            });
        }

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tblThuongHieu.getColumnCount(); i++) {
            tblThuongHieu.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaThuongHieu;
    private javax.swing.JButton btnThemThuongHieu;
    private javax.swing.JButton btnXoaThuongHieu;
    private javax.swing.JLabel lblTenThuongHieu;
    private javax.swing.JLabel lblThuongHieu;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JScrollPane scrollThuongHieu;
    private javax.swing.JTable tblThuongHieu;
    private javax.swing.JPanel tenThuongHieu;
    private javax.swing.JPanel title;
    private javax.swing.JTextField txtTenThuongHieu;
    // End of variables declaration//GEN-END:variables

}
