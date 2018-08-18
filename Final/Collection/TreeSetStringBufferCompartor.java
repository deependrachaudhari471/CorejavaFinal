import java.util.*;
class TreeSetStringBufferCompartor{
	public static void main(String[] args) {
		TreeSet list = new TreeSet(new orderBy());
		list.add(new StringBuffer("Naman"));
		list.add(new StringBuffer("Deependra"));
		list.add(new StringBuffer("Aaman"));
		for(Object o : list){
			System.out.println(o);
		}

	}
}
class orderBy implements Comparator{
    public int compare(Object o1,Object o2){
    	String e1 = o1.toString(); //(String)o1 gives an type Cast Error
    	String e2 = o2.toString();
    	return e1.compareTo(e2);
        
    }
}
