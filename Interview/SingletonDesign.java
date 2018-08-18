class SingletonDesign{
	private static SingletonDesign object = null;
	public static int objCount = 0;
	//DisAllow for ooutside class
	private SingletonDesign(){

	}
	public static SingletonDesign getInstance(){
           if(objCount <=3){
           	object = new SingletonDesign();
           	objCount++;
           }
           return object;
	} 

	public void show(){
		System.out.println("Hello ");
	}


	public static void main(String[] args) {
		SingletonDesign s = SingletonDesign.getInstance();
		SingletonDesign s1 = SingletonDesign.getInstance();
		SingletonDesign s2 = SingletonDesign.getInstance();
		SingletonDesign s3 = SingletonDesign.getInstance();
		SingletonDesign s4 = SingletonDesign.getInstance();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}