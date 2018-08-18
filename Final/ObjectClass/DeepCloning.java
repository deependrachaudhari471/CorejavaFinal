class BankAccount1{
   Double balance;
   public BankAccount1(Double balance){
   	this.balance = balance;
   }
}
class Customer1 implements Cloneable{
	BankAccount1 b;
	String name;
	public Customer1(BankAccount1 b,String name){
		this.b = b;
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException{
         BankAccount1 b1 = new BankAccount1(b.balance);
         Customer1 c = new Customer1(b1,name);
         return c;
	}

}
class DeepCloning{
		public static void main(String[] args) throws CloneNotSupportedException{
			BankAccount1 b = new BankAccount1(200.0);
			Customer1 c1 = new Customer1(b,"Deep");
			Customer1 c2 = (Customer1)c1.clone();

			System.out.println(c1.name);
			System.out.println(c1.b.balance);
			System.out.println(c2.b.balance);
			System.out.println(c2.name);

			System.out.println("After change");
			c2.b.balance = 300.0;
			c2.name = "Rahul";
			System.out.println(c1.name);
			System.out.println(c1.b.balance);
			System.out.println(c2.b.balance);
			System.out.println(c2.name);
		}
}