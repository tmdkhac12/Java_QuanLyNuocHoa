package BUS;

import DAO.NuocHoaDAO;
import DTO.NuocHoaDTO;
import java.util.ArrayList;

public class NuocHoaBUS {
    private NuocHoaDAO nuocHoaDAO;

    public NuocHoaBUS() {
        nuocHoaDAO = new NuocHoaDAO();
    }

    public ArrayList<NuocHoaDTO> getAllNuocHoa() {
        return nuocHoaDAO.getAllNuocHoa();
    }
}
