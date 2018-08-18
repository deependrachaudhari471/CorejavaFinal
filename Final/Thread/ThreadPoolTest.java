import java.util.concurrent.*;
class Task implements Runnable{
	String taskName;
	public Task(String taskName){
		this.taskName = taskName;
	}
	public void run(){
       try{
       	Thread.sleep(2000);
       	System.out.println(taskName+" : Completed");
       }catch(Exception e){}
	}
}
class ThreadPoolTest{
	public static void main(String[] args) {
	   Thread t1 = new Thread(new Task("Task1"));
	   Thread t2 = new Thread(new Task("Task2"));
	   Thread t3 = new Thread(new Task("Task3"));
	   Thread t4 = new Thread(new Task("Task4"));
	   Thread t5 = new Thread(new Task("Task5"));
        
       ExecutorService pool = Executors.newFixedThreadPool(3);
       pool.execute(t1);
       pool.execute(t2);
       pool.execute(t3);
       pool.execute(t4);
       pool.execute(t5);

       pool.shutdown();

	}
}