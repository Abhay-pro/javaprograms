package searching;
import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter your element to find:");
        int key=sc.nextInt();
        int flag=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=i+1;
                break;
            }
        }
        if(flag==-1)
            System.out.println("element is not present");
        else
            System.out.println("element present at:"+flag);
    }
}