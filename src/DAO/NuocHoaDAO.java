package DAO;

import DTO.NuocHoaDTO;
import java.util.ArrayList;
import util.DBConnection;
import java.sql.*;

public class NuocHoaDAO {
    public ArrayList<NuocHoaDTO> getAllNuocHoa() {
        ArrayList<NuocHoaDTO> nuochoa = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        try {
            String query = "SELECT p.id, p.name, p.sex, p.brand_id, b.name AS brand_name, " +
                           "p.scent_type_id, s.type_name AS scent_name, p.stock, p.price " + 
                           "FROM perfume p " +
                           "JOIN brand b ON p.brand_id = b.id " +                         
                           "JOIN scenttype s ON p.scent_type_id = s.id";

            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                int brandId = rs.getInt("brand_id");
                String brandName = rs.getString("brand_name");
                int scentTypeId = rs.getInt("scent_type_id");
                String scentName = rs.getString("scent_name");
                int stock = rs.getInt("stock");
                double price = rs.getDouble("price"); // Bây giờ không còn lỗi price nữa

                NuocHoaDTO nh = new NuocHoaDTO(id, name, sex, brandId, brandName, scentTypeId, scentName, stock, price);
                nuochoa.add(nh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nuochoa;
    }
}
