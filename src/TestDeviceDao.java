import java.sql.ResultSet;

public class TestDeviceDao {

    public static void main(String[] args) {

        DeviceDAO deviceDAO = new DeviceDAO();
        deviceDAO.getAllDeviceWIthHearthRateAndGps("paolo");

    }



}
