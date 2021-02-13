package question3;

public class Computer extends Device implements Ethernet {
    private int ramSlot;
    private String videoCardname;

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public String getVideoCardname() {
        return videoCardname;
    }

    public void setVideoCardname(String videoCardname) {
        this.videoCardname = videoCardname;
    }

    @Override
    public String networkType() {
        return null;
    }

    @Override
    public boolean cableConnected() {
        return true;
    }
}
