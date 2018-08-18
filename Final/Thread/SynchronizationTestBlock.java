class Hello{
	 void hi(String name){
	 synchronized(this){	
	  for(int i=0;i<5;i++){
	  	System.out.println("Hello  :"+name);
	  	try{Thread.sleep(2000);}catch(Exception e){}
	  }
	}
  }
}
class HelloTest extends Thread{
    Hello h;
    String name;
    public HelloTest(Hello h,String name){
    	this.h = h;
    	this.name = name;
    }

    public void run(){
    	h.hi(name);
    }
}

class SynchronizationTestBlock{
   public static void main(String[] args) {
   	    Hello h = new Hello();
   	  
   		new HelloTest(h,"Deependra").start();
   		new HelloTest(h,"Rishabh").start();
   	}	
}