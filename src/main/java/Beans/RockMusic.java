package Beans;

public class RockMusic implements Music {
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
