package level0;

public class CheckSuffix {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 접미사인지 확인하기
    //
    // 문제 설명
    // 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
    // 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
    // 문자열 my_string과 is_suffix가 주어질 때,
    // is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

    public static void main(String[] args) {

        String my_string;
        String is_suffix;
        int result;

        my_string = "banana";

        is_suffix = "ana";
        //is_suffix = "nan";
        //is_suffix = "wxyz";
        //is_suffix = "abanana";

        int my_string_length = my_string.length();
        int is_suffix_length = is_suffix.length();

        if(is_suffix_length <= my_string_length){

            String my_string_suffix = my_string.substring(my_string_length - is_suffix_length);
            String is_suffix_string_string = is_suffix.substring(0,is_suffix_length);

            if(my_string_suffix.equals(is_suffix_string_string)){
                result = 1;
            }
            else{
                result = 0;
            }


        }
        else{
            result = 0;
        }

        System.out.println(result);
    }

}
