/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Panel;

import GUI.PhieuNhap;
import BUS.SanPhamBUS;
import DAO.ChiTietPhieuNhapDAO;
import DAO.NhaCungCapDAO;
import DAO.PhieuNhapDAO;
import DTO.ChiTietPhieuNhapDTO;
import DTO.NhaCungCapDTO;
import DTO.SanPhamDTO;
import java.sql.Timestamp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import util.DBConnection;

/**
 *
 * @author Administrator
 */
public class ThemPhieuNhap extends javax.swing.JPanel {

    private ArrayList<SanPhamDTO> listNuocHoa;
    private List<NhaCungCapDTO> danhSachNCC;
    private PhieuNhap phieuNhapGUI;

    /**
     * Creates new form TaoPhieuNhap
     */
    public ThemPhieuNhap(PhieuNhap phieuNhapGUI) {
        initComponents();
        loadDanhSachSanPham();
        setUpTable();
        centerTableData(tblsoluongsanpham);
        setupSanPhamSelectionListener();
        centerTableData(tblthongtinspdathem);

        listNuocHoa = new SanPhamBUS().getAllSanPhamTonKho();
        txtmaphieunhap.setText(taoMaPhieuNhapTuDong());
        txtmaphieunhap.setEditable(false);
        loadNhaCungCapToComboBox();

        this.phieuNhapGUI = phieuNhapGUI;
    }

    private void setupSanPhamSelectionListener() {
        tblsoluongsanpham.getSelectionModel().addListSelectionListener(e -> {
            int row = tblsoluongsanpham.getSelectedRow();
            if (row != -1 && row < listNuocHoa.size()) {
                SanPhamDTO sp = listNuocHoa.get(row);
                txtgianhap.setText(String.valueOf(sp.getCost()));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerpanel = new javax.swing.JPanel();
        leftcontent = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblsoluongsanpham = new javax.swing.JTable();
        containernhap = new javax.swing.JPanel();
        txtgianhap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        btnxoasanpham = new javax.swing.JButton();
        btnthemsanpham = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblthongtinspdathem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtmaphieunhap = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbbnhacc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txttongtien = new javax.swing.JLabel();
        btnnhaphang = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        containerpanel.setBackground(new java.awt.Color(255, 255, 255));
        containerpanel.setLayout(new java.awt.BorderLayout());

        tblsoluongsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên sản phẩm", "Dung tích", "Số lượng tồn"
            }
        ));
        tblsoluongsanpham.setFocusTraversalPolicyProvider(true);
        tblsoluongsanpham.setRequestFocusEnabled(false);
        tblsoluongsanpham.setRowHeight(40);
        jScrollPane3.setViewportView(tblsoluongsanpham);
        if (tblsoluongsanpham.getColumnModel().getColumnCount() > 0) {
            tblsoluongsanpham.getColumnModel().getColumn(0).setMaxWidth(75);
        }

        containernhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtgianhap.setEditable(false);
        txtgianhap.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Giá nhập");

        jLabel7.setText("Số lượng");

        btnxoasanpham.setBackground(new java.awt.Color(255, 102, 153));
        btnxoasanpham.setForeground(new java.awt.Color(255, 255, 255));
        btnxoasanpham.setText("Xóa sản phẩm");
        btnxoasanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoasanphamActionPerformed(evt);
            }
        });

        btnthemsanpham.setBackground(new java.awt.Color(0, 153, 255));
        btnthemsanpham.setForeground(new java.awt.Color(255, 255, 255));
        btnthemsanpham.setText("Thêm sản phẩm");
        btnthemsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemsanphamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containernhapLayout = new javax.swing.GroupLayout(containernhap);
        containernhap.setLayout(containernhapLayout);
        containernhapLayout.setHorizontalGroup(
            containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containernhapLayout.createSequentialGroup()
                .addGroup(containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containernhapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtgianhap, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                .addComponent(txtsoluong))))
                    .addGroup(containernhapLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnthemsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnxoasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        containernhapLayout.setVerticalGroup(
            containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containernhapLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthemsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        tblthongtinspdathem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Dung tích", "Giới tính", "Nồng độ", "Thương hiệu", "Giá nhập", "Số lượng"
            }
        ));
        tblthongtinspdathem.setRowHeight(30);
        jScrollPane2.setViewportView(tblthongtinspdathem);
        if (tblthongtinspdathem.getColumnModel().getColumnCount() > 0) {
            tblthongtinspdathem.getColumnModel().getColumn(0).setMaxWidth(60);
            tblthongtinspdathem.getColumnModel().getColumn(3).setMaxWidth(75);
            tblthongtinspdathem.getColumnModel().getColumn(7).setMaxWidth(70);
        }

        javax.swing.GroupLayout leftcontentLayout = new javax.swing.GroupLayout(leftcontent);
        leftcontent.setLayout(leftcontentLayout);
        leftcontentLayout.setHorizontalGroup(
            leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftcontentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(leftcontentLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(containernhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        leftcontentLayout.setVerticalGroup(
            leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftcontentLayout.createSequentialGroup()
                .addGroup(leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(containernhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        containerpanel.add(leftcontent, java.awt.BorderLayout.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtmaphieunhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaphieunhapActionPerformed(evt);
            }
        });

        jLabel17.setText("Nha cung cấp");

        jLabel18.setText("Mã phiếu nhập");

        cbbnhacc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn nhà cung cấp" }));
        cbbnhacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbnhaccActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("TỔNG TIỀN:");

        txttongtien.setText("0đ");

        btnnhaphang.setBackground(new java.awt.Color(0, 153, 51));
        btnnhaphang.setForeground(new java.awt.Color(255, 255, 255));
        btnnhaphang.setText("Nhập hàng");
        btnnhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhaphangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmaphieunhap)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbnhacc, 0, 287, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnnhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtmaphieunhap, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbnhacc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        containerpanel.add(jPanel1, java.awt.BorderLayout.EAST);

        add(containerpanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemsanphamActionPerformed
        int selectedRow = tblsoluongsanpham.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm.");
            return;
        }

        String soLuongStr = txtsoluong.getText().trim();
        if (soLuongStr.isEmpty() || !soLuongStr.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng hợp lệ (số nguyên dương).");
            return;
        }

        int soLuong = Integer.parseInt(soLuongStr);
        if (soLuong <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0.");
            return;
        }

        int maSP = Integer.parseInt(tblsoluongsanpham.getValueAt(selectedRow, 0).toString());
        SanPhamDTO selectedPerfume = null;
        for (SanPhamDTO sp : listNuocHoa) {
            if (sp.getId() == maSP) {
                selectedPerfume = sp;
                break;
            }
        }

        if (selectedPerfume == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm.");
            return;
        }

        DefaultTableModel modelChiTiet = (DefaultTableModel) tblthongtinspdathem.getModel();

        // Kiểm tra sản phẩm đã tồn tại (cùng ID và dung tích)
        for (int i = 0; i < modelChiTiet.getRowCount(); i++) {
            int existingId = Integer.parseInt(modelChiTiet.getValueAt(i, 0).toString()); // cột Mã SP
            String existingVolume = modelChiTiet.getValueAt(i, 2).toString(); // cột Dung tích

            if (existingId == selectedPerfume.getId() && existingVolume.equals(selectedPerfume.getVolumeSize() + "ml")) {
                JOptionPane.showMessageDialog(this, "Sản phẩm đã được thêm vào phiếu.");
                return;
            }
        }

        modelChiTiet.addRow(new Object[]{
            selectedPerfume.getId(), // Mã SP
            selectedPerfume.getName(), // Tên SP
            selectedPerfume.getVolumeSize() + "ml", // Dung tích
            selectedPerfume.getSex(), // Giới tính
            selectedPerfume.getConcentration(),// Nồng độ
            selectedPerfume.getBrandName(), // Thương hiệu
            selectedPerfume.getCost(), // Giá nhập
            soLuong // Số lượng
        });

        txtsoluong.setText("");

        // Tính lại tổng tiền
        double tongTien = 0;
        for (int i = 0; i < modelChiTiet.getRowCount(); i++) {
            double cost = Double.parseDouble(modelChiTiet.getValueAt(i, 6).toString());
            int quantity = Integer.parseInt(modelChiTiet.getValueAt(i, 7).toString());
            tongTien += cost * quantity;
        }
        txttongtien.setText(String.format("%.0fđ", tongTien));
    }//GEN-LAST:event_btnthemsanphamActionPerformed

    private void btnxoasanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoasanphamActionPerformed
        int selectedRow = tblthongtinspdathem.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần xóa.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblthongtinspdathem.getModel();
        model.removeRow(selectedRow);

        // Cập nhật tổng tiền sau khi xóa
        double tongTien = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            double cost = Double.parseDouble(model.getValueAt(i, 6).toString());
            int quantity = Integer.parseInt(model.getValueAt(i, 7).toString());
            tongTien += cost * quantity;
        }
        txttongtien.setText(String.format("%.0fđ", tongTien));
    }//GEN-LAST:event_btnxoasanphamActionPerformed

    private void cbbnhaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbnhaccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbnhaccActionPerformed

    private void btnnhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhaphangActionPerformed
        try {
            // 1. Lấy mã phiếu nhập từ ô nhập (txtmaphieunhap có sẵn mã)
            int maPhieuNhap = Integer.parseInt(txtmaphieunhap.getText().trim());

            // 2. Lấy nhà cung cấp
            int selectedIndex = cbbnhacc.getSelectedIndex();
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà cung cấp.");
                return;
            }
            int supplierId = danhSachNCC.get(selectedIndex).getId();

            // 3. Kiểm tra bảng sản phẩm đã thêm
            DefaultTableModel model = (DefaultTableModel) tblthongtinspdathem.getModel();
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Chưa có sản phẩm nào trong phiếu.");
                return;
            }

            // 4. Tính tổng tiền + tạo danh sách chi tiết
            double totalCost = 0;
            List<ChiTietPhieuNhapDTO> chiTietList = new ArrayList<>();

            for (int i = 0; i < model.getRowCount(); i++) {
                int perfumeId = Integer.parseInt(model.getValueAt(i, 0).toString());
                String volumeText = model.getValueAt(i, 2).toString(); // Ví dụ: "50ml"
                int volumeSize = Integer.parseInt(volumeText.replace("ml", "").trim());
                double cost = Double.parseDouble(model.getValueAt(i, 6).toString());
                int quantity = Integer.parseInt(model.getValueAt(i, 7).toString());

                int volumeId = SanPhamBUS.getInstance().getVolumeIdBySize(volumeSize);
                totalCost += cost * quantity;

                ChiTietPhieuNhapDTO chiTiet = new ChiTietPhieuNhapDTO(
                        maPhieuNhap, perfumeId, volumeId, quantity, cost,
                        null, null, null, null, null
                );
                chiTietList.add(chiTiet);
            }

            // 5. Lưu phiếu nhập
            Timestamp now = new Timestamp(System.currentTimeMillis());
            PhieuNhapDAO phieuNhapDAO = new PhieuNhapDAO();
            int insertedId = phieuNhapDAO.insertPhieuNhap(maPhieuNhap, supplierId, now, totalCost);

            if (insertedId == -1) {
                JOptionPane.showMessageDialog(this, "Lưu phiếu nhập thất bại!");
                return;
            }

            // 6. Lưu chi tiết phiếu nhập
            ChiTietPhieuNhapDAO chiTietDAO = new ChiTietPhieuNhapDAO();
            boolean ok = chiTietDAO.insertChiTietPhieuNhap(chiTietList);

            // 7. Cộng dồn tồn kho
            for (ChiTietPhieuNhapDTO ct : chiTietList) {
                SanPhamBUS.getInstance().congDonSoLuongTon(ct.getPerfumeId(), ct.getVolumeId(), ct.getQuantity());
            }

            // 8. Giao diện & thông báo
            if (ok) {
                JOptionPane.showMessageDialog(this, "Nhập hàng thành công!");
                model.setRowCount(0);
                txtgianhap.setText("");
                txtsoluong.setText("");
                txttongtien.setText("0đ");
                phieuNhapGUI.loadPhieuNhapToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Lưu chi tiết phiếu nhập thất bại!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi nhập hàng.");
        }
    }//GEN-LAST:event_btnnhaphangActionPerformed

    private void txtmaphieunhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaphieunhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaphieunhapActionPerformed

    private void setUpTable() {
        // Set ẩn hiển thị ô vuông khi bấm vào cell 
        tblsoluongsanpham.setFocusable(false);
        tblthongtinspdathem.setFocusable(false);

        // Set không cho cell có thể chỉnh sửa 
        tblsoluongsanpham.setDefaultEditor(Object.class, null);
        tblthongtinspdathem.setDefaultEditor(Object.class, null);
    }

    public void centerTableData(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);

        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void loadDanhSachSanPham() {
        SanPhamBUS bus = new SanPhamBUS();
        ArrayList<SanPhamDTO> danhSach = bus.getAllSanPhamTonKho();

        DefaultTableModel model = (DefaultTableModel) tblsoluongsanpham.getModel(); // Bảng bên trái
        model.setRowCount(0);

        for (SanPhamDTO sp : danhSach) {
            model.addRow(new Object[]{
                sp.getId(),
                sp.getName(),
                sp.getVolumeSize(),
                sp.getStock()
            });
        }
    }

    private String taoMaPhieuNhapTuDong() {
        int nextId = 1;

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT MAX(id) AS max_id FROM importreceipt";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int maxId = rs.getInt("max_id");
                nextId = maxId + 1;
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return String.valueOf(nextId);
    }

    private void loadNhaCungCapToComboBox() {
        NhaCungCapDAO dao = new NhaCungCapDAO();
        danhSachNCC = dao.getAll(); // lưu để xử lý sau
        cbbnhacc.removeAllItems(); // xóa hết trước khi add mới

        for (NhaCungCapDTO ncc : danhSachNCC) {
            cbbnhacc.addItem(ncc.getName()); // chỉ add tên thôi
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnhaphang;
    private javax.swing.JButton btnthemsanpham;
    private javax.swing.JButton btnxoasanpham;
    private javax.swing.JComboBox<String> cbbnhacc;
    private javax.swing.JPanel containernhap;
    private javax.swing.JPanel containerpanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel leftcontent;
    private javax.swing.JTable tblsoluongsanpham;
    private javax.swing.JTable tblthongtinspdathem;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtmaphieunhap;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JLabel txttongtien;
    // End of variables declaration//GEN-END:variables

}
