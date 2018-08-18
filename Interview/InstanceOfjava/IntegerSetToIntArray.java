import java.util.*;
class IntegerSetToIntArray{
	public static void main(String[] args) {
	     Set set = new HashSet();
	     for (int i=1;i<10 ;i++ ) {
	     	set.add(i);
	     }
	     int[] arr = new int[set.size()];
	     int j = 0;
	     for(Object s:set){
	     	if(j<set.size()){
	     	arr[j] = (int)s;
	        }
	        j++;
	     }
	     for(int a : arr){
	     	System.out.println(a+"--"+arr.length);
	     }
	}
}