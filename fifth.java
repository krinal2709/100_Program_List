import java.util.*;
class fifth {
    public static void main(String[] args) {
        int sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num=sc.nextInt();
        for(sum=0; num!=0; num=num/10){
            sum=sum+(num%10);
     }
        System.out.println(" Sum of Digit of the number Is "+sum);
    }
}
