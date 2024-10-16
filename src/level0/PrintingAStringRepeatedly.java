package level0;

import java.util.Scanner;

public class PrintingAStringRepeatedly {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 반복해서 출력하기
    //
    // 문제 설명
    // 문자열 str과 정수 n이 주어집니다.
    // str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i<n; i++){

            // result += str;
            result.append(str);


            // System.out.println(result);

        }

        System.out.println(result);

    }


}


