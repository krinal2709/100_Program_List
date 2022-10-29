//find a total odd and total even digit of a given number

import java.util.*;
class eight {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("====================================");
  System.out.print("Enter The first Number: ");
  int a=sc.nextInt();
  System.out.println();
  System.out.print("Enter The second Number: ");
  int b=sc.nextInt();
  System.out.println("====================================");
        int odd=0;
        int even=0;
        System.out.println();
        for(int i=a; i<=b; i++){
            if(i%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
        }
        System.out.println("====================================");
        System.out.println("Total ODD Number is  :  "+odd);
        System.out.println();
        System.out.println("Total EVEN Number is :  "+even);
        System.out.println("====================================");
    }
}
