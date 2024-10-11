package pccpPreviousExamQuestions.First;

public class PccpFirstAnswerRefactoring {

    public static void main(String[] args) {

        System.out.println(solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"}));
        System.out.println(solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev","next", "next"}));
        System.out.println(solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"}));

    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int total_len = 0;
        int pos_convert = 0;
        int op_start_convert = 0;
        int op_end_convert = 0;

        total_len = convert(video_len);
        pos_convert = convert(pos);
        op_start_convert = convert(op_start);
        op_end_convert = convert(op_end);

        if(pos_convert >= op_start_convert && pos_convert <= op_end_convert){
            pos_convert = op_end_convert;
        }

        for(int i = 0; i < commands.length; i++){
            if(commands[i].equals("next")){
                pos_convert += 10;
                if(total_len - pos_convert < 10 ) {
                    pos_convert = total_len;
                }
            }else{
                pos_convert -= 10;
                if(pos_convert < 10) pos_convert = 0;
            }

            if(pos_convert >= op_start_convert && pos_convert <= op_end_convert){
                pos_convert = op_end_convert;
            }
        }

        answer = lpad(pos_convert);

        return answer;
    }

    public static int convert(String time){

        int result = 0;

        result = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);


        return result;

    }

    public static String lpad(int pos_convert){

        String result = "";

        String minute = String.valueOf(pos_convert / 60);
        String seconds = String.valueOf(pos_convert % 60);

        if(minute.length() < 2){
            minute = "0" + minute;
        }

        if(seconds.length() < 2){
            seconds = "0" + seconds;
        }

        result = minute + ":"+ seconds;

        return result;
    }
}
