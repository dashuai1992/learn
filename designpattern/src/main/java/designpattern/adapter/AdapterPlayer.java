package designpattern.adapter;

import designpattern.adapter.enums.PlayerTypeEnum;

public class AdapterPlayer implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdapterPlayer(byte type) {
    	switch (type) {
		case PlayerTypeEnum.VLC_TYPE:
			advancedMediaPlayer = new VlcPlayer();
			break;
		case PlayerTypeEnum.MP4_TYPE:
			advancedMediaPlayer = new Mp4Player();
			break;
		default:
			System.out.println("not supported");
			break;
		}
    }

    public void play(byte type, String fileName) {
    	switch (type) {
		case PlayerTypeEnum.VLC_TYPE:
			advancedMediaPlayer.playVlc(fileName);
			break;
		case PlayerTypeEnum.MP4_TYPE:
			advancedMediaPlayer.playMp4(fileName);
			break;
		default:
			System.out.println("not supported");
			break;
		}
    }
}
