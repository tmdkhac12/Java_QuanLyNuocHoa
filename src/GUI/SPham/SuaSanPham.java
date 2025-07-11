/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.SPham;

import BUS.KhuyenMaiBUS;
import BUS.SanPhamBUS;
import BUS.ThuongHieuBUS;
import DAO.DungTichDAO;
import DAO.NotHuongDAO;
import DTO.KhuyenMaiDTO;
import DTO.NotHuongDTO;
import DTO.SanPhamDTO;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hoang
 */
public class SuaSanPham extends javax.swing.JPanel {

    private int perfumeId;
    private int currentStock;
    private int oldVolumeId;

    private String selectedFileName;

    /**
     * Creates new form SuaSanPham
     */
    public SuaSanPham() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        anhSanPham = new javax.swing.JPanel();
        lblAnhSanPham = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        txttensp = new javax.swing.JTextField();
        lblKho = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        cbbthuonghieu = new javax.swing.JComboBox<>();
        lblXuatXu = new javax.swing.JLabel();
        lblLoai = new javax.swing.JLabel();
        cbbkhuyenmai = new javax.swing.JComboBox<>();
        lblThuongHieu = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();
        txtgianhap = new javax.swing.JTextField();
        lblGiaNhap = new javax.swing.JLabel();
        txtgiaban = new javax.swing.JTextField();
        lblGiaXuat = new javax.swing.JLabel();
        btnLuuSP = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cbbgioitinh = new javax.swing.JComboBox<>();
        cbbnongdo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbdungtich = new javax.swing.JComboBox<>();
        txtnotdau = new javax.swing.JTextField();
        txtnotgiua = new javax.swing.JTextField();
        txtnotcuoi = new javax.swing.JTextField();
        btnnotdau = new javax.swing.JButton();
        btnnotgiua = new javax.swing.JButton();
        btnnotcuoi = new javax.swing.JButton();

        pnlTop.setBackground(new java.awt.Color(204, 51, 0));

        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SỬA SẢN PHẨM");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));

        anhSanPham.setPreferredSize(new java.awt.Dimension(330, 240));

        javax.swing.GroupLayout anhSanPhamLayout = new javax.swing.GroupLayout(anhSanPham);
        anhSanPham.setLayout(anhSanPhamLayout);
        anhSanPhamLayout.setHorizontalGroup(
            anhSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnhSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        anhSanPhamLayout.setVerticalGroup(
            anhSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnhSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        lblTenSP.setText("Tên sản phẩm");

        lblKho.setText("Giới tính");

        lblSize.setText("Dung tích");

        lblXuatXu.setText("Khuyến mãi");

        lblLoai.setText("Nồng độ");

        lblThuongHieu.setText("Thương hiệu");

        btnChonAnh.setText("Chọn hình ảnh");
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        lblGiaNhap.setText("Giá nhập");

        lblGiaXuat.setText("Giá bán");

        btnLuuSP.setBackground(new java.awt.Color(0, 102, 204));
        btnLuuSP.setText("Lưu");
        btnLuuSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuSPActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 0, 102));
        btnCancel.setText("Hủy bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cbbgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Unisex" }));

        cbbnongdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parfum", "EDP", "EDT", "EDC", "Eau Fraiche", "Aftershave" }));

        jLabel1.setText("Nốt đầu");

        jLabel2.setText("Nốt giữa");

        jLabel3.setText("Nốt cuối");

        cbbdungtich.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnnotdau.setText("jButton1");
        btnnotdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnotdauActionPerformed(evt);
            }
        });

        btnnotgiua.setText("jButton1");

        btnnotcuoi.setText("jButton1");

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addComponent(btnLuuSP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(anhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblXuatXu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKho, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbkhuyenmai, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE)
                            .addComponent(lblTenSP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttensp))
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblGiaNhap, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtgianhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblThuongHieu)
                                            .addComponent(lblLoai))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(cbbthuonghieu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCenterLayout.createSequentialGroup()
                                .addComponent(cbbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbbnongdo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCenterLayout.createSequentialGroup()
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(lblSize)
                                        .addGap(116, 116, 116))
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(cbbdungtich, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGiaXuat)
                                    .addComponent(txtgiaban)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCenterLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnotcuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnotcuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCenterLayout.createSequentialGroup()
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnotdau, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnotgiua, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnnotdau, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnnotgiua, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(lblTenSP)
                                        .addGap(4, 4, 4)
                                        .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(lblGiaNhap)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addComponent(lblSize)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbdungtich, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addComponent(lblGiaXuat)
                                .addGap(4, 4, 4)
                                .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKho, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLoai))
                        .addGap(5, 5, 5)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbgioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(cbbnongdo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addComponent(lblXuatXu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbkhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addComponent(lblThuongHieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbthuonghieu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(anhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnChonAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnnotdau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtnotdau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLuuSP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnotgiua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnotgiua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnotcuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(btnnotcuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuSPActionPerformed
        try {
            SanPhamDTO dto = new SanPhamDTO();
            dto.setId(perfumeId); // Gán lại ID sản phẩm đang sửa

            // === Thông tin cơ bản ===
            dto.setName(txttensp.getText().trim());
            dto.setSex((String) cbbgioitinh.getSelectedItem());
            dto.setImages(selectedFileName); // từ nút chọn ảnh
            dto.setConcentration((String) cbbnongdo.getSelectedItem());

            // === Thương hiệu ===
            String tenTH = (String) cbbthuonghieu.getSelectedItem();
            int brandId = ThuongHieuBUS.getInstance().getIdByName(tenTH);
            dto.setBrandId(brandId);

            // === Khuyến mãi ===
            String tenKM = (String) cbbkhuyenmai.getSelectedItem();
            int promoId = KhuyenMaiBUS.getInstance().getIdByName(tenKM);
            dto.setPromotionId(promoId);

            // === Dung tích (Cập nhật trong perfume_volume) ===
            int volumeSize = Integer.parseInt((String) cbbdungtich.getSelectedItem());
            int volumeId = DungTichDAO.getInstance().getIdBySize(volumeSize);
            dto.setVolumeId(volumeId);       // dùng để update bảng perfume_volume
            dto.setVolumeSize(volumeSize);   // dùng để hiển thị

            // === Giá nhập, giá bán ===
            dto.setCost(Double.parseDouble(txtgianhap.getText()));
            dto.setPrice(Double.parseDouble(txtgiaban.getText()));

            // === Nốt hương ===
            dto.setTopNotes(Arrays.asList(txtnotdau.getText().split("\\s*,\\s*")));
            dto.setHeartNotes(Arrays.asList(txtnotgiua.getText().split("\\s*,\\s*")));
            dto.setBaseNotes(Arrays.asList(txtnotcuoi.getText().split("\\s*,\\s*")));

            // === Gọi BUS xử lý update ===
            boolean success = SanPhamBUS.getInstance().updateSanPhamVaVolume(dto, oldVolumeId); // ⚠️ cần chắc chắn oldVolumeId có giá trị

            if (success) {
                JOptionPane.showMessageDialog(this, "Cập nhật sản phẩm thành công!");
                Window window = SwingUtilities.getWindowAncestor(this);
                if (window instanceof JFrame) {
                    window.dispose(); // đóng cửa sổ sau khi lưu
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không thể thay đổi dung tích vì sản phẩm đã được sử dụng trong phiếu nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnLuuSPActionPerformed

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn ảnh sản phẩm");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Ảnh JPG", "jpg");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String fileName = selectedFile.getName();

            // Chỉ nhận .jpg
            if (!fileName.toLowerCase().endsWith(".jpg")) {
                JOptionPane.showMessageDialog(this, "Chỉ hỗ trợ ảnh .jpg!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Copy ảnh vào thư mục dự án
            File destination = new File("src/img_product/" + fileName);
            try {
                Files.copy(selectedFile.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi sao chép ảnh!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Lưu tên ảnh mới
            selectedFileName = fileName;

            // Hiển thị ảnh mới lên giao diện
            ImageIcon icon = new ImageIcon(destination.getAbsolutePath());
            Image scaled = icon.getImage().getScaledInstance(lblAnhSanPham.getWidth(), lblAnhSanPham.getHeight(), Image.SCALE_SMOOTH);
            lblAnhSanPham.setIcon(new ImageIcon(scaled));
        }
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnnotdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnotdauActionPerformed
        NoteSelectorDialog dialog = new NoteSelectorDialog((JFrame) SwingUtilities.getWindowAncestor(this));
        dialog.setVisible(true);
        List<String> newNotes = dialog.getSelectedNotes();

        if (newNotes != null && !newNotes.isEmpty()) {
            String currentText = txtnotdau.getText().trim();
            List<String> currentNotes = new ArrayList<>();

            if (!currentText.isEmpty()) {
                // Tách theo dấu ',' và loại bỏ khoảng trắng thừa
                for (String note : currentText.split(",")) {
                    currentNotes.add(note.trim());
                }
            }

            // Thêm các nốt mới nếu chưa có
            for (String newNote : newNotes) {
                if (!currentNotes.contains(newNote)) {
                    currentNotes.add(newNote);
                }
            }

            txtnotdau.setText(String.join(", ", currentNotes));
        }
    }//GEN-LAST:event_btnnotdauActionPerformed

    public class NoteSelectorDialog extends JDialog {

        private JList<String> listNotes;
        private DefaultListModel<String> listModel;
        private JButton btnOk;
        private List<String> selectedNotes = new ArrayList<>();

        public NoteSelectorDialog(JFrame parent) {
            super(parent, "Chọn nốt hương", true);
            setSize(400, 300);
            setLocationRelativeTo(parent);

            listModel = new DefaultListModel<>();
            listNotes = new JList<>(listModel);
            listNotes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            JScrollPane scrollPane = new JScrollPane(listNotes);

            btnOk = new JButton("Chọn");
            btnOk.addActionListener(e -> {
                selectedNotes = listNotes.getSelectedValuesList();
                dispose();
            });

            add(scrollPane, BorderLayout.CENTER);
            add(btnOk, BorderLayout.SOUTH);
            loadNotes();
        }

        private void loadNotes() {
            NotHuongDAO dao = new NotHuongDAO();
            for (NotHuongDTO note : dao.getAllNotHuongs()) {
                listModel.addElement(note.getName());
            }
        }

        public List<String> getSelectedNotes() {
            return selectedNotes;
        }
    }

    public void setPerfumeId(int id) {
        this.perfumeId = id;
    }

    public void setOldVolumeId(int oldVolumeId) {
        this.oldVolumeId = oldVolumeId;
    }

    public void setSanPhamData(Map<String, Object> sp) {
        txttensp.setText((String) sp.get("name"));
        cbbgioitinh.setSelectedItem((String) sp.get("sex"));
        cbbnongdo.setSelectedItem((String) sp.get("concentration"));
        txtgianhap.setText(String.valueOf(sp.get("cost")));
        txtgiaban.setText(String.valueOf(sp.get("price")));
        this.currentStock = (int) sp.get("stock");

        // Thương hiệu
        ThuongHieuBUS thBUS = new ThuongHieuBUS();
        cbbthuonghieu.removeAllItems();
        for (String name : thBUS.getAllBrandNames()) {
            cbbthuonghieu.addItem(name);
        }
        cbbthuonghieu.setSelectedItem(sp.get("brand_name"));

        // Khuyến mãi
        KhuyenMaiBUS kmBUS = new KhuyenMaiBUS();
        cbbkhuyenmai.removeAllItems();
        for (KhuyenMaiDTO km : kmBUS.getAllKhuyenMais()) {
            cbbkhuyenmai.addItem(km.getName());
        }
        cbbkhuyenmai.setSelectedItem(sp.get("promotion_name"));

        // Dung tích
        DungTichDAO dtDAO = new DungTichDAO();
        cbbdungtich.removeAllItems();
        for (int size : dtDAO.getAllVolumeSizes()) {
            cbbdungtich.addItem(String.valueOf(size));
        }
        cbbdungtich.setSelectedItem(String.valueOf(sp.get("volume_size")));

        // Nốt hương
        txtnotdau.setText(String.join(", ", (List<String>) sp.get("top_notes")));
        txtnotgiua.setText(String.join(", ", (List<String>) sp.get("middle_notes")));
        txtnotcuoi.setText(String.join(", ", (List<String>) sp.get("base_notes")));

        // Ảnh
        // Hiển thị ảnh sản phẩm
        selectedFileName = (String) sp.get("images");
        if (selectedFileName != null) {
            File img = new File("src/img_product/" + selectedFileName);
            if (img.exists()) {
                // Kích thước cố định cho ảnh hiển thị
                final int WIDTH = 330;
                final int HEIGHT = 240;

                ImageIcon icon = new ImageIcon(img.getAbsolutePath());
                Image scaled = icon.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
                lblAnhSanPham.setIcon(new ImageIcon(scaled));
            } else {
                lblAnhSanPham.setIcon(null); // Nếu ảnh không tồn tại
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anhSanPham;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnLuuSP;
    private javax.swing.JButton btnnotcuoi;
    private javax.swing.JButton btnnotdau;
    private javax.swing.JButton btnnotgiua;
    private javax.swing.JComboBox<String> cbbdungtich;
    private javax.swing.JComboBox<String> cbbgioitinh;
    private javax.swing.JComboBox<String> cbbkhuyenmai;
    private javax.swing.JComboBox<String> cbbnongdo;
    private javax.swing.JComboBox<String> cbbthuonghieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAnhSanPham;
    private javax.swing.JLabel lblGiaNhap;
    private javax.swing.JLabel lblGiaXuat;
    private javax.swing.JLabel lblKho;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblThuongHieu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblXuatXu;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtnotcuoi;
    private javax.swing.JTextField txtnotdau;
    private javax.swing.JTextField txtnotgiua;
    private javax.swing.JTextField txttensp;
    // End of variables declaration//GEN-END:variables

}
