package Tehtava16;

public class SmartTV implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() { return on; }

    @Override
    public void enable() { on = true; }

    @Override
    public void disable() { on = false; }

    @Override
    public int getVolume() { return volume; }

    @Override
    public void setVolume(int percent) { volume = percent; }

    @Override
    public int getChannel() { return channel; }

    @Override
    public void setChannel(int channel) { this.channel = channel; }

    @Override
    public void printStatus() {
        System.out.println("SmartTV status:");
        System.out.println("Power: " + (on ? "On" : "Off"));
        System.out.println("Volume: " + volume);
        System.out.println("Channel: " + channel);
    }

    public void browseInternet() {
        if (on) {
            System.out.println("Browsing the internet on SmartTV...");
        } else {
            System.out.println("Cannot browse. SmartTV is off.");
        }
    }
}

