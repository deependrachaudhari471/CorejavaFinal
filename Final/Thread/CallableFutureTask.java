import java.util.concurrent.*;
import java.util.*;

class MyCallable implements Callable<String>{
	public String call() throws Exception{
       Thread.sleep(2000);
       return Thread.currentThread().getName();
	}
}

class CallableFutureTask{
	public static void main(String[] args) throws Exception{
		ExecutorService pool = Executors.newFixedThreadPool(3);
		ArrayList<Future<String>> list = new ArrayList();

		Callable call = new MyCallable();
		for(int i = 0;i<10;i++){
			Future fut = pool.submit(call);
			list.add(fut);
		}
		for(Future f : list){
			System.out.println(f.get());
		}
		pool.shutdown();
	}
}