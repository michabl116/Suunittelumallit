package Tehtava16;


public class Demo {
    public static void main(String[] args) {
        Device smartTV = new SmartTV();
        SmartRemote smartRemote = new SmartRemote(smartTV);

        smartRemote.power();
        smartRemote.volumeDown();
        smartRemote.channelUp();
        smartRemote.voiceControl("browse");
        smartRemote.voiceControl("mute");
        smartTV.printStatus();
    }
}
