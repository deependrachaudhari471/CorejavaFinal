import java.util.*;
class TreeMapSort{
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComaratator());
		tm.put("ONE","Hello1");
		tm.put("TWO","Hello2");
		tm.put("THREE","Hello3");
		tm.put("FOUR","Hello4");
		tm.put("FIVE","Hello5");

		Set s = tm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey()+"..."+pair.getValue());
		}
	}

}
class MyComaratator implements Comparator{
   public int compare(Object ob,Object ob1){
   	String s1 = (String)ob;
   	String s2 = (String)ob1;
   	return s2.compareTo(s1);
   }
}