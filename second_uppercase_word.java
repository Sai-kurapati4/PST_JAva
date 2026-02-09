import java.util.*;
public class second_uppercase_word{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();String[] arr=n.split(" ");
if(arr.length<2){
System.out.println("LESS");}
else{
String k=arr[1].toUpperCase();
System.out.println(k);
}}}

