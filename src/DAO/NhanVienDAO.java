package DAO;

import DTO.NhanVienDTO;
import DTO.NotHuongDTO;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class NhanVienDAO {
    public ArrayList<NhanVienDTO> getAllNhanViens() {
        ArrayList<NhanVienDTO> nhanVienDTOArrayList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM employee inner join rolegroup on employee.rolegroup_id = rolegroup.id;";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int roleGroupId = resultSet.getInt("employee.rolegroup_id");
                String name = resultSet.getString("employee.name");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String roleGroupName = resultSet.getString("rolegroup.name");
                boolean status = resultSet.getBoolean("status");

                NhanVienDTO nhanVienDTO = new NhanVienDTO(id, roleGroupId, name, username, password, roleGroupName, status);
                nhanVienDTOArrayList.add(nhanVienDTO);
            }

            return nhanVienDTOArrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
