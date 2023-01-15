import javax.naming.spi.DirObjectFactory;

public class Light {
    public static void main(String args[]) {
        long Lightspeed = 300000;
        long distance = Lightspeed * 365L * 24 * 60 * 60;

        System.out.println("빛이 1년동안 가는 거리 : " + distance + "kM.");
    }
}
