package level0;

public class CreateStringByConcatenationLetters {

    public static void main(String[] args) {

        // 문제명
        // 코딩테스트 연습 > 코딩 기초 트레이닝 > 글자 이어 붙여 문자열 만들기
        //
        // 문제 설명
        // 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
        // my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을
        // 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.



        //String my_string = "cvsgiorszzzmrpaqpe";
        String my_string = "zpiaz";

        //int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        int[] index_list = {1, 2, 0, 0, 3};



        // System.out.println(index_list.length);



        String result = "";

        for(int i=0; i<index_list.length; i++){

            result += my_string.charAt(index_list[i]);

        }

        System.out.println(result);

    }

}
