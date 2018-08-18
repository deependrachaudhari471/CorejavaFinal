class FinalCloneTest{
	String name;
	public FinalCloneTest(String name){
        this.name=name;
	}
}
class FinalClone implements Cloneable{
     String name;
     FinalCloneTest t;
     public FinalClone(FinalCloneTest t,String name){
     	this.name = name;
     	this.t = t;
     }

     public Object clone()throws CloneNotSupportedException{
     	//return super.clone();
     	FinalCloneTest t1 = new FinalCloneTest(t.name);
     	FinalClone clon = new FinalClone(t1,name);
     	return clon;
     }

	public static void main(String[] args) throws CloneNotSupportedException{
		FinalCloneTest t = new FinalCloneTest("Hello");
		FinalClone c1 = new FinalClone(t,"Deepndra");
		FinalClone c2 = (FinalClone)c1.clone();

		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c1.t.name);
		System.out.println(c2.t.name);
		c2.name="Shekahr";
		c2.t.name = "hiii";
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c1.t.name);
		System.out.println(c2.t.name);
	}
}