import java.util.concurrent.*;
class Message{
  private String msg;
  public Message(String msg){
    this.msg = msg;
  }
  public String getMsg(){
    return msg;
  }
}

class Producer implements Runnable{
   private BlockingQueue<Message> queue;
   public Producer(BlockingQueue<Message> queue){
    this.queue = queue;
   }
  public void run(){
     for(int i = 0;i<20;i++){
      Message m = new Message(" "+i);
      try{
        Thread.sleep(3000);
        queue.put(m);
        System.out.println("Produce : "+m.getMsg());
      }catch(Exception e){}
     }
      Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
  }
   //adding exit message
       
}
class Consumer implements Runnable{
  private BlockingQueue<Message> queue;
  public Consumer(BlockingQueue<Message> queue){
    this.queue = queue;
  }
  public void run(){
    Message m = new Message("hello");
   for (int i = 0;i<20;i++) {
    try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getMsg() !="exit"){
            Thread.sleep(10);
            System.out.println("Consumed "+msg.getMsg());
            }
        }catch(Exception e){}
     
    }
    }
   } 
class ProducerConumerBlockingQueueTest{
  public static void main(String[] args) {
  	BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
    Producer p = new Producer(queue);
    Consumer c = new Consumer(queue);
    new Thread(p).start();
    new Thread(c).start();
    System.out.println("Started");
  }
}
