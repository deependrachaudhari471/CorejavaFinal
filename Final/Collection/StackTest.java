import java.util.*;
class StackTest{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("1");
		s.push("2");
		s.push("3");
		System.out.println(s);
        System.out.println(s.search("3")); //1
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);  

	}
}