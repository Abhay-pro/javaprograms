package basicsprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }

        }
        int sum=0;
        for(int num: list) {
            sum+=num;
        }
        if(sum==n)
        System.out.println("true");
        else
            System.out.println("false");
    }
}