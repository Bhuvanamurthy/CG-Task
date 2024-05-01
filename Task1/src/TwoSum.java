import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the contents of the array: ");
		for(int i=0;i<=arr.length-1;i++) {		
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter the target sum ");
		int target=scan.nextInt();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("["+i+","+j+"]");
				}
			}
			
		}		
	}
}



