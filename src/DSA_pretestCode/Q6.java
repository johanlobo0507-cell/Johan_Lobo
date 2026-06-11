package DSA_pretestCode;

public class Q6 {

public static void main(String[] arg) {
		
		int arr[] = {64, 25, 12, 22, 11};
		int n = arr.length;
		
		
		for (int pass =0; pass<n-1;pass++) {
			
			System.out.println("Pass: "+pass+1);
			
			for (int j=0;j<n-1-pass;j++) {
				
				System.out.println("Step: "+(j+1)+"\n");
				printArray(arr);
				
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println("Swapping "+arr[j]+" & "+arr[j+1]);
				}
				else {
					System.out.println("No swapping.");
				}
				
				printArray(arr);
			}
			
			System.out.print("Sorted Array: ");
			printArray(arr);
		}

	}
	
	static void printArray(int []arr) {
		
		for (int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n");
	}
}
