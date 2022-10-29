// a prime number between range (range should be entered by user)
import java.io.*;
import java.util.Scanner;
class ten{
   public static int isprime(int n)
   {
      for (int i = 2; i < n; i++){
         if(n%i == 0){
            return -1;
         }
      }
      return 1;
   }
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("======================================");

    System.out.print("Enter Min Range Number : ");  
    int a=sc.nextInt();
    System.out.println("======================================");
    
    System.out.print("Enter Max Range Number : ");
    int b=sc.nextInt();
    System.out.println("======================================");
    System.out.print("Prime Number's is : ");
    System.out.println();
      for (int i=a; i <= b; i++)
      {
         if(isprime(i) == 1)
         {
            System.out.print(i+" ");
         }
      }
      System.out.println();
      System.out.println("======================================");
   }
}
