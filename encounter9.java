import java.util.*;
class encouneter{
  public static void main(String[] args){
int i=0,j=0;
int n=0;
int s1=0,s2=0;
int possum=0,negsum=0;
while(n!=-1)
{
 n=input.nextInt();
 if(n==-1)
 break;
 if(n>0)
 {
 i++;
 s1=s1+n;
 }
 else
 {
 j++;
 s2=s2+n;
 }
}
System.out.println(i);
System.out.println(j);
double pos=(s1/i);
double neg=s2/j;
System.out.println("The average of positive: "+pos);
System.out.println("The average of negative: "+neg);
  }
}
