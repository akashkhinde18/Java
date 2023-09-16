import java.util.Scanner;

public class ArrAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the Array :");
			int n=sc.nextInt();
			int sum=0;
			int arr[]=new int[n];
			System.out.println("Enter elements in array:");
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			System.out.println("Sum of Array Elements:"+sum);
	}

}
