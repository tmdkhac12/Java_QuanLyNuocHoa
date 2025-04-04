package BUS;

import DAO.NhomQuyenDAO;
import DTO.NhomQuyenDTO;

import java.util.ArrayList;

public class NhomQuyenBUS {
    private NhomQuyenDAO nhomQuyenDAO;

    public NhomQuyenBUS() {
        this.nhomQuyenDAO = new NhomQuyenDAO();
    }

    public ArrayList<NhomQuyenDTO> getAllNhomQuyens() {
        return  nhomQuyenDAO.getAllNhomQuyens();
    }
}
