package pccpPreviousExamQuestions.Second;

public class AnalogClockAnswer {

    // 문제명
    // 코딩테스트 연습 > PCCP 기출문제 > [PCCP 기출문제] 3번 / 아날로그 시계
    //
    // 문제 설명
    // 시침, 분침, 초침이 있는 아날로그시계가 있습니다. 시계의 시침은 12시간마다, 분침은 60분마다, 초침은 60초마다 시계를 한 바퀴 돕니다.
    // 따라서 시침, 분침, 초침이 움직이는 속도는 일정하며 각각 다릅니다. 이 시계에는 초침이 시침/분침과 겹칠 때마다 알람이 울리는 기능이 있습니다.
    // 당신은 특정 시간 동안 알람이 울린 횟수를 알고 싶습니다.
    // 다음은 0시 5분 30초부터 0시 7분 0초까지 알람이 울린 횟수를 세는 예시입니다.

    public static void main(String[] args) {

        System.out.println(solution(0,5,30,0,7,0));
        System.out.println(solution(12,0,0,12,0,30));
        System.out.println(solution(0,6,1,0,6,6));
        System.out.println(solution(11,59,30,12,0,0));
        System.out.println(solution(11,58,59,11,59,0));
        System.out.println(solution(1,5,5,1,5,6));
        System.out.println(solution(0,0,0,23,59,59));

    }

    public static int solution(int h1, int m1, int s1, int h2, int m2, int s2) {

        int result = 0;

        // 각 벨 카운트를 구하여 차이를 구한다.
        int convertTimeToSecond = (h1 * 60 * 60) + (m1 * 60) + s1;
        int convertAlramToSecond = (h2 * 60 * 60) + (m2 * 60) + s2;

        result = alarmCount(convertAlramToSecond) - alarmCount(convertTimeToSecond);

        // 시작 시간을 제외하였으므로 시작 시간이 겹치는지 확인한다.
        if (equals(h1, m1, s1)) {
            return result + 1;
        }else{
            return result;
        }

    }

    public static int alarmCount(int second) {

        int result = 0;

        /*
        시침은 1분에 1번씩 겹친다.
        1시간이 지나면 시침의 각도가 30도 움직이고 그만큼 겹치는 시간이 딜레이된다.
        실제 시침과 초침이 겹치는 시간은 1분보다 길며 12시간동안 719번 겹치게 된다.
        */
        int hourAlarmCount = (int) (second * 719 / 43200.0);

        /*
        분침은 1분에 1번씩 겹친다.
        1분이 지나면 6도 움직이고 그만큼 겹치는 시간이 딜레이된다.
        실제 분침과 초침이 겹치는 시간은 1분보다 길며 1시간동안 59번 겹치게 된다.
        */
        int minuteAlaramCount = (int) (second * 59 / 3600.0);

        // 12시에는 정확히 시침 분침 초침이 일치한다.
        int onTime = 0;
        if (second >= 12 * 3600) {
            onTime++;
        }

        result = hourAlarmCount + minuteAlaramCount - onTime;

        // 0시 0분 0초의 값을 추가하지 않아 마지막 결과에 추가해준다.
        return 1 + result;
    }

    public static boolean equals(int hour, int minute, int second) {

        boolean result = false;

        double hourAngle = (hour * 30 + minute * 0.5 + second * 0.5 / 60) % 360;
        double minuteAngle = minute * 6 + second * 0.1;
        double secondAngle = second * 6;

        result = hourAngle == secondAngle || minuteAngle == secondAngle;

        return result;
    }

}





