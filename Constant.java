import javax.swing.plaf.synth.SynthStyle;

public class Constant {
    public static void main(String args[]) {
        // 변수는 실행 도중에 값을 변경 할 수 있으나, 상수는 한번 값이 정해지면
        // 변경이 불가능하다.
        final double kM_PER_MILW = 1.609344;
        double km;
        double mile = 60.0;
        km = kM_PER_MILW * mile;

        System.out.println("60 마일은 " + km + "킬로미터입니다.");
    }
}
