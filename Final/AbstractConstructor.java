abstract class A{
	String name ;
	public A(String name){
		this.name = name;
	}
	void m1(){
		System.out.println(name);
	}
	abstract void m();
}
class AbstractConstructor extends A{
     public AbstractConstructor(String name){
     	super(name);
     }
     void m(){
         System.out.println("name : "+this.name);
     }
    public static void main(String[] args) {
    	A ab = new AbstractConstructor("dEPENDRA");
    	ab.m();
    	ab.m1();
    }
}