// whether string is palindrome or not.
import java.util.*;

class second {
    static boolean isPalindrom(String str){
        String rev="";
        boolean ans=false;
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        if(str.equals(rev)){
            ans=true;
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        if(isPalindrom(str)){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        }
    }