import java.util.Scanner;
 
class part1 extends Thread {
    public synchronized void run()
    {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
 
       
       
  }
}
class Main {
    public static void main(String args[])
    {
        part1 t1 = new part1();
        Thread m1 = new Thread(t1);
        Scanner sc = new Scanner(System.in);
        m1.start();
        
        
       
    }
}