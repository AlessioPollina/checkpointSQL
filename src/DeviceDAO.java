import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeviceDAO {

    public List<Device> getAllDeviceWIthHearthRateAndGps(String username) {

        List<Device> deviceList = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbDevelhope", "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from device where deviceHasGps <> 0 and deviceHasHeartrate <> 0 and username = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Device device = new Device(resultSet.getString("DEVICE_PART-NUMBER"),
                        resultSet.getString("DEVICE-MANUFACTURER"),
                        resultSet.getString("DEVICE_MODEL"),
                        resultSet.getShort("DEVICE_HAS_GPS"),
                        resultSet.getShort("DEVICE_HAS_HEARTRATE"),
                        resultSet.getString("USERNAME"));

                deviceList.add(device);
            }

            System.out.println(deviceList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return deviceList;
    }
}
