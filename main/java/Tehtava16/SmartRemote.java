package Tehtava16;


public class SmartRemote extends BasicRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice command received: " + command);
        switch (command.toLowerCase()) {
            case "mute":
                device.setVolume(0);
                break;
            case "next channel":
                device.setChannel(device.getChannel() + 1);
                break;
            case "browse":
                if (device instanceof SmartTV) {
                    ((SmartTV) device).browseInternet();
                } else {
                    System.out.println("Device does not support browsing.");
                }
                break;
            default:
                System.out.println("Unknown command.");
        }
    }
}
