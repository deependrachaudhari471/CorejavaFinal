import java.util.concurrent.locks.*;
class DeadlockTest1{
	ReentrantLock rl = new ReentrantLock();
     public  void test1(DeadlockTest2 d2){
     	rl.lock();
     	try{Thread.sleep(3000);}catch(Exception e){}
     	d2.method2();
     	rl.unlock();
     }

    public  void method1(){
        System.out.println("This is First Class Method");
    }
}
class DeadlockTest2{
	ReentrantLock rl = new ReentrantLock();
    public  void test2(DeadlockTest1 d1){
        rl.lock();
    	try{Thread.sleep(3000);}catch(Exception e){}
        d1.method1();
        rl.unlock();
    }

    public  void  method2(){
       System.out.println("This is Second Class Method");	
    }
}
class DeadLockPreserve extends Thread{
      DeadlockTest1 d1 = new DeadlockTest1();
      DeadlockTest2 d2 = new DeadlockTest2();

      public void m(){
      	this.start();
      	d1.test1(d2);
      }

      public void run(){
      	d2.test2(d1);
      }


	public static void main(String[] args) {
		new DeadLockPreserve().m();
	}
}