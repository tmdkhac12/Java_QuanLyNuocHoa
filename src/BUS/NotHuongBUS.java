package BUS;

import DAO.NotHuongDAO;
import DTO.NotHuongDTO;

import java.util.ArrayList;

public class NotHuongBUS {
    private NotHuongDAO notHuongDAO;

    public NotHuongBUS() {
        this.notHuongDAO = new NotHuongDAO();
    }

    public ArrayList<NotHuongDTO> getAllNotHuongs() {
        return notHuongDAO.getAllNotHuongs();
    }
}
