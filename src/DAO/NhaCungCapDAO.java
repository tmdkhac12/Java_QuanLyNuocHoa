/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhaCungCapDTO;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import util.DBConnection;

/**
 *
 * @author hoang
 */
public class NhaCungCapDAO {

    public static List<NhaCungCapDTO> getAll() {
        List<NhaCungCapDTO> list = new ArrayList<>();
        String sql = "SELECT id, name, phone, email FROM supplier";
        Connection connection = DBConnection.getConnection();
        try (
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                NhaCungCapDTO s = new NhaCungCapDTO(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("email")
                );
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


}
