import java.util.*;
import java.util.function.Consumer;
class ForEachJava8{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
	    for(int i=1;i<=10;i++){
	    	list.add(i);
	    }

	    //Tarversing Using Comsumer
	MyConsumer m = new MyConsumer();
	list.forEach(m);
	}
}
class MyConsumer implements Consumer<Integer>{
	public void accept(Integer i){
		System.out.println(i);
	}
}