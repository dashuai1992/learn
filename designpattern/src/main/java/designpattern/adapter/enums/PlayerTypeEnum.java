package designpattern.adapter.enums;

public enum PlayerTypeEnum {
	
	VLC((byte)1,"vlc"),
	MP3((byte)2,"mp3"),
	MP4((byte)3,"mp4"),
	MP5((byte)4,"mp5");
	
	public static final byte VLC_TYPE=1;
	public static final byte MP3_TYPE=2;
	public static final byte MP4_TYPE=3;
	public static final byte MP5_TYPE=4;
	
	private byte val;
	private String ali;
	PlayerTypeEnum(byte val, String ali){
		this.val = val;
		this.ali = ali;
	}
	public byte getVal() {
		return val;
	}

	public String getAli() {
		return ali;
	}
}
