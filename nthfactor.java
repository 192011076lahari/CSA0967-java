import java.util.Scanner;
public class ak {
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
int num=input.nextInt();
int n=input.nextInt();
int a[]=new int[100];
int x=0;
for(int i=1;i<=num;i++)
{
 if(num%i==0) {
 a[x] = i;
 x++;
 }
}
System.out.println("Number of factors = "+x);
System.out.println(n+" factor of "+num+" = "+a[n-1]);
  }}
