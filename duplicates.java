Scanner input=new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n=input.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
 System.out.print("Enter element: ");
 a[i]=input.nextInt();
}
for(int i=0;i<n;i++)
{
 for(int j=i+1;j<n;j++)
 {
 if(a[i]==a[j])
 {
 for(int k=j;k<n-1;k++)
 {
 a[k]=a[k+1];
 }
 j--;
 n--;
 }
 }
}
for(int i=0;i<n;i++)
{
 System.out.print(a[i]+" ");
}
