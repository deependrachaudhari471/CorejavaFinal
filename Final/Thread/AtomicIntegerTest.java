import java.util.concurrent.atomic.AtomicInteger;
class AtomicIntegerTest{
      public static void main(String[] args) throws Exception {
      	Test t = new Test();
      	Thread t1 = new Thread(t,"t1");
      	Thread t2 = new Thread(t,"t2");
      	t1.start();
      	t2.start();
      	t1.join();
      	t2.join();
      	System.out.println(t.getCount());
      }
}
class Test implements Runnable{
	//private AtomicInteger count = new AtomicInteger();
	int count = 0;
	public void run(){
		for (int i=0;i<5 ;i++ ) {
			//count.incrementAndGet();
		    count++;
		}
	}
	public int getCount(){
		//return this.count.get();
	    return this.count;
	}
}