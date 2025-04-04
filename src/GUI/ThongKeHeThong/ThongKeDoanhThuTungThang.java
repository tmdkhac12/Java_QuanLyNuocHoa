/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUI.ThongKeHeThong;

/**
 *
 * @author hoang
 */
public class ThongKeDoanhThuTungThang extends javax.swing.JPanel {

    /** Creates new form ThongKeDoanhThuTungThang */
    public ThongKeDoanhThuTungThang() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblChonNam = new javax.swing.JLabel();
        btnexport = new javax.swing.JButton();
        pnlBottom = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        pnlChart = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.BorderLayout(10, 10));

        lblChonNam.setText("Chọn năm thống kê");
        jPanel1.add(lblChonNam);

        btnexport.setText("Xuất excel");
        btnexport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportActionPerformed(evt);
            }
        });
        jPanel1.add(btnexport);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pnlBottom.setPreferredSize(new java.awt.Dimension(100, 250));

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tháng", "Vốn", "Doanh thu", "Lợi nhuận"
            }
        ));
        jScrollPane1.setViewportView(tblThongKe);

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        pnlChart.setPreferredSize(new java.awt.Dimension(100, 250));
        pnlChart.setLayout(new javax.swing.BoxLayout(pnlChart, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlChart, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChonNam;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlChart;
    private javax.swing.JTable tblThongKe;
    // End of variables declaration//GEN-END:variables

}
