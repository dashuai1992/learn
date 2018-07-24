package designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("vlc", "la song.vlc");
        audioPlayer.play("mp3", "la song.mp3");
        audioPlayer.play("mp4", "la song.mp4");
        audioPlayer.play("mp5", "la song.mp5");
    }
}
