//check whether the number is even or odd
import java.util.Scanner;

public class NestedIfElse1 {
    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n1");
        n1=sc.nextInt();
        if( n1 == 0 || n1 == 1){
           if (n1==0) {
                    System.out.println(n1+" is NULL");
            }
            else 
            System.out.println(n1+" is 1");
        }
        else{
            
             if (n1%2==0) {
                System.out.println("The "+n1+" is Even");
            }else
            System.out.println(n1+" is odd number");
        }
    }
}
