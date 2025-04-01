package BUS;

import DAO.KhuyenMaiDAO;
import DTO.KhuyenMaiDTO;

import java.util.ArrayList;

public class KhuyenMaiBUS {
    private KhuyenMaiDAO khuyenMaiDAO;

    public KhuyenMaiBUS() {
        this.khuyenMaiDAO = new KhuyenMaiDAO();
    }

    public ArrayList<KhuyenMaiDTO> getAllKhuyenMais() {
        return khuyenMaiDAO.getAllKhuyenMais();
    }
}
