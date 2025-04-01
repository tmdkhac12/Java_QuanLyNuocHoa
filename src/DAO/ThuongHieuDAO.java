package DAO;

import DTO.ThuongHieuDTO;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ThuongHieuDAO {
    public ArrayList<ThuongHieuDTO> getAllThuongHieus() {
        ArrayList<ThuongHieuDTO> thuongHieuDTOArrayList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM brand";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                ThuongHieuDTO thuongHieuDTO = new ThuongHieuDTO(id, name);
                thuongHieuDTOArrayList.add(thuongHieuDTO);
            }

            return thuongHieuDTOArrayList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
