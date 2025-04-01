package DAO;

import DTO.KhuyenMaiDTO;
import DTO.NhanVienDTO;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

public class KhuyenMaiDAO {
    public ArrayList<KhuyenMaiDTO> getAllKhuyenMais() {
        ArrayList<KhuyenMaiDTO> khuyenMaiDTOArrayList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM promotion";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double discountPercent = resultSet.getDouble("discount_percent");
                Timestamp startDate = resultSet.getTimestamp("start_date");
                Timestamp endDate = resultSet.getTimestamp("end_date");

                KhuyenMaiDTO khuyenMaiDTO = new KhuyenMaiDTO(id, name, discountPercent, startDate, endDate);
                khuyenMaiDTOArrayList.add(khuyenMaiDTO);
            }

            return khuyenMaiDTOArrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
