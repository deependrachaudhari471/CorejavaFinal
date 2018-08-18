import java.util.*;
class VectorTest{
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0;i<10;i++){
			v.add(i);
		}
		System.out.println(v+"..."+v.capacity());
		v.addElement("A");
		System.out.println(v+"..."+v.capacity());

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}