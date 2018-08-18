import java.util.*;
class ArrayListReverse{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for (int i = 1; i<11;i++ ) {
			list.add(i);
		}
		System.out.println(list);
        Object[] arr = new Object[list.size()];
        arr = list.toArray(arr);
        for(Object arr1 : arr){
        	System.out.println(arr1);
        }
        List list2 =Arrays.asList(arr);
        System.out.println(list2);
        list.clear();
        for(int i = (arr.length);i>=0;i--){
           list.add(i);
        }
        System.out.println(list);

	}
}