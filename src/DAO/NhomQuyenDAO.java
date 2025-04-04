package DAO;

import DTO.NhomQuyenDTO;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class NhomQuyenDAO {
    public ArrayList<NhomQuyenDTO> getAllNhomQuyens() {
        ArrayList<NhomQuyenDTO> nhomQuyenDTOArrayList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM rolegroup";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                NhomQuyenDTO nhomQuyenDTO = new NhomQuyenDTO(id, name);
                nhomQuyenDTOArrayList.add(nhomQuyenDTO);
            }

            return nhomQuyenDTOArrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
