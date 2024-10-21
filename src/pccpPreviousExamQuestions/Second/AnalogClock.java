package pccpPreviousExamQuestions.Second;

public class AnalogClock {


    // 문제명
    // 코딩테스트 연습 > PCCP 기출문제 > [PCCP 기출문제] 3번 / 아날로그 시계
    // 문제설명
    // 시침, 분침, 초침이 있는 아날로그시계가 있습니다. 시계의 시침은 12시간마다, 분침은 60분마다, 초침은 60초마다 시계를 한 바퀴 돕니다.
    // 따라서 시침, 분침, 초침이 움직이는 속도는 일정하며 각각 다릅니다.
    // 이 시계에는 초침이 시침/분침과 겹칠 때마다 알람이 울리는 기능이 있습니다.
    // 당신은 특정 시간 동안 알람이 울린 횟수를 알고 싶습니다.

    public static void main(String[] args) {

        int answer = 0;

        int h1 = 0;
        int m1 = 5;
        int s1 = 30;
        int h2 = 0;
        int m2 = 7;
        int s2 = 0;

        int timeHour = h1;
        int timeMinute = m1;
        int timeSeconds = s1;

        int alramHour = h2;
        int alramMinute = m2;
        int alramSeconds = s2;

        int convertToSeconds = convertTimeToSeconds(timeHour, timeMinute, timeSeconds);
        int convertToAlramSeconds = convertTimeToSeconds(alramHour, alramMinute, alramSeconds);

        //System.out.println("===================================================================");
        //System.out.println("convertToSeconds >>" + convertToSeconds);
        //System.out.println("convertToAlramSeconds >>" + convertToAlramSeconds);
        //System.out.println("===================================================================");

        int preHourPosition = 0;
        int preMinutePosition = 0;
        int preSecondsPosition = 0;
        int count = 0;

        for(int i=convertToSeconds; convertToSeconds < convertToAlramSeconds + 1; convertToSeconds++){

            //System.out.println(convertToSeconds);

            int hourAngle = convertSecondsToHourAngle(convertToSeconds);
            int minuteAngle = convertSecondsToMinuteAngle(convertToSeconds);
            int secondsAngle = convertSecondsToSecondsAngle(convertToSeconds);

            //System.out.println("=================================================================");
            //System.out.println("hourAngle >>" + hourAngle);
            //System.out.println("minuteAngle >>" + minuteAngle);
            //System.out.println("secondsAngle >>" + secondsAngle);
            //System.out.println("=================================================================");

            if(hourAngle < secondsAngle && preHourPosition > preSecondsPosition) {
                count+=1;
            }else if(hourAngle == secondsAngle){
                count+=1;
            }else if(preHourPosition > preSecondsPosition && hourAngle ==0){
                count+=1;
            }

            if(minuteAngle < secondsAngle && preMinutePosition > preSecondsPosition) {
                count+=1;
            }else if(minuteAngle == secondsAngle){
                count+=1;
            }else if(preMinutePosition > preSecondsPosition && hourAngle ==0){
                count+=1;
            }

            if(minuteAngle == secondsAngle && hourAngle == secondsAngle){
                count-=1;
            }

            preHourPosition = hourAngle;
            preMinutePosition = minuteAngle;
            preSecondsPosition = secondsAngle;

        }



        answer = count;

        System.out.println("########################################################");
        System.out.println(answer);
        System.out.println("########################################################");



    }





    public static int convertTimeToSeconds(int hour, int minute, int seconds){

        // int convertToSeconds = (hour * 60 * 60) + (minute * 60) + seconds;

        return (hour * 60 * 60) + (minute * 60) + seconds;
    }

    public static int convertSecondsToHourAngle(int sumSeconds){

        //int hourAngle = (sumSeconds / 120) % 360;

        return (sumSeconds / 120) % 360;
    }

    public static int convertSecondsToMinuteAngle(int sumSeconds){

        // int minuteAngle = (sumSeconds / 10) % 360;

        return (sumSeconds / 10) % 360;
    }

    public static int convertSecondsToSecondsAngle(int sumSeconds){

        // int secondsAngle = (sumSeconds % 60) * 6;

        return (sumSeconds % 60) * 6;
    }








}
