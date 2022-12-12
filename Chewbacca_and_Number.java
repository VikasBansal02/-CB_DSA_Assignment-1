import java.util.*;
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        long num = scan.nextLong();
        System.out.println(ChewbaccaAndNumber(num));
    }

    private static long ChewbaccaAndNumber(long num) {
        int length = countDigit(num);
        long[] arr = new long[length];
        fillArray(arr, num);

        for (int i=0; i<arr.length; i++) {
            long value = arr[i];
            if(value >= 5) {
                if (i == 0 && value == 9) continue;
                arr[i] = 9 - value;
            }
        }
        return arrayToNum(arr);
    }

    private static long arrayToNum(long[] arr) {
        long num = 0;
        for (int i=0; i<arr.length; i++) {
            num = num*10 + arr[i];
        }
        return num;
    }

    private static void fillArray(long[] arr, long num) {
        int index = arr.length;
        while (num !=0 ) {
            long digit = num%10;
            arr[--index] = digit;
            num = num/10;
        }
    }

    private static int countDigit(long num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
