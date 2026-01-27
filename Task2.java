import java.util.Scanner;
public class Task2{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
System.out.println(arr[i]);
}

        int i=sc.nextInt();
if(i>=0&&i<n){
System.out.println("Element at index "+i+" is: "+arr[i]);
sc.close();
}
}
}
