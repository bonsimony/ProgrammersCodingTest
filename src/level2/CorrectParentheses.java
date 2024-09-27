package level2;

public class CorrectParentheses {

//    문제명
//    코딩테스트연습 > 스택/큐 > 올바른 괄호
//    문제 설명
//    괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
//
//    - "()()" 또는 "(())()" 는 올바른 괄호입니다.
//    - ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
//    - '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
//
//    제한사항
//    - 문자열 s의 길이 : 100,000 이하의 자연수
//    - 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

    public static void main(String[] args) {

        //String s = "()()";
        //String s = "(())()";
        //String s = ")()(";
        String s = "(()(";

        solution(s);

        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        //boolean answer = true;

        int leftParenthesesCount;
        int rightParenthesesCount;
        int i;
        char leftParentheses;
        char rightParentheses;

        leftParenthesesCount = 0;
        rightParenthesesCount = 0;

        leftParentheses = '(';
        rightParentheses = ')';

        // 갯수
        // ()()     // ( -> 2 // ) -> 2
        // (())()   // ( -> 3 // ) -> 3
        // )()(     // ( -> 2 // ) -> 2
        // (()(     // ( -> 3 // ) -> 1

        for(i =0; i < s.length(); i++){

            if(s.charAt(i) == leftParentheses){

                leftParenthesesCount ++;
            }

            if(s.charAt(i) == rightParentheses){

                rightParenthesesCount ++;
            }

            if(leftParenthesesCount < rightParenthesesCount){

                //answer = false;
                //return answer;

                return false;
            }

        }


//        if(leftParenthesesCount == rightParenthesesCount){
//
//                //answer = true;
//                //return answer;
//
//                return true;
//            }else {
//
//                //answer = false;
//                //return answer;
//
//                return false;
//        }

        return leftParenthesesCount == rightParenthesesCount;



    }

}
