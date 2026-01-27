import java.util.*;
public class task3 {
    public static void main(String args[]) {
        int[] arr = {1,3,5,6,8,9,11,14,16,18};
        int target =5;
        int n = arr.length;
        int l=0,r=n-1;
        while(l<=r){
      int mid=(l+r)/2;
             if(target<arr[mid]){
                 r=mid-1;
             }
             else if(target>arr[mid]){
                 l=mid+1;
             }
             else{
                 System.out.println("Element found at index: "+mid);
                 return;}
        }

       System.out.println("Element not found");
    }
}