class Hello{
	 void hi(String name){
	 synchronized(Hello.class){	
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

class SynchronizationTestBlockClassLevel{
   public static void main(String[] args) {
   	    Hello h = new Hello();
   	    Hello h2 = new Hello();
   	  
   		new HelloTest(h,"Deependra").start();
   		new HelloTest(h2,"Rishabh").start();
   	}	
}