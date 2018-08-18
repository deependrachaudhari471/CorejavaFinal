class Panipuri{
    int num;
    boolean valuSet = false;
	public synchronized void fill(int num){
	     if(valuSet){
	     	try{wait();}catch(Exception e){}
	     }
	  this.num = num;
      System.out.println("Fill : "+num);
      valuSet = true;
      notify();
	}
	public synchronized void get(){
        if(!valuSet){
        	try{wait();}catch(Exception e){}
        }
        System.out.println("Gives Us : "+num);
        valuSet = false;
        notify();
	}
}

class Producer implements Runnable{
    Panipuri p;
    public Producer(Panipuri p){
    	this.p = p;
    	Thread t = new Thread(this);
    	t.start();
    }
    public void run(){
	   for(int i= 1;i<11;i++){
           p.fill(i);
           try{Thread.sleep(2000);}catch(Exception e){}
	   }	
	}
}
class Consumer implements Runnable{
	Panipuri p;
    public Consumer(Panipuri p){
    	this.p = p;
    	Thread t = new Thread(this);
    	t.start();
    }
    public void run(){
	   for(int i= 1;i<11;i++){
           p.get();
           try{Thread.sleep(2000);}catch(Exception e){}
	   }	
	}
}

class ProducerConsumer{
 public static void main(String[] args) {
 	Panipuri p =new Panipuri();
 	new Producer(p);
 	new Consumer(p);
 }
}