import java.util.Scanner;
class sort{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String arr[] = {"Banana", "Apple", "Carrot", "Radish", "Jack"};
int len = arr.length;
char order = input.next().charAt(0);
if (order == 'A') {
 for (int i = 0; i < len; i++) {
 for (int j = i + 1; j < arr.length; j++) {
 if (arr[i].compareTo(arr[j]) > 0) {
 String temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
 }
 }
 }
 System.out.println(arrays.toString(arr));
}
else if (order == 'D') {
 for (int i = 0; i < len; i++) {
 for (int j = i + 1; j < arr.length; j++) {
 if (arr[i].compareTo(arr[j]) < 0) {
 String temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
 }
 }
 }
 System.out.println(arrays.toString(arr));
}
}}