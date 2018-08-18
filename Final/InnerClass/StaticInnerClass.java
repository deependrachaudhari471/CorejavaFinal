class StaticinnerClassTest{
	static int i = 10;
    public static class StaticInnertest extends Thread{
       static int j = 20;
       public void run(){
       	System.out.println("Hello : "+i+"----"+j);
       }
    }
}
class StaticinnerClass{
	public static void main(String[] args) {

		StaticinnerClassTest.StaticInnertest t1 = new StaticinnerClassTest.StaticInnertest();
		t1.start();
		
	}

	static class InsideMain{
		public void m(){
			System.out.println("Inside main");
		}
	} 
}