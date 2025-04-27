/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Panel;

import DAO.NuocHoaDAO;
import DTO.NhanVienDTO;
import DTO.NuocHoaDTO;
import GUI.HDon.ChonKhachHang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import util.DBConnection;

/**
 *
 * @author Administrator
 */
public class ThemHoaDon extends javax.swing.JPanel {

    private ArrayList<NuocHoaDTO> listNuocHoa = new ArrayList<>();
    private static int loggedInEmployeeId;
    private static String loggedInEmployeeName;
    private int selectedCustomerId = -1;

    public ThemHoaDon() {
        initComponents();
        loadDanhSachSanPham();
        setUpTable();
        centerTableData(tblsoluongsanpham);
        centerTableData(tblthongtinspdathem);
        txtmahoadon.setText(taoMaHoaDonTuDong());
        txtmahoadon.setEditable(false);
        setNhanVienDangNhap();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerpanel = new javax.swing.JPanel();
        leftcontent = new javax.swing.JPanel();
        containernhap = new javax.swing.JPanel();
        txtsoluong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnxoasanpham = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblsoluongsanpham = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblthongtinspdathem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtmahoadon = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtnhanvienbanhang = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttongtien = new javax.swing.JLabel();
        btnxuathoadon = new javax.swing.JButton();
        txtkhachhang = new javax.swing.JTextField();
        btnchonkhachhang = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        containerpanel.setBackground(new java.awt.Color(255, 255, 255));
        containerpanel.setLayout(new java.awt.BorderLayout());

        containernhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        containernhap.setPreferredSize(new java.awt.Dimension(447, 385));

        txtsoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoluongActionPerformed(evt);
            }
        });

        jLabel3.setText("Số lượng");

        btnxoasanpham.setBackground(new java.awt.Color(255, 102, 153));
        btnxoasanpham.setForeground(new java.awt.Color(255, 255, 255));
        btnxoasanpham.setText("Xóa sản phẩm");
        btnxoasanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoasanphamActionPerformed(evt);
            }
        });

        btnthem.setBackground(new java.awt.Color(0, 153, 255));
        btnthem.setForeground(new java.awt.Color(255, 255, 255));
        btnthem.setText("Thêm sản phẩm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containernhapLayout = new javax.swing.GroupLayout(containernhap);
        containernhap.setLayout(containernhapLayout);
        containernhapLayout.setHorizontalGroup(
            containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containernhapLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containernhapLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 363, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containernhapLayout.createSequentialGroup()
                        .addGroup(containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containernhapLayout.createSequentialGroup()
                                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnxoasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
        );
        containernhapLayout.setVerticalGroup(
            containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containernhapLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(containernhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        tblsoluongsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên sản phẩm", "Số lượng tồn", "Giá bán"
            }
        ));
        tblsoluongsanpham.setFocusTraversalPolicyProvider(true);
        tblsoluongsanpham.setRequestFocusEnabled(false);
        tblsoluongsanpham.setRowHeight(40);
        jScrollPane3.setViewportView(tblsoluongsanpham);

        tblthongtinspdathem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nước hoa", "Tên ", "Giới tính", "Loại hương", "Thương hiệu", "Giá bán", "Số lượng"
            }
        ));
        tblthongtinspdathem.setRowHeight(30);
        jScrollPane2.setViewportView(tblthongtinspdathem);

        javax.swing.GroupLayout leftcontentLayout = new javax.swing.GroupLayout(leftcontent);
        leftcontent.setLayout(leftcontentLayout);
        leftcontentLayout.setHorizontalGroup(
            leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftcontentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftcontentLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(containernhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        leftcontentLayout.setVerticalGroup(
            leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftcontentLayout.createSequentialGroup()
                .addGroup(leftcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(containernhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        containerpanel.add(leftcontent, java.awt.BorderLayout.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Nhân viên bán hàng");

        jLabel17.setText("Khách hàng");

        jLabel18.setText("Mã hóa đơn");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("TỔNG TIỀN:");

        txttongtien.setText("0đ");

        btnxuathoadon.setBackground(new java.awt.Color(0, 153, 51));
        btnxuathoadon.setForeground(new java.awt.Color(255, 255, 255));
        btnxuathoadon.setText("Xuất hóa đơn");
        btnxuathoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxuathoadonActionPerformed(evt);
            }
        });

        txtkhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhachhangActionPerformed(evt);
            }
        });

        btnchonkhachhang.setText("...");
        btnchonkhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchonkhachhangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnchonkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(txtmahoadon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(txtnhanvienbanhang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnxuathoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtmahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtnhanvienbanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnchonkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxuathoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        containerpanel.add(jPanel1, java.awt.BorderLayout.EAST);

        add(containerpanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        int selectedRow = tblsoluongsanpham.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần thêm!");
            return;
        }

        try {
            int soLuongNhap = Integer.parseInt(txtsoluong.getText().trim());
            if (soLuongNhap <= 0) {
                JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0!");
                return;
            }

            // Lấy dữ liệu sản phẩm
            int maSP = (int) tblsoluongsanpham.getValueAt(selectedRow, 0);
            String tenSP = (String) tblsoluongsanpham.getValueAt(selectedRow, 1);
            int soLuongTon = (int) tblsoluongsanpham.getValueAt(selectedRow, 2);
            double giaBan = (double) tblsoluongsanpham.getValueAt(selectedRow, 3);

            if (soLuongNhap > soLuongTon) {
                JOptionPane.showMessageDialog(this, "Số lượng nhập vượt quá số lượng tồn kho!");
                return;
            }

            // Tìm thêm thông tin ánh xạ
            NuocHoaDTO selectedPerfume = listNuocHoa.stream()
                    .filter(sp -> sp.getId() == maSP)
                    .findFirst()
                    .orElse(null);

            if (selectedPerfume == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm!");
                return;
            }

            String gioiTinh = selectedPerfume.getSex();
            String loaiHuong = selectedPerfume.getScentName();
            String thuongHieu = selectedPerfume.getBrandName();

            DefaultTableModel model = (DefaultTableModel) tblthongtinspdathem.getModel();

            boolean found = false;

            for (int i = 0; i < model.getRowCount(); i++) {
                int existingId = (int) model.getValueAt(i, 1); // cột Mã SP
                if (existingId == maSP) {
                    // Nếu SP đã tồn tại ➔ cộng dồn số lượng
                    int soLuongHienTai = (int) model.getValueAt(i, 7); // cột Số lượng
                    model.setValueAt(soLuongHienTai + soLuongNhap, i, 7); // cập nhật lại số lượng
                    found = true;
                    break;
                }
            }

            if (!found) {
                // Nếu chưa có ➔ thêm dòng mới
                int stt = model.getRowCount() + 1;
                model.addRow(new Object[]{
                    stt,
                    maSP,
                    tenSP,
                    gioiTinh,
                    loaiHuong,
                    thuongHieu,
                    giaBan,
                    soLuongNhap
                });
            }

            // Reset số lượng nhập
            txtsoluong.setText("");

            // Cập nhật tổng tiền
            tinhTongTien();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số nguyên hợp lệ!");
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoasanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoasanphamActionPerformed
        int selectedRow = tblthongtinspdathem.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần xóa.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc chắn muốn xóa sản phẩm này?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return; // Không xóa nếu người dùng chọn "Không"
        }

        DefaultTableModel model = (DefaultTableModel) tblthongtinspdathem.getModel();
        model.removeRow(selectedRow);

        // Cập nhật lại STT sau khi xóa
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(i + 1, i, 0); // Cột 0 là STT
        }
    }//GEN-LAST:event_btnxoasanphamActionPerformed

    private void txtkhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhachhangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhachhangActionPerformed

    private void btnchonkhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchonkhachhangActionPerformed
        ChonKhachHang dialog = new ChonKhachHang(null, true); // null: không có cha cụ thể
        dialog.setVisible(true);

        // Sau khi dialog đóng lại, lấy thông tin
        if (dialog.getSelectedCustomerId() != -1) { // kiểm tra có chọn hay không
            int maKhachHang = dialog.getSelectedCustomerId();
            String tenKhachHang = dialog.getSelectedCustomerName();

            txtkhachhang.setText(maKhachHang + " - " + tenKhachHang); // set text
            selectedCustomerId = maKhachHang; // lưu lại mã khách hàng để sau này ghi vào hóa đơn
        }
    }//GEN-LAST:event_btnchonkhachhangActionPerformed

    private void btnxuathoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxuathoadonActionPerformed
        int invoiceId = Integer.parseInt(txtmahoadon.getText().trim());
        int customerId = selectedCustomerId; // lưu khi chọn khách
        int employeeId = loggedInEmployeeId; // lưu sẵn khi đăng nhập
        String tongTienStr = txttongtien.getText().replace("đ", "").trim();
        double totalAmount = Double.parseDouble(tongTienStr);
        Timestamp issueDate = new Timestamp(System.currentTimeMillis()); // giờ hiện tại

        Connection conn = null;
        PreparedStatement pstInvoice = null;
        PreparedStatement pstDetail = null;

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false); // Bắt đầu transaction

            // 1. Insert vào bảng invoice
            String sqlInvoice = "INSERT INTO invoice (id, customer_id, employee_id, total, issue_date) VALUES (?, ?, ?, ?, ?)";
            pstInvoice = conn.prepareStatement(sqlInvoice);
            pstInvoice.setInt(1, invoiceId);
            pstInvoice.setInt(2, customerId);
            pstInvoice.setInt(3, employeeId);
            pstInvoice.setDouble(4, totalAmount);
            pstInvoice.setTimestamp(5, issueDate);
            pstInvoice.executeUpdate();

            // 2. Insert từng dòng vào invoicedetail
            String sqlDetail = "INSERT INTO invoicedetail (invoice_id, perfume_id, quantity) VALUES (?, ?, ?)";
            pstDetail = conn.prepareStatement(sqlDetail);

            DefaultTableModel model = (DefaultTableModel) tblthongtinspdathem.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                int perfumeId = Integer.parseInt(model.getValueAt(i, 1).toString()); // mã sp
                int quantity = Integer.parseInt(model.getValueAt(i, 7).toString()); // số lượng

                pstDetail.setInt(1, invoiceId);
                pstDetail.setInt(2, perfumeId);
                pstDetail.setInt(3, quantity);
                pstDetail.addBatch(); // gom nhiều lệnh lại cho nhanh
            }

            pstDetail.executeBatch(); // chạy hết 1 lần
            conn.commit(); // Commit transaction

            JOptionPane.showMessageDialog(this, "Xuất hóa đơn thành công!");

            resetForm(); // Clear form sau khi xuất hóa đơn

        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback(); // nếu lỗi thì rollback
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Xuất hóa đơn thất bại!");
        } finally {
            try {
                if (pstInvoice != null) {
                    pstInvoice.close();
                }
                if (pstDetail != null) {
                    pstDetail.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnxuathoadonActionPerformed

    private void txtsoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoluongActionPerformed

    private void resetForm() {
        txtmahoadon.setText(taoMaHoaDonTuDong()); // Sau khi xuất xong thì tự tạo mã hóa đơn mới
        txtkhachhang.setText("");
        selectedCustomerId = -1; // Reset mã khách đã chọn
        txttongtien.setText("0đ");

        DefaultTableModel model = (DefaultTableModel) tblthongtinspdathem.getModel();
        model.setRowCount(0); // Clear bảng sản phẩm đã thêm
    }

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
        NuocHoaDAO dao = new NuocHoaDAO();
        listNuocHoa = dao.getAllNuocHoa();
        DefaultTableModel model = (DefaultTableModel) tblsoluongsanpham.getModel();
        model.setRowCount(0);

        for (NuocHoaDTO sp : listNuocHoa) {
            model.addRow(new Object[]{
                sp.getId(),
                sp.getName(),
                sp.getStock(),
                sp.getPrice()
            });
        }
    }

    private void tinhTongTien() {
        DefaultTableModel model = (DefaultTableModel) tblthongtinspdathem.getModel();
        double tongTien = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            double giaBan = (double) model.getValueAt(i, 6); // Cột giá bán
            int soLuong = (int) model.getValueAt(i, 7);      // Cột số lượng
            tongTien += giaBan * soLuong;
        }

        txttongtien.setText(String.format("%.0f đ", tongTien)); // Hiển thị tổng tiền
    }

    private String taoMaHoaDonTuDong() {
        int nextId = 1;

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT MAX(id) AS max_id FROM invoice"; // ⚡ đổi đúng bảng hóa đơn
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

    private void setNhanVienDangNhap() {
        String displayText = loggedInEmployeeId + " - " + loggedInEmployeeName;
        txtnhanvienbanhang.setText(displayText);
        txtnhanvienbanhang.setEditable(false);
    }

    public static void setLoggedInEmployee(int id, String name) {
        loggedInEmployeeId = id;
        loggedInEmployeeName = name;
    }
    
    private void formatCurrencyField(javax.swing.JTextField textField) {
        String text = textField.getText().replace(",", "").trim();
        if (text.isEmpty()) {
            return;
        }

        try {
            double value = Double.parseDouble(text);
            textField.setText(String.format("%,d", (long) value));
        } catch (NumberFormatException e) {
            // Nếu nhập ký tự không hợp lệ thì bỏ qua không định dạng
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchonkhachhang;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoasanpham;
    private javax.swing.JButton btnxuathoadon;
    private javax.swing.JPanel containernhap;
    private javax.swing.JPanel containerpanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel leftcontent;
    private javax.swing.JTable tblsoluongsanpham;
    private javax.swing.JTable tblthongtinspdathem;
    public javax.swing.JTextField txtkhachhang;
    private javax.swing.JTextField txtmahoadon;
    private javax.swing.JTextField txtnhanvienbanhang;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JLabel txttongtien;
    // End of variables declaration//GEN-END:variables

}
