class LamdaExpression{
	public static void m(){
      Thread t = new Thread(()->{
          for(int i=0;i<5;i++)
          {
          	try{Thread.sleep(3000);}catch(Exception e){} 
          	System.out.println(i);
          }
      });
      Runnable t1 = () -> {
      	 for(int i=5;i<10;i++)
          {
          	try{Thread.sleep(3000);}catch(Exception e){} 
          	System.out.println(i);
          }
      };
      t.start();
      try{t.join();}catch(Exception e){}
      new Thread(t1).start();

	}
	public static void main(String[] args) {
	  m();
	}
}