class LocalInnerClass extends Thread{

	public void run(){
		final class LocalInnerTest extends Thread{ //We Makes it Only Final not private/public/or any 
            public void run(){
            	System.out.println("Hello Inner");
            }
		}
		final class LocalInnerTest2 extends Thread{ //We Makes it Only Final not private/public/or any 
            public void run(){
            	System.out.println("Hello Inner");
            }
		}

		LocalInnerTest local = new LocalInnerTest();
		LocalInnerTest2 local2 = new LocalInnerTest2();
		local.start();
		local2.start();
	}
public static void main(String[] args){
	LocalInnerClass l = new LocalInnerClass();
	l.start();
  }
}