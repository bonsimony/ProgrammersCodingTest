package level2;

public class CorrectParentheses {

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
