class TestRun implements Runnable{

	 public void run(){
	 	for (int i = 0;i<10 ;i++ ) {
	 		try{
	 		    System.out.println(i);	
               Thread.sleep(1000);
	 		}catch(Exception e){}
	 	}
	 }
	public static void main(String[] args) throws Exception {
		TestRun t = new TestRun();
		new Thread(t).start();
		new Thread(t).join();
		new Thread(t).start();
	}
}