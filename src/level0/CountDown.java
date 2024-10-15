package level0;

public class CountDown {

    // 문제명
    // 코딩테스트 연습 > 코딩 기초 트레이닝 > 카운트 다운
    //
    // 문제 설명
    // 정수 start_num와 end_num가 주어질 때,
    // start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {

        CountDown countDown = new CountDown();

        int[] result = countDown.solution(10,3);

        //for(int i=0; i<result.length; i++){
        //    System.out.println(result[i]);
        //}

        for(int i : result){
            System.out.println(i);
        }

    }



    public int[] solution(int start_num, int end_num) {
        //int[] answer = {};
        int [] answer = new int[start_num - end_num + 1];

        for(int i=0; i< answer.length; i++){

            answer[i] = start_num--;

        }


        return answer;
    }

}
