package level0;

public class StringMultiplication {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 곱하기
    //
    // 문제 설명
    // 문자열 my_string과 정수 k가 주어질 때,
    // my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

    public static void main(String[] args) {

        String my_string = "string";
        int k = 3;
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i< k; i++){

            //answer += (my_string);
            answer.append(my_string);

        }

        System.out.println(answer);



    }

}
