/*Print a following pattern 
1
1 2
1 2 3
1 2 3 4
*/
import java.util.*;

 public class six{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :  ");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1; i<=n; i++ ){

            for(int j=1; j<=i; j++){

                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
}
