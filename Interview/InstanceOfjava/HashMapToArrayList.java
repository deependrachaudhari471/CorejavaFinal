import java.util.*;
import java.util.Map.Entry;
class HashMapToArrayList{
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"One");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        Set<Entry<Integer,String>> s = map.entrySet();
        ArrayList<Entry<Integer,String>> list = new ArrayList<Entry<Integer,String>>(s);
        System.out.println(list);

	}
}