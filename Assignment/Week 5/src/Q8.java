
// question no.8 about binary search
public class Q8 { 
    // it Returns index of x if the value is presented in arr[]
    // r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int middle = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[middle] == x) 
                return middle; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[middle] > x) 
                return binarySearch(arr, l, middle - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, middle + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
  
    // to test the program 
    public static void main(String args[]) 
    { 
        Q8 ob = new Q8(); 
        int arr[] = { 11, 12, 34, 55, 66, 77, 88 }; 
        int n = arr.length; 
        int x = 77; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Number can't be found!"); 
        else
            System.out.println("Number " + x + " founded in index " + result); 
    } 
}