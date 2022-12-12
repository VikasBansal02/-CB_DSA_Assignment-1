import java.util.*;

public class Main {

    public static int stringToInt(String str){
        if (str.length() == 1)
            return (str.charAt(0) - 48);

        double y = stringToInt(str.substring(1));

        double x = str.charAt(0) - 48;

        x = x * Math.pow(10, str.length() - 1) + y;
        return (int)(x);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(stringToInt(str));
    }
}
