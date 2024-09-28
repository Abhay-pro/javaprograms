package basicsprograms;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n,remainder=0,ch;
        System.out.println("enter number to check:");
        n=sc.nextInt();
        ch=n;
        while(n>0){
            remainder=(remainder*10)+(n%10);
            n=n/10;

        }
        if(remainder==ch)
            System.out.println("palindrome");
        else
            System.out.println("not");
    }


}
