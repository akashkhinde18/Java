//greater number between three
import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number n1");
        n1=sc.nextInt();
        System.out.println("Enter the number n2");
        n2=sc.nextInt();
        System.out.println("Enter the number n3");
        n3=sc.nextInt();
        if(n1>n3){
            if(n1>n2)
            System.out.println("n1 is greater number");
            else
            System.out.println("n2 is greater number");
        }
        else{
            if(n2>n3)
            System.out.println("n2 is greater number");
            else
            System.out.println("n3 is greater");
        }
    }
}
