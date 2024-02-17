package TakeUForward;

import java.util.*;

class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            n = n / 10;
            sum++;
        }
        System.out.println(sum);
        sc.close();
    }
}