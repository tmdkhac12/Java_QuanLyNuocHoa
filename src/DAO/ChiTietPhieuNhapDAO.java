package DAO;

import DTO.ChiTietPhieuNhapDTO;
import java.sql.Connection;
import util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietPhieuNhapDAO {

    public List<ChiTietPhieuNhapDTO> getChiTietPhieuNhapByMaPhieu(int maPhieuNhap) {
        List<ChiTietPhieuNhapDTO> list = new ArrayList<>();
        Connection connection = DBConnection.getConnection();

        try {
            String sql = "SELECT ird.import_receipt_id, ird.perfume_id, ird.quantity, ird.cost, "
                    + "p.name AS perfume_name, p.sex, st.type_name AS scent_type, b.name AS brand "
                    + "FROM importreceiptdetail ird "
                    + "JOIN perfume p ON ird.perfume_id = p.id "
                    + "JOIN scenttype st ON p.scent_type_id = st.id "
                    + "JOIN brand b ON p.brand_id = b.id "
                    + "WHERE ird.import_receipt_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, maPhieuNhap);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ChiTietPhieuNhapDTO detail = new ChiTietPhieuNhapDTO(
                        rs.getInt("import_receipt_id"),
                        rs.getInt("perfume_id"),
                        rs.getInt("quantity"),
                        rs.getDouble("cost"),
                        rs.getString("perfume_name"),
                        rs.getString("sex"),
                        rs.getString("scent_type"),
                        rs.getString("brand")
                );
                list.add(detail);
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean insertChiTietPhieuNhap(List<ChiTietPhieuNhapDTO> details) {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO importreceiptdetail (import_receipt_id, perfume_id, quantity, cost) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            for (ChiTietPhieuNhapDTO detail : details) {
                ps.setInt(1, detail.getImportReceiptId());
                ps.setInt(2, detail.getPerfumeId());
                ps.setInt(3, detail.getQuantity());
                ps.setDouble(4, detail.getCost());
                ps.addBatch();
            }

            ps.executeBatch();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(conn);
        }

        return false;
    }

}
