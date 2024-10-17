package pccpPreviousExamQuestions.Second;

public class AnalogClock {

    public static void main(String[] args) {

        System.out.println(solution(0,5,30,0,7,0));
    }

    public static int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = 0;

        int hour = h1;
        int minute = m1;
        int seconds = s1;

        int secondAnswer = 0;
        int minuteAnswer = 0;

        while(true){

            /*
            *  초를 센다
            * */
            ++seconds;

            /*
             * 60초가 되면 초는 0으로 초기화한다.
             * */
            if (seconds == 60) {
                seconds = 0;
            }

            //System.out.println("seconds >>" + seconds);

            /*
            * 초가 알람 초와 같을 경우
            * */
            if(seconds == s2){

                if(s2 != 0){ /* 알람 초가 0인 아닌 경우 */
                    secondAnswer += 1;
                }



            }

            /**********************************************************************************************************/

            /*
             *  분을 센다
             * */
            ++minute;

            /*
             * 60초가 되면 분은 0으로 초기화한다.
             * */
            if (minute == 60) {
                minute = 0;
            }

            /*
             * 분이 알람 분과 같을 경우
             * */
            if(minute == m2){

                if(m2 != 0){ /* 알람 초가 0인 아닌 경우 */
                    minuteAnswer += 1;

                }

            }


            


        } /* while문 끝*/


    }

    public static int convertHourToSeconds(int time){

        int hourToSeconds = (time * 60 * 60);

        return hourToSeconds;
    }

    public static int convertMinuteToSeconds(int time){

        int MinuteToSeconds = (time * 60 * 60);

        return MinuteToSeconds;
    }


}
