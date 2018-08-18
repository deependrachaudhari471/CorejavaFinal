class BankAccount{
   Double balance;
   public BankAccount(Double balance){
   	this.balance = balance;
   }
}
class Customer implements Cloneable{
	BankAccount b;
	String name;
	public Customer(BankAccount b,String name){
		this.b = b;
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException{
         return super.clone();
	}

}
class ShallowcloningTest{
		public static void main(String[] args) throws CloneNotSupportedException{
			BankAccount b = new BankAccount(200.0);
			Customer c1 = new Customer(b,"Deep");
			Customer c2 = (Customer)c1.clone();

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