import java.util.*;
class SubList{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("White");
		list.add("Green");
		list.add("pink");
		list.add("pink2");
        
        ArrayList<String> list2 = new ArrayList<String>(list.subList(1,4));
		
        System.out.println(list);
		System.out.println(list2);

		
	}
}