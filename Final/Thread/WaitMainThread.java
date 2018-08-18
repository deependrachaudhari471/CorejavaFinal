class WaitMainThread extends Thread{
     static Thread mt;
	 public void run(){
	 	 try{mt.join();}catch(Exception e){}
	 	for (int i = 0;i<10 ;i++ ) {
	 		try{
	 		    System.out.println(Thread.currentThread().getName()+"..."+i);	
               Thread.sleep(1000);
	 		}catch(Exception e){}
	 	}
	 }
	public static void main(String[] args) throws Exception {
	      WaitMainThread.mt = Thread.currentThread();
	      new WaitMainThread().start();
	      new WaitMainThread().join();
	      for (int i = 0;i<10 ;i++ ) {
	 		try{
	 		    System.out.println(Thread.currentThread().getName()+"..."+i);	
               Thread.sleep(1000);
	 		}catch(Exception e){}
	 	}	
		}
}