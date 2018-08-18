public enum EnumSingleton{
	INSTANCE;
	private int count;
	public void setCount(int count){
		this.count=count;
	}
	public void doProcess(){
		System.out.println("Hello Deependra : -"+this.count);
	}
}
class Test{
	public static void main(String[] args) {
		EnumSingleton.INSTANCE.setCount(1);
		EnumSingleton.INSTANCE.setCount(2);
        EnumSingleton.INSTANCE.doProcess();
        EnumSingleton.INSTANCE.doProcess();
        EnumSingleton.INSTANCE.doProcess();

	}
}