package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;

import java.util.ArrayList;

public class NhanVienBUS {
    private NhanVienDAO nhanVienDAO;

    public NhanVienBUS() {
        this.nhanVienDAO = new NhanVienDAO();
    }

    public ArrayList<NhanVienDTO> getAllNhanViens() {
        return nhanVienDAO.getAllNhanViens();
    }
}
