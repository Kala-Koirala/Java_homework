public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = {
                new Light("Light Bulb"),
                new Thermostat("Thermostat"),
                new SecurityCamera("Security Camera")
        };

        for(Device device: devices){
            device.operate();
        }
    }
}

abstract class Device{
    public String deviceName;

    public Device(String deviceName){
        this.deviceName = deviceName;
    }

    public abstract void operate();
}

class Light extends Device{
    public Light(String deviceName){
        super(deviceName);
    }

    @Override
    public void operate(){
        System.out.println(deviceName + " is turning on!");
        System.out.println(" ");
    }
}

class Thermostat extends Device{
    public Thermostat(String deviceName){
        super(deviceName);
    }

    @Override
    public void operate(){
        System.out.println(deviceName + " is setting temperature!");
        System.out.println(" ");
    }
}

class SecurityCamera extends Device{
    public SecurityCamera(String deviceName){
        super(deviceName);
    }

    @Override
    public void operate(){
        System.out.println(deviceName + " is recording now!");
        System.out.println(" ");
    }
}
