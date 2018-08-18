import java.util.*;
class RetailAll{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("White");
		list.add("Green");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("yellow");
		list2.add("White");
		list2.add("pink");
		list2.add("pink2");

		System.out.println(list);
		System.out.println(list.contains("yellow"));

		System.out.println(list2);

		list2.retainAll(list);
        
        System.out.println(list);
		System.out.println(list2);

		list.addAll(list2);
		System.out.println(list.containsAll(list2));


	}
}