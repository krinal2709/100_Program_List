//Factor of a given number Using recursive

/* ========================================================== 
import java.util.*;
class third {
    static void factor(int x,int i){
        if (i<=x) {
            if(x%i==0){
                System.out.println(i+" ");
                }
                factor(x,i+1);
        }        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int y=sc.nextInt();
        System.out.println(" factors of the number is : ");
            factor(y,1);    
}
}
============================================================*/

//Factor of a given number Using iteration
import java.util.*;
public class third {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Number : ");
    int a=sc.nextInt();
    System.out.println();
    System.out.println("The Factor's Of the number is  ");
    for(int i=1; i<=a; i++){
        if (a%i==0) {
            System.out.println(i);
        }
    }
}

    
}

