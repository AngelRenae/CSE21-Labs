package lab;
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		int value = 0;
		int j = 1;
		
		for(int i = 0; i < arr.length; i++) { // array value i being observed
			value = 0;
			for(j = i + 1 ; j < arr.length; j++) {	// comparing all array values beyond it (j) to i
				if(arr[j] == arr[i]) {				// if there is duplicate value, add one to value
					value++;
				}
				/**System.out.print("j" + j + "i" + i);
				System.out.println(" value w j: " + value); */
			}
			
			switch(value) {
			case 0:
				System.out.println("There are no duplicates with value " + arr[i] + " beyond index " + i);
				break;

			case 1:
				System.out.println("There is only 1 more occurrence of value " + arr[i] + " starting at index " + i);

			default:
				System.out.println("There are " + value + " more occurrences of value " + arr[i] + " starting at index " + i);
			} 
		}

	}

}
