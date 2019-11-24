
import java.util.Arrays;

//q11 about sorting 
public class Q11
{
	// using the merge sorting method 
   public static void merge(Integer[] a, 
                            int iLeft, int iMiddle, int iRight, 
                            Integer[] tmp)
   {
      int i, j, k;

      i = iLeft;
      j = iMiddle;
      k = iLeft;

      while ( i < iMiddle || j < iRight )
      {
         if ( i < iMiddle && j < iRight )
         {  // Both array have elements
            if ( a[i] < a[j] )
               tmp[k++] = a[i++];
            else
               tmp[k++] = a[j++];
         }
         else if ( i == iMiddle )
            tmp[k++] = a[j++];     // a is empty
         else if ( j == iRight )
            tmp[k++] = a[i++];     // b is empty
      }
   }

   public static void sort(Integer[] a, Integer[] tmp)
   {
      int width;

      for ( width = 1; width < a.length; width = 2*width )
      {
         // Combine sections of array a of width "width"
         int i;

         for ( i = 0; i < a.length; i = i + 2*width )
         {
            int left, middle, right;

	    left = i;
	    middle = i + width;
	    right  = i + 2*width;

            merge( a, left, middle, right, tmp );

         }

        
	 //   Copy tmp[ ] back to a[ ] for next iteration
	
         for ( i = 0; i < a.length; i++ )
            a[i] = tmp[i];

       	 System.out.println("Steps: " + Arrays.toString(a) );
      }
   }
   // run the program
   public static void main( String[] args )
   {
      Integer[] x = {99, 22, 11,3} ;
      Integer[] help = new Integer[x.length];

      System.out.println("Before sorting:  " + Arrays.toString(x) );
      //for spacing 
      System.out.println("");

      Q11.sort( x, help );  // Merge sort

      System.out.println("\nAfter sorting:   " + Arrays.toString(x) );
   }
}