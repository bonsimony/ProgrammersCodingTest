package level0.suffix;

public class StartsWith {

    public static void main(String[] args) {

       String str;
       str = "startswith";

       StartsWith startsWith = new StartsWith();
       boolean result = startsWith.Result(str);

       System.out.println(result);

    }

    boolean Result(String str){

        boolean result = str.startsWith("starts"); // starts -> true
                                                   // with -> false

        return result;
    }
}
