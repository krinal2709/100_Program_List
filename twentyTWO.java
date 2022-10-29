import java.util.*;
class twentyTWO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Range You Want : ");
        int a=sc.nextInt();
        System.out.println();
        int n=1;
        char b = 'A';
        for(int c=1; c<=a; c++){
        if (c%2!=0) {
            for(int i=1; i<=a-c; i++){
                System.out.print(" ");
            }
            for(int i=1; i<=c; i++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        else{

                for(int i=1; i<=a-c; i++){
                    System.out.print(" ");
                }
                for(int i=1; i<=c; i++){
                    System.out.print(b+" ");
                    b++;   
                }
                System.out.println();
        }
    }
        }
        
    }
    
