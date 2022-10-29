//Factorial of a given number Using iteration.
/*
import java.util.*;
class four {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Number Of factorial You Want : ");
    int n=sc.nextInt();
    int fact=n;
    System.out.println();
   
    for(int i=n-1; i>0; i--){
        fact=fact*i;
    }
    System.out.println("Factorial of the Number is "+ fact);
}
    
}
 */

//Factorial of a given number Using recursive
import java.util.*;
class four {    
        static int factorial(int n){    
         if (n == 0)    
           return 1;    
         else    
           return(n * factorial(n-1));    
        }    
        public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);
         int i,fact=1;  
         System.out.print("Enter The number : ");
         int number=sc.nextInt();  
         System.out.println();
         fact = factorial(number);   
         System.out.println("Factorial of "+number+" is: "+fact);    
        }  
       }  
