class DaemonTest extends Thread{
	static Thread mt;
	public void run(){
		try{mt.join();}catch(Exception e){}  //If main Thread Is Join and End Its Excution Then all Daemon 
		//Thread Are automatically end theier Excution
		for(int  i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName() +": "+i);//SO ITS NOT EXECUTES IF WE SET IT DAEMON
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	}
	public static void main(String[] args) {
		    DaemonTest.mt = Thread.currentThread();
			DaemonTest t = new DaemonTest();
			t.setDaemon(true);//illegalthreadstateexception
			t.start();
			for(int  i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName() +": "+i);
			try{Thread.sleep(2000);}catch(Exception e){}
		}
			//t.setDaemon(true); //IllegalThreadStateException
	}
}