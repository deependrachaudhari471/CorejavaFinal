import java.util.*;
class BooleanArrayInitialised{
	public static void main(String[] args) {
	     Boolean[] arr = new Boolean[4];
	     for (int i=0;i<arr.length ;i++ ) {
	      System.out.println(arr[i]); 	
	     }
         Arrays.fill(arr,Boolean.FALSE);
		 for (int i=0;i<arr.length ;i++ ) {
	      System.out.println(arr[i]); 	
	     }
	      Arrays.fill(arr,Boolean.TRUE);
		 for (int i=0;i<arr.length ;i++ ) {
	      System.out.println(arr[i]); 	
	     }
       
	}
}