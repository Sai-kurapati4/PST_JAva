import java.util.*;
import java.lang.Math;
public class squares_number{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=1;
for(int i=0;i<n;i++){
int k=n%10;
n=n/10;
int p=n%10;
sum+=Math.pow(p,k);
}
System.out.println(sum);}
}