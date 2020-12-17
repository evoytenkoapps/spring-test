package Beans;

public class MusicPlayer implements LifeCycle {
    private Music music;
    private String name;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    private MusicPlayer() {
    }

    public void playMusic() {
        System.out.println(this.music.getSong());
    }

    public void setMusic(Music music) {
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









