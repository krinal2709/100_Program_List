// whether string is palindrome or not.
import java.util.*;
class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String :  ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        String rev=""; //empty rev string
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
       
        if (str.equals(rev)) {
            System.out.println("String is Palindrom");
        }
        
        else{
            System.out.println("String is Not Palindrom");
        }
    }
}