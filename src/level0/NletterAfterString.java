package level0;

public class NletterAfterString {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열의 뒤의 n글자
    //
    // 문제 설명
    // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
    // my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

    public static void main(String[] args) {

        String my_string = "ProgrammerS123";
        int n = 11;

        NletterAfterString nLetterAfterString = new NletterAfterString();
        String result = nLetterAfterString.solution(my_string, n);

        System.out.println(result);

    }





    String solution(String my_string, int n){

        return my_string.substring(my_string.length()-n);
    }



}
