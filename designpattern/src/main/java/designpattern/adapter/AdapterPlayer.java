package designpattern.adapter;

public class AdapterPlayer implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdapterPlayer(String audioType) {
        if("vlc".equalsIgnoreCase(audioType))
            advancedMediaPlayer = new VlcPlayer();
        else
            advancedMediaPlayer = new Mp4Player();
    }

    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType))
            advancedMediaPlayer.playVlc(fileName);
        else
            advancedMediaPlayer.playMp4(fileName);
    }
}
