package designpattern.adapter;

/*
 * @Auther yuandashuai
 * @Date 2018/7/24
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("mp4 is playing," + fileName);
    }
}
