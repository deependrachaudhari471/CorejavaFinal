import java.util.*;
class TreeSetNull{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(null);   //Null Possible If It Should in firstPosition
		ts.add(1);  //NullPointer Exception
		System.out.println(ts);
	}
}