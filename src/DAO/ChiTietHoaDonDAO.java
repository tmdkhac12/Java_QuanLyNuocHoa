package DAO;

import DTO.ChiTietHoaDonDTO;
import java.sql.Connection;
import util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietHoaDonDAO {

    public List<ChiTietHoaDonDTO> getChiTietHoaDonByMaHoaDon(int invoiceId) {
        List<ChiTietHoaDonDTO> list = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT idt.invoice_id, pf.id as perfume_id, pf.name as perfume_name, pf.sex, st.type_name, br.name as brand_name, pf.price, idt.quantity "
                    + "FROM invoicedetail idt "
                    + "JOIN perfume pf ON idt.perfume_id = pf.id "
                    + "JOIN scenttype st ON pf.scent_type_id = st.id "
                    + "JOIN brand br ON pf.brand_id = br.id "
                    + "WHERE idt.invoice_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, invoiceId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                ChiTietHoaDonDTO detail = new ChiTietHoaDonDTO(
                        rs.getInt("invoice_id"),
                        rs.getInt("perfume_id"),
                        rs.getString("perfume_name"),
                        rs.getString("sex"),
                        rs.getString("type_name"),
                        rs.getString("brand_name"),
                        rs.getDouble("price"),
                        rs.getInt("quantity")
                );
                list.add(detail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
