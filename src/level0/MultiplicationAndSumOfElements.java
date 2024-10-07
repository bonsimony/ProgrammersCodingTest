package level0;

public class MultiplicationAndSumOfElements {

    public static void main(String[] args) {

        // 문제명
        // 코딩테스트 연습 > 코딩 기초 트레이닝 > 원소들의 곱과 합
        //
        // 문제 설명
        // 정수가 담긴 리스트 num_list가 주어질 때,
        // 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

        int[] num_list = {3,4,5,2,1};

        int multiply = 1;
        int sum = 0;
        int result = 0;

        for(int i=0; i<num_list.length; i++){
            multiply *= num_list[i];
            sum += num_list[i];
        }

        //System.out.println("multiply >>" + multiply);
        //System.out.println("sum >>" + sum);
        //System.out.println("sum * sum >>" + sum * sum);

        //if(multiply < sum * sum){
        //    result = 1;
        //}else{
        //    result = 0;
        //}

        result = (multiply < sum * sum ) ? 1 : 0;

        System.out.println(result);

    }
}
