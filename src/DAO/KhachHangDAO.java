package DAO;

import DTO.KhachHangDTO;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KhachHangDAO {

    public ArrayList<KhachHangDTO> getAllKhachHangs() {
        ArrayList<KhachHangDTO> khachHangs = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM customer";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");

                KhachHangDTO khachHangDTO = new KhachHangDTO(id, name, phone, email);
                khachHangs.add(khachHangDTO);
            }

            return khachHangs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
