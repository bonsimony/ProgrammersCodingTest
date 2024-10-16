package level0;

import java.util.Scanner;

public class PrintWithCaseChanged {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 대소문자 바꿔서 출력하기
    //
    // 문제 설명
    // 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
    // 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuffer stringBuffer = new StringBuffer();


        int i = 0;
        for(i = 0; i < a.length(); i++){

            // System.out.println(a.charAt(i));

            char ch = a.charAt(i);

            if(Character.isUpperCase(ch)){
                stringBuffer.append(Character.toLowerCase(ch));
            }

            if(Character.isLowerCase(ch)){
                stringBuffer.append(Character.toUpperCase(ch));
            }


        }

        System.out.println(stringBuffer);

    }

}
