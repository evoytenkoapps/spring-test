import Beans.ClassicalMusic;
import Beans.Music;
import Beans.MusicPlayer;
import Beans.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String... args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);
        System.out.println(rockMusic.getSong());
        // RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);

    }

}

