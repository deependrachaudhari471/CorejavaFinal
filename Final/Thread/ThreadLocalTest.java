class Parent extends Thread{
  public static ThreadLocal local = new ThreadLocal();
  public void run(){
  	local.set("Deependra");
  	System.out.println(local.get());
  	new Child().start();
  }
}
class Child extends Thread{
   public void run(){
   	System.out.println(Parent.local.get());
   }
}

class Parent1 extends Thread{
  public static InheritableThreadLocal local = new InheritableThreadLocal(){
          public Object childValue(Object parentValue){
          	return "child Data";
          }
  };
  public void run(){
  	local.set("Deependra");
  	System.out.println(local.get());
  	new Child1().start();
  }
}
class Child1 extends Thread{
   public void run(){
   	System.out.println(Parent1.local.get());
   }
}

class ThreadLocalTest{
	public static void main(String[] args) {
		new Parent().start();
		new Parent1().start();
	}
}