class Test{
	private int i;
	Test(int i){
		this.i = i;
	}

	protected void finalize() throws Throwable{
		System.out.println("Fibalize Method is Called :"+i);
	}
}
class Finalizetest{
	public static void main(String[] args) throws Throwable {
		Test t = new Test(10);
		Test t2 = new Test(20);
        
        //t = t2;
        t2 = t;
        //t = null;

		/*t.finalize();
		t2.finalize();*/
		System.gc(); // t is ready for garbagecollection
	}
}