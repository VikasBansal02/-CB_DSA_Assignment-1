 // This program finds the nth Ugly Number using dynamic programming approach.

import java.util.*;

public class Main {
public static void main(String args[]) {
    Scanner vikassaxena = new Scanner(System.in);
    int tvikas = vikassaxena.nextInt();
    for(int x = 0; x < tvikas; x++) {
        int nvikas = vikassaxena.nextInt();
        long dpvikas[] = new long[10001];

        dpvikas[1] = 1;
        int i2vikas = 1;
        int i3vikas = 1;
        int i5vikas = 1;

        for (int y = 2; y <= 10000; y++) {
            long next2vikas = dpvikas[i2vikas] * 2;
            long next3vikas = dpvikas[i3vikas] * 3;
            long next5vikas = dpvikas[i5vikas] * 5;

            dpvikas[y] = Math.min(next2vikas, Math.min(next3vikas, next5vikas));

            if (dpvikas[y] == next2vikas) {
                i2vikas++;
            }
            if (dpvikas[y] == next3vikas) {
                i3vikas++;
            }
            if (dpvikas[y] == next5vikas) {
                i5vikas++;
            }
        }
        System.out.println(dpvikas[nvikas]);
    }
}
}
