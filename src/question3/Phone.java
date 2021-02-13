package question3;

public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;

    public Phone(int i, int i1) {
        super();
        super.setWidth(i);
        super.setHeight(i1);

    }

    public Phone(String sys) {
        super();
        super.setOperatingSystem(sys);
    }

    public Phone() {

    }

    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String networkType() {
        return "4G";
    }

    @Override
    public boolean cableConnected() {
        return false;
    }
}
