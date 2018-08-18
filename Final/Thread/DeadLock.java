class Deadlock1{
     public synchronized void test1(Deadlock2 d2){
     	try{Thread.sleep(3000);}catch(Exception e){}
     	d2.method2();
     }

    public synchronized void method1(){
        System.out.println("This is First Class Method");
    }
}
class Deadlock2{
    public synchronized void test2(Deadlock1 d1){
    	try{Thread.sleep(3000);}catch(Exception e){}
        d1.method1();
    }

    public synchronized void  method2(){
       System.out.println("This is Second Class Method");	
    }
}
class DeadLock extends Thread{
      Deadlock1 d1 = new Deadlock1();
      Deadlock2 d2 = new Deadlock2();

      public void m(){
      	this.start();
      	d1.test1(d2);
      }

      public void run(){
      	d2.test2(d1);
      }


	public static void main(String[] args) {
		new DeadLock().m();
	}
}