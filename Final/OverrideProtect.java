class OverrideProtect{
   public static void main(String[] args) {
   	  Base b = new Derived();
   	  b.method2();
   	 // b.method3();
   	 System.out.println( b.method1());
   }
}
class Base{
   public final String method1(){
   	return "Deependra";
   }
   public static void method2(){
   	System.out.println("Static Method");
   }
   private void method3(){
   	System.out.println("Private Method");
   }
}
class Derived extends Base{
  /* public final String method1(){
   	return "Deependra Derived";
   }*/
   public static void method2(){
   	System.out.println("Static Method Derived");
   }
  /* private void method3(){
   	System.out.println("Private Method Derived");
   }   */
}