import java.util.*;
class nth{
  public static void main(System.in){

Scanner input=new Scanner(System.in);
int n=input.nextInt();
int sum=0,temp=0;
for(int j=2;j<=1000;j++)
{
 if(n>temp)
 sum=1;
 for(int i=2;i<j;i++)
 {
 if(j%i==0)
 sum=sum+i;
 }
 if(sum==j)
 {
 System.out.print(j+" ");
 temp=temp+1;
 }
}
