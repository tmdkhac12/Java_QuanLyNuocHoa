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

    public int themKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
        if (khuyenMaiDAO.isExistTenKhuyenMai(khuyenMaiDTO.getName())) {
            return -1;
        }

        if (khuyenMaiDAO.addKhuyenMai(khuyenMaiDTO)) {
            return 1;
        }
        return 0;
    }

    public int suaKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
        if (khuyenMaiDAO.isExistTenKhuyenMaiExcept(khuyenMaiDTO.getName(), khuyenMaiDTO.getId())) {
            return -1;
        }

        if (khuyenMaiDAO.updateKhuyenMai(khuyenMaiDTO)) {
            return 1;
        }
        return 0;
    }

    public boolean xoaKhuyenMai(int id) {
        return khuyenMaiDAO.deleteKhuyenMai(id);
    }

    public KhuyenMaiDTO getKhuyenMai(int id) {
        return khuyenMaiDAO.getKhuyenMaiById(id);
    }
}
