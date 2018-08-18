class ThreadGroupdemoTest extends Thread{
     ThreadGroupdemoTest(ThreadGroup tg,String name){
     	super(tg,name);
     	start();
      }

     public void run(){
         for(int i=1;i<10;i++){
         	try{
                System.out.println(i+"..."+Thread.currentThread().getName());
                Thread.sleep(2000);
         	}catch(Exception e){
         		System.out.println("Exception Encountered");
         	}
         }
     }
}
class ThreadGroupDemo{
  public static void main(String[] args) {
  	   ThreadGroup tg1 = new ThreadGroup("Parent");
  	   ThreadGroup tg2 = new ThreadGroup(tg1,"child");
  	   ThreadGroupdemoTest t1  = new ThreadGroupdemoTest(tg1,"Deependra");
  	   ThreadGroupdemoTest t2  = new ThreadGroupdemoTest(tg1,"Deependra2");
       System.out.println(tg1.getName());
        System.out.println(tg2.getName());
  }
}