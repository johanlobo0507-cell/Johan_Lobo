package DSA_pretestCode;

public class Q4 {

public static void main (String[] arg) {
		
		int []arr = {23, 67, 4, 89, 31, 55, 12};
		int target = 89;
		int i;
		
		for (i=0;i<arr.length;i++) {
			System.out.println("Step: "+(i+1));
			System.out.println("Checking: "+arr[i]+" = "+target);
			if (arr[i] == target) {
				break;
			}
		}
		System.out.println("Target found at index "+ i);
	}

}
