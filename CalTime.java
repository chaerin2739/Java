//지구에서 가장 가까운 별까지의 거리 계산

public class CalTime {
    public static void main(String args[]) {
        final double light_speed = 30e4;
        // final을 붙여서 빛의 속도를 부동 소수점형 기호 상수로 정의하고 있다.
        double distance = 40e12;

        double secs;

        secs = distance / light_speed;

        double light_year = secs / (60.0 * 60.0 + 24.0 * 365.0);
        System.out.println("걸리는 시간은 " + light_year + "광년 입니다.");
    }
}
