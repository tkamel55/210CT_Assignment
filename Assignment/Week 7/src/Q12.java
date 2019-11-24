 import java.util.Arrays;

//Q12 is about using the quick sort method 
public class Q12 {

	public static void main(String[] args) {

		int input[] = new int[] {99, 22, 3, 11};
		sort(input, 0, input.length - 1);
		
		System.out.println("After sorting: " + Arrays.toString(input));
	}

	private static void sort(int[] array, int left, int right) {

		if (left >= right) {
			return;
		}
		
		
        //breakdown each part 
		System.out.print("Partition:	" + printArray(array, left, right));
		int pindex = partition(array, left, right);
		System.out.println("\nSorted:		" + printArray(array, left, right) + "\n");

		// Sort left portion - recursive call
		sort(array, left, pindex - 1);
		
		// Sort right portion - recursive call
		sort(array, pindex, right);

	}

	
	private static int partition(int[] arr, int left, int right) {

		
		// Consider middle index as pivot
		int pivot = arr[(left + right) / 2];
		
		System.out.print(" Pivot : "+ pivot); 

		while (left <= right) {

			// find a number which is greater than pivot
			while (arr[left] < pivot) {

				left++;
			}

			// find a number which is less than pivot
			while (arr[right] > pivot) {

				right--;
			}

			/*
			 *  Swap the left and right numbers 
			 *  cause pivot left side numbers should be less than pivot and right side numbers should be greater than pivot
			 */
			if (left <= right) {

				if (left != right) {
					System.out.print(" => Swap : " + arr[left] + ", " + arr[right]);

					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
				}

				left++;
				right--;
			}

		}

		// this is partition index - actually pivot index
		return left;
	}
	
	
	

	// Utility method  organize the output well 
	private static String printArray(int[] arr, int sindex, int eindex) {

		String s = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i == sindex) s = s + " {";
			if(!s.equals("")) 	s = s + " ";
			s = s + arr[i];
			if(i == eindex) s = s + " }";
			
		}

		return s;
	}

}