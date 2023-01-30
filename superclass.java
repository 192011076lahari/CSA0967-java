import java.util.Scanner;
class same
{
   	int num;
   	int flt;
   	same(int num,int  flt)
	{
      		this.num = num;
      		this.flt = flt;
   	}
	public static void main(String args[])
	{
      		Scanner sc = new Scanner(System.in);
      		System.out.print("Enter integer : ");
		if(!sc.hasNextInt())
		{
			System.out.print("Invalid");
			return;
		}
      		int num = sc.nextInt();
      		System.out.print("Enter integer: ");
		if(!sc.hasNextInt())
		{
			System.out.print("Invalid");
			return;
		}
      		int flt = sc.nextInt();      
      		same obj = new same(num, flt);
      		System.out.println(obj.num);
      		System.out.println(obj.flt);
   }
}