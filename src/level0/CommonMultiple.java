package level0;

public class CommonMultiple {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 공배수
    //
    // 문제 설명
    // 정수 number와 n, m이 주어집니다.
    // number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {

        int number = 0;
        int n = 0;
        int m = 0;
        int result = 0;

        //number = 60;
        //n = 2;
        //m = 3;

        number = 55;
        n = 5;
        m = 10;

        if((number % n) == 0 && (number % m) == 0){
            result = 1;
        }else{
            result = 0;
        }

        System.out.println(result);

    }
}
