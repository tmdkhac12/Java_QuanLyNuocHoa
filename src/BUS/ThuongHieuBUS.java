package BUS;

import DAO.ThuongHieuDAO;
import DTO.ThuongHieuDTO;

import java.util.ArrayList;

public class ThuongHieuBUS {
    private ThuongHieuDAO thuongHieuDAO;

    public ThuongHieuBUS() {
        this.thuongHieuDAO = new ThuongHieuDAO();
    }

    public ArrayList<ThuongHieuDTO> getAllThuongHieus() {
        return thuongHieuDAO.getAllThuongHieus();
    }
}
