class A{
  void m(){
  	System.out.println("Parent m");
  }
  void m1(){
  System.out.println("Parent m1");	
  }
}
class B extends A{
  void m(){
  	System.out.println("Child m");
  } 
}


class A1{
  static void m2(){
  	System.out.println("Parent m2");
  }
  void m3(){
  System.out.println("Parent m3");	
  }
}
class B1 extends A1{
  static void m2(){   //Static Method Are not Override Beacuse Memroy allocation at Compile time
  	System.out.println("Child m2");
  } 
}

class StaticOverride{
 public static void main(String[] args) {
 	A a = new B();
 	a.m();
 	a.m1();

 	A1 a1 = new B1();
 	a1.m2();
 	a1.m3();
 }
}