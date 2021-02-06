package question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeviceTest {
    @Test
    public void phoneExtendsDevice() {
        Device device = new Phone();
        assertFalse(device.isOn());
    }

    @Test
    public void computerExtendsDevice() {
        Device device = new Computer();
        assertFalse(device.isOn());
    }

    @Test
    public void checkPhoneScreenDimension() {
        Device device = new Phone(375, 812);
        assertEquals(375, device.getWidth());
        assertEquals(812, device.getHeight());
    }

    @Test
    public void checkPhoneOperatingSystem() {
        Device device = new Phone("Android OS");
        assertEquals("Android OS", device.getOperatingSystem());
    }

    @Test
    public void checkPhoneNetworkName() {
        Phone phone = new Phone();
        assertTrue(phone instanceof MobileNetwork);
        assertEquals("4G", phone.networkType());
    }

    @Test
    public void checkComputerCableConnection() {
        Computer computer = new Computer();
        assertTrue(computer instanceof Ethernet);
        assertTrue(computer.cableConnected());
    }
}
