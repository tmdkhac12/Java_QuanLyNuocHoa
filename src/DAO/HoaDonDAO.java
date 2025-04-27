/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.HoaDonDTO;
import util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class HoaDonDAO {

    public List<HoaDonDTO> getAllHoaDon() {
        List<HoaDonDTO> list = new ArrayList<>();
        String sql = "SELECT i.id, i.customer_id, i.employee_id, c.name AS customer_name, e.name AS employee_name, i.issue_date, i.total "
                + "FROM invoice i "
                + "JOIN customer c ON i.customer_id = c.id "
                + "JOIN employee e ON i.employee_id = e.id "
                + "ORDER BY i.issue_date DESC";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                HoaDonDTO dto = new HoaDonDTO(
                        rs.getInt("id"),
                        rs.getInt("customer_id"),
                        rs.getInt("employee_id"),
                        rs.getString("employee_name"),
                        rs.getString("customer_name"),
                        rs.getTimestamp("issue_date"),
                        rs.getDouble("total")
                );
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<HoaDonDTO> searchWithNames(String keyword) {
        ArrayList<HoaDonDTO> list = new ArrayList<>();
        String sql = "SELECT i.id, c.name AS customer_name, e.name AS employee_name, i.issue_date, i.total "
                + "FROM invoice i "
                + "JOIN customer c ON i.customer_id = c.id "
                + "JOIN employee e ON i.employee_id = e.id "
                + "WHERE c.name LIKE ? OR e.name LIKE ? OR i.id LIKE ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            String kw = "%" + keyword + "%";
            ps.setString(1, kw);
            ps.setString(2, kw);
            ps.setString(3, kw);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonDTO dto = new HoaDonDTO(
                        rs.getInt("id"),
                        rs.getString("employee_name"),
                        rs.getString("customer_name"),
                        rs.getTimestamp("issue_date"),
                        rs.getDouble("total")
                );
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean deleteInvoice(int id) {
        String sql = "DELETE FROM invoice WHERE id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
