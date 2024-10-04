package level0;

import java.util.Scanner;

public class PrintWithStringAttached {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 붙여서 출력하기
    //
    // 문제 설명
    // 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
    // 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        //String c = sc.next();


        // a + b 실행 후
        // "Hello World" 콘솔에 입력
        // "HelloWorld" 출력
        //
        // a + b + c
        // "Hello World !!! 콘솔에 입력
        // "HelloWorld!!!" 출력


        System.out.println(a+b);
        //System.out.println(a+b+c);

    }

}
