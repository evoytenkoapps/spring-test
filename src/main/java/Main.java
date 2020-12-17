import Beans.ClassicalMusic;
import Beans.Music;
import Beans.MusicPlayer;
import Beans.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String... args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic.getSong());
    }

}

