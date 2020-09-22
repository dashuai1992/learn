package designpattern.adapter;

import designpattern.adapter.enums.PlayerTypeEnum;

public class AudioPlayer implements MediaPlayer {

    private AdapterPlayer adapterPlayer;

    public void play(byte type, String fileName) {
    	switch (type) {
		case PlayerTypeEnum.VLC_TYPE:
            adapterPlayer = new AdapterPlayer(type);
            adapterPlayer.play(type,fileName);
			break;
		case PlayerTypeEnum.MP4_TYPE:
            adapterPlayer = new AdapterPlayer(type);
            adapterPlayer.play(type,fileName);
			break;
		case PlayerTypeEnum.MP3_TYPE:
			System.out.println(PlayerTypeEnum.MP3.getAli() + "is playing," + fileName);
			break;
		default:
			System.out.println("not supported");
			break;
		}
    }
}
