//whether a number is Odd or Even without using a % operator
import java.util.*;
class nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num=sc.nextInt();
        if ((num/2)*2==num) {
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given Number is Odd");
        }
    }
}
