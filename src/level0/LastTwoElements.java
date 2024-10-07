package level0;

public class LastTwoElements {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 마지막 두 원소
    //
    // 문제 설명
    // 정수 리스트 num_list가 주어질 때,
    // 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
    // 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {

        int[] num_list = {2, 1, 6};
        int[] result = new int[num_list.length + 1];






        for(int i=0; i<num_list.length; i++){
            result[i] = num_list[i];
        }





        //System.out.println(num_list[num_list.length-1]);    // 마지막 원소           // num_list[2] = 6
        //System.out.println(num_list[num_list.length-2]);    // 마지막 바로 앞 원소    // num_list[1] = 1

        int lastArrayValue = num_list[num_list.length-1];
        int beforeLastArrayValue = num_list[num_list.length-2];

        //System.out.println(lastArrayValue);              // 마지막 원소           // num_list[2] = 6
        //System.out.println(beforeLastArrayValue);        // 마지막 바로 앞 원소    // num_list[1] = 1

        if(lastArrayValue > beforeLastArrayValue){
            result[num_list.length] = lastArrayValue - beforeLastArrayValue;
        }else{
            result[num_list.length] = lastArrayValue*2;
        }




        System.out.println(result);




        //for(int i=0; i<result.length; i++){
        //
        //    System.out.println(result[i]);
        //
        //}

    }
}
