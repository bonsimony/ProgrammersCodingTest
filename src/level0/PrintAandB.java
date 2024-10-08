package level0;

import java.util.Scanner;

public class PrintAandB {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > a와 b 출력하기
    //
    // 문제 설명
    // 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("a ="+" "+a);
        System.out.println("b ="+" "+b);

    }
}
