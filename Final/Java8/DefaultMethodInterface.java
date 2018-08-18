interface interface1{
    default String display(){
   	System.out.println("Interface 1");
     return "Deependra 1";
   }
}
interface interface2{
   default String display(){
   	System.out.println("Interface 2");
     return "Deependra 2";
   }   
}
class DefaultMethodInterface implements interface1,interface2{
    public String display(){
     return interface2.super.display();
    }
    public static void main(String[] args) {
    	System.out.println(new DefaultMethodInterface().display());
    }
}