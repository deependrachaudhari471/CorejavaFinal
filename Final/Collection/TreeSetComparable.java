import java.util.*;
class TreeSetComparable{
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add(new String("Deependra"));
		ts.add(new String("Naman"));
		ts.add(new String("Aman"));
		for(Object o : ts){
			System.out.println(o);
		}

	}
}
