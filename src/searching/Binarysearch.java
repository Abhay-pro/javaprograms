package searching;
import java.util.*;
public class Binarysearch {
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

          int left=0;
          int right=arr.length-1;
           int flag=-1;
          while(left<=right){
          int mid=left+(right-left)/2;
          if(arr[mid]==key){
              flag=mid;
              break;
          } else if (arr[mid]<key) {
              left=mid+1;
          }
            else if(arr[mid]>key){
                right=mid-1;
          }
          }
        if (flag==-1){
            System.out.println("element not present");
        }
        else
            System.out.println("element present at:"+flag);

    }
}