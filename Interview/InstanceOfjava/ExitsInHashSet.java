import java.util.*;
class ExitsInHashSet{
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);

		Object[] arr = s.toArray();

		Iterator it  = s.iterator();
		while(it.hasNext()){
			if((int)it.next() == 3){
				System.out.println("Contains Value");
			}
		}
		for(Object a : arr){
			System.out.println(a);
		}

		Integer[] irr = s.toArray(new Integer[s.size()]);
		for(Integer k :irr){
		System.out.println(k);	
		}



	}
}