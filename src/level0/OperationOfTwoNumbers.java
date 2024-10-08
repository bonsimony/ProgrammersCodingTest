package level0;

public class OperationOfTwoNumbers {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 두 수의 연산값 비교하기
    //
    // 문제 설명
    // 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
    //
    //12 ⊕ 3 = 123
    //3 ⊕ 12 = 312
    //양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
    //
    //단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

    public static void main(String[] args) {

        //String a = "2";
        //String b = "91";
        //int result = 0;

        //String a = "91";
        //String b = "2";
        //int result = 0;

        //int aInt = Integer.parseInt(a);
        //int bInt = Integer.parseInt(b);

        //int listOfNumbers = Integer.parseInt(a+b);
        //int multiply = 2 * aInt * bInt;

        //if(listOfNumbers > multiply) {
        //    result = listOfNumbers;
        //}else{
        //    result = multiply;
        //}

        //System.out.println(result);





        int a = 2;
        int b = 91;
        int result = 0;

        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        String listOfNumbersString = aString + bString;
        int listOfNumbersInt = Integer.parseInt(listOfNumbersString);

        //System.out.println(listOfNumbers);

        int multiply = 2 * a * b;

        if(listOfNumbersInt > multiply){
            result = listOfNumbersInt;
        }else{
            result = multiply;
        }

        System.out.println(result);


    }

}
