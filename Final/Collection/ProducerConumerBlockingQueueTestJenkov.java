import java.util.concurrent.*;
class Producer implements Runnable{
   private BlockingQueue queue;
   public Producer(BlockingQueue queue){
    this.queue = queue;
   }
  public void run(){
    try{
        queue.put("1");
        
        Thread.sleep(2000); 
        queue.put("2");
        
        Thread.sleep(2000); 
        queue.put("3");
        
        Thread.sleep(2000); 
      }catch(Exception e){}
  }
   
       
}
class Consumer implements Runnable{
  private BlockingQueue queue;
  public Consumer(BlockingQueue queue){
    this.queue = queue;
  }
  public void run(){
       try{
          System.out.println("Consumer : "+queue.take());
          System.out.println("Consumer : "+queue.take());
          System.out.println("Consumer : "+queue.take());
       }catch(Exception e){}

    }
   } 
class ProducerConumerBlockingQueueTestJenkov{
  public static void main(String[] args) {
  	BlockingQueue queue = new ArrayBlockingQueue(10);
    Producer p = new Producer(queue);
    Consumer c = new Consumer(queue);
    new Thread(p).start();
    new Thread(c).start();
    System.out.println("Started");
  }
}
