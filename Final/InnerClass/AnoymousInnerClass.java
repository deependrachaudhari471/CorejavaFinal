class AnoymousInnerClassTest{
	public void m(){

	}
	public void m1(){

	}
}
class AnoymousInnerClass{
	public static void main(String[] args) {
         Thread t = new Thread(){
           public void run(){
           	System.out.println("Inside Run1");
           }
         };
         t.start();

         System.out.println("---After Override---");
         AnoymousInnerClassTest test = new AnoymousInnerClassTest(){
            public void m(){
            	System.out.println("Helo M");
            }
            public void m1(){
            	System.out.println("Helo M1");
            }
         };
         test.m1();
         test.m();
	}

}