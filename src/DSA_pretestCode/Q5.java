package DSA_pretestCode;

public class Q5 {

public static void main (String[] arg) {
		
		int []arr = {4, 12, 23, 31, 55, 67, 89};
		int target = 12;
		
		int low = 0,high = arr.length-1;
		int mid = (low+high)/2;
		Boolean found = false;
		int count = 0;
		
		while(!found) {
			mid = (low+high)/2;
			count++;
			System.out.println("Step: "+count+" Low: "+low+" High: "+high+" Middle: "+mid+" Value: "+arr[mid]);
			if(arr[mid] == target) {
				found = true;
			}
			else if(arr[mid]<target) {
				low = mid+1;
			}
			else if(arr[mid]>target) {
				high = mid-1;
			}
			else {
				break;
			}
		}
		
		if (found) {
		System.out.println("Target found at index "+ mid +" in "+count+" steps.");
		}
		else {
			System.out.println("Number not found.");
		}
	}
}
