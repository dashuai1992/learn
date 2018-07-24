package designpattern.adapter;

public class AudioPlayer implements MediaPlayer {

    private AdapterPlayer adapterPlayer;

    public void play(String audioType, String fileName) {
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("mp3 is playing," + fileName);
        }else if("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)){
            adapterPlayer = new AdapterPlayer(audioType);
            adapterPlayer.play(audioType,fileName);
        }else
            System.out.println(audioType + " is not supported");
    }
}
