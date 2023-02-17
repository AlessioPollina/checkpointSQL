public class Device {

    public String devicePartNumber;
    public String deviceManufacturer;
    public String deviceModel;
    public Short deviceHasGps;
    public Short deviceHasHeartrate;
    public String userName;

    public Device(String devicePartNumber, String deviceManufacturer, String deviceModel, Short deviceHasGps, Short deviceHasHeartrate, String userName) {
        this.devicePartNumber = devicePartNumber;
        this.deviceManufacturer = deviceManufacturer;
        this.deviceModel = deviceModel;
        this.deviceHasGps = deviceHasGps;
        this.deviceHasHeartrate = deviceHasHeartrate;
        this.userName = userName;
    }

    public String getDevicePartNumber() {
        return devicePartNumber;
    }

    public void setDevicePartNumber(String devicePartNumber) {
        this.devicePartNumber = devicePartNumber;
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public Short getDeviceHasGps() {
        return deviceHasGps;
    }

    public void setDeviceHasGps(Short deviceHasGps) {
        this.deviceHasGps = deviceHasGps;
    }

    public Short getDeviceHasHeartrate() {
        return deviceHasHeartrate;
    }

    public void setDeviceHasHeartrate(Short deviceHasHeartrate) {
        this.deviceHasHeartrate = deviceHasHeartrate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Device{" +
                "devicePartNumber='" + devicePartNumber + '\'' +
                ", deviceManufacturer='" + deviceManufacturer + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", deviceHasGps=" + deviceHasGps +
                ", deviceHasHeartrate=" + deviceHasHeartrate +
                ", userName='" + userName + '\'' +
                '}';
    }
}
