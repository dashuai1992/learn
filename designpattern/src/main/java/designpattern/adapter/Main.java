package designpattern.adapter;

import designpattern.adapter.enums.PlayerTypeEnum;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(PlayerTypeEnum.VLC_TYPE, "la song.vlc");
        audioPlayer.play(PlayerTypeEnum.MP3_TYPE, "la song.mp3");
        audioPlayer.play(PlayerTypeEnum.MP4_TYPE, "la song.mp4");
        audioPlayer.play(PlayerTypeEnum.MP5_TYPE, "la song.mp5");
    }
}
