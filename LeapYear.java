//수식이란 변수와 상수로 이루어져있는 피연산자와 연산자의 조합이다
//대입연산자(=)는 왼쪽 변수에 오른쪽 수식의 값을 계산하여 저장한다.
//대입 연산자 == 할당연산자 == 배정 연산자 라고도 한다.

public class LeapYear {
    public static void main(String[] args) {

        int year = 2023;
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);
        System.out.println(isLeapYear);
    }
}
