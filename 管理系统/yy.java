package 课程设计2;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class yy {
    public static void main(String[] args) throws IOException {
//        try {
//            Clip bgm=AudioSystem.getClip();
//            InputStream is =yy.class.getClassLoader().getResourceAsStream("C:\\Users\\范孝忍\\Desktop\\bgm.wma");
//            AudioInputStream  ais=AudioSystem.getAudioInputStream(is);
//            bgm.open(ais);
//            bgm.start();
//            bgm.loop(Clip.LOOP_CONTINUOUSLY);
//            while (true){}
//
//        } catch (LineUnavailableException e) {
//            e.printStackTrace();
//        } catch (UnsupportedAudioFileException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File f=new File("C:\\Users\\范孝忍\\Desktop\\bgm.wma");
//        URL cb=f.toURL();
//        AudioClip aau= Applet.newAudioClip(cb);
//        while (true){
//            aau.loop();
//        }


        FileInputStream fl=new FileInputStream("C:\\Users\\范孝忍\\Desktop\\黄霄雲星辰大海.wav");
        BufferedInputStream bf=new BufferedInputStream(fl);
        AudioStream au=new AudioStream(bf);
        AudioPlayer.player.start(au);


    }
}
