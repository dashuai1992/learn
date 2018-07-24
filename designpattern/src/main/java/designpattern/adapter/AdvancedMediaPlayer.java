package designpattern.adapter;

/*
 * @Auther yuandashuai
 * @Date 2018/7/24
 * a advanced mediaplayer which can play the vlc and mp4.
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
