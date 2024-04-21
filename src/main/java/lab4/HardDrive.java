package lab4;

public class HardDrive extends Component implements Electrical {

    private String storageDevice;

    public HardDrive() {
        super();
        storageDevice = null;
    }

    public HardDrive(String storageDevice) {
        super();
        this.storageDevice = storageDevice;
    }

    public boolean isSSD() {
        return storageDevice.equals("SSD");
    }

    public boolean isHDD() {
        return storageDevice.equals("HDD");
    }

    public String storageDevice() {
        return Math.random() < 0.5 ? (storageDevice = "HDD") : (storageDevice = "SSD");
    }

    @Override
    public void turnOnResource() {

    }

    @Override
    public void turnOffResource() {

    }
}
