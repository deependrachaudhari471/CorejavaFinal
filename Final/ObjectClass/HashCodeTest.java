class EmployeeHash{
	private String name;
	private Integer id;

	public EmployeeHash(Integer id,String name){
		this.id = id;
		this.name = name;
	}

	public int hashCode(){
		int hashCode = 0;
		hashCode = id;
		return hashCode;
	}

	public String toString(){
		return id+"..."+name;
	}
}
class HashCodeTest{
  public static void main(String[] args) {
  	EmployeeHash e1 = new EmployeeHash(1,"Deep");
  	EmployeeHash e2 = new EmployeeHash(3,"ABC");

  	System.out.println(e1.hashCode());
  	System.out.println(e2.hashCode());
  	System.out.println(e1);
  }
}