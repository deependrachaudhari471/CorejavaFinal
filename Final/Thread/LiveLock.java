import java.util.concurrent.locks.*;
class DeadlockTestLive1{
     public  void test1(DeadlockTestLive2 d2){
     	try{Thread.sleep(3000);}catch(Exception e){}
     	d2.method2();     	
     }

    public  void method1(){
        System.out.println("This is First Class Method");
    }
}
class DeadlockTestLive2{
    public  void test2(DeadlockTestLive1 d1){     
    	try{Thread.sleep(3000);}catch(Exception e){}
        d1.method1();        
    }

    public  void  method2(){
       System.out.println("This is Second Class Method");	
    }
}
class LiveLock{
	public static void main(String[] args) {
	  DeadlockTestLive1 d1 = new DeadlockTestLive1();
      DeadlockTestLive2 d2 = new DeadlockTestLive2();
      Thread t1 = new Thread(new Runnable(){
      	public void run(){
      		d1.test1(d2);
      	}
      });
      t1.start();
      Thread t2 = new Thread(new Runnable(){
      	public void run(){
      		d2.test2(d1);
      	}
      });
      t2.start();
	}
}