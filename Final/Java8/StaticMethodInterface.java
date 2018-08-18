interface Interface1{
   static void method(){
   	System.out.println("Interface 1");
   }
}

class StaticMethodInterface implements Interface1{
   public static void main(String[] args) {
   	Interface1.method();
   }
}