class Test{
   private static int objCount = 0;
   private static Test object;
   private Test(){
     objCount++;
   }
   public static Test getInstance(){
   	 if(objCount < 3){
   	 	object = new Test();
   	 }
   	 return object;
   }

}
class RestrictionObjectCreation4{
	public static void main(String[] args) {
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		Test t3 = Test.getInstance();
		Test t4 = Test.getInstance();
		Test t5 = Test.getInstance();
		System.out.println(t1.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t4.hashCode());
		System.out.println(t5.hashCode());
	}
}