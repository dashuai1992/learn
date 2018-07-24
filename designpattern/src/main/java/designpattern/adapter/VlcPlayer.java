package designpattern.adapter;

/*
 * @Auther yuandashuai
 * @Date 2018/7/24
 * vlc player
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("vlc is playing," + fileName);
    }

    public void playMp4(String fileName) {

    }
}
