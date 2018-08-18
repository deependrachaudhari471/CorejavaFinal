interface AnoymousInnerClassArgumentTest1{
	public void m();
} 
class AnoymousInnerClassArgumentTest2{
	public void m1(AnoymousInnerClassArgumentTest1 a1){

	}
} 
class AnoymousInnerClassArgument{
	public static void main(String[] args) {
         Thread t = new Thread(){
           public void run(){
           	System.out.println("Inside Run1");
           }
         };
         t.start();

         System.out.println("---After Override---");
         AnoymousInnerClassArgumentTest2 test1 = new AnoymousInnerClassArgumentTest2();
         test1.m1(new AnoymousInnerClassArgumentTest1(){
               public void m1(){
            	System.out.println("Helo M1");
            }
         });
            
         
	}

}