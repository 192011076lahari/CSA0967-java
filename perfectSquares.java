import java.util.Scanner;
import java.lang.Math;
class perfectSqNum
{
 public static void main(String args[])
 {
 Scanner input=new Scanner(System.in);
 double n=input.nextInt();
 double sqrt=Math.pow(n,0.5);
 double sq=Math.sqrt(n);
 System.out.println(sqrt+","+"-"+sqrt);
 }
}