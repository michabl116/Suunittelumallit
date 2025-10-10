package Tehtava16;

public class Tv implements Device {
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
        System.out.println("TV status:");
        System.out.println("Power: " + (on ? "On" : "Off"));
        System.out.println("Volume: " + volume);
        System.out.println("Channel: " + channel);
    }
}
