class TestRun2 extends Thread{

	 public void run(){
	 	for (int i = 0;i<10 ;i++ ) {
	 		try{
	 		    System.out.println(Thread.currentThread().getName()+"..."+i);	
               Thread.sleep(1000);
	 		}catch(Exception e){}
	 	}
	 }
	public static void main(String[] args) throws Exception {
		TestRun2 t = new TestRun2();
		TestRun2 t2 = new TestRun2();
		t.setName("Deependra");
		t2.setName("Aman");
		t2.start();
		t2.join();
		t.start();

		Thread.currentThread().join(); //DeadLock By Main Thread
	}
}