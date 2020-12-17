package Beans;

public class RockMusic implements Music {
    private RockMusic() {
    }

    public static RockMusic getInstanse() {
        return new RockMusic();
    }

    public String getSong() {
        return "RockMusic";
    }

    public void onInit() {
        System.out.println("OnInit " + this);
    }

    public void onDestroy() {
        System.out.println("onDestroy " + this);
    }
}
