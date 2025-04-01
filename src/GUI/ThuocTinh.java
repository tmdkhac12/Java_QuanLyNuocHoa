/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI;

import GUI.TTinh.NotHuong;
import GUI.TTinh.ThuongHieu;
import GUI.TTinh.KhuyenMai;

/**
 *
 * @author QUAN
 */
public class ThuocTinh extends javax.swing.JPanel {
    // Tabpane's Tabs
    private NotHuong notHuongTab;
    private ThuongHieu thuongHieuTab;
    private KhuyenMai khuyenMaiTab;
    
    /** Creates new form ThuocTinh */
    public ThuocTinh() {
        initComponents();
        initTabs();
        addTabs();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPaneThuocTinh = new javax.swing.JTabbedPane();

        setPreferredSize(new java.awt.Dimension(1200, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneThuocTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initTabs() {
        notHuongTab = new NotHuong();
        thuongHieuTab = new ThuongHieu();
        khuyenMaiTab = new KhuyenMai();
    }

    private void addTabs() {
        tabPaneThuocTinh.add("Nốt hương", notHuongTab);
        tabPaneThuocTinh.add("Thương hiệu", thuongHieuTab);
        tabPaneThuocTinh.add("Khuyến mãi", khuyenMaiTab);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabPaneThuocTinh;
    // End of variables declaration//GEN-END:variables

}
