package DAO;

import DTO.NotHuongDTO;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NotHuongDAO {
    public ArrayList<NotHuongDTO> getAllNotHuongs() {
        ArrayList<NotHuongDTO> notHuongDTOArrayList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM notes";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("note_name");

                NotHuongDTO notHuongDTO = new NotHuongDTO(id, name);
                notHuongDTOArrayList.add(notHuongDTO);
            }

            return notHuongDTOArrayList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
