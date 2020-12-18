package Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer implements LifeCycle {
    private Music music;
    private String name;

//    // IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    private MusicPlayer() {
//    }

    public void playMusic() {
        System.out.println(this.music.getSong());
    }

    @Autowired
    public void setMusic(RockMusic music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.music.toString();
    }

    public void onInit() {
        System.out.println("onInit " + this);
    }

    public void onDestroy() {
        System.out.println("onDestroy " + this);
    }
}









