import java.util.Scanner;
class interest{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int pri=input.nextInt();
int year=input.nextInt();
char age=input.next().charAt(0);
double interest=0.0;
if(age=='y')
{
 interest=(pri*year*12)/100;
 System.out.print(interest);
}
else
{
 interest=(pri*year*1)/100;
 System.out.print(interest);
}

}
}