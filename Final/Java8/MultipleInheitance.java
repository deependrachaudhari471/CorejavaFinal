interface A{
	default void display(){
		System.out.println("default Method");
	}
	static boolean method(){
		System.out.println("static");
		return true;
	}
}
interface B extends A{
   
}
interface C extends A{
	
}

class MultipleInheitance implements B,C{
	public void display(){
      C.super.display();
	}
	boolean method(){
		System.out.println("static");
		 C.super.method();
		return true;
	}
	public static void main(String[] args) {
		new MultipleInheitance().display();
		new MultipleInheitance().method();
	}
}