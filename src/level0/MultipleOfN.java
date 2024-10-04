package level0;

public class MultipleOfN {

    public static void main(String[] args) {

        // 문제명
        // 코딩테스트 연습 > 코딩 기초 트레이닝 > n의 배수
        //
        // 문제 설명
        // 정수 num과 n이 매개 변수로 주어질 때,
        // num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

        int num;
        int n;
        int result;

        num = 98;
        n = 2;

        if (num % n == 0) {

            result = 1;

        }
        else{
            result = 0;

        }

        System.out.println(result);



    }
}
