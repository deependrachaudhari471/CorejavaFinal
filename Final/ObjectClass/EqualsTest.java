class EmployeeEquals{
	private String name;
	private Integer id;

	public EmployeeEquals(Integer id,String name){
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj){
        if(obj == this){
        	return true;
        }
 
		if(obj instanceof EmployeeEquals){
			EmployeeEquals e = (EmployeeEquals)obj;
			if(this.id==e.id && this.name.equals(e.name)){
				return true;
			}

		}
			return false;
	}

	public String toString(){
		return id+"..."+name;
	}
}
class EqualsTest{
  public static void main(String[] args) {
  	EmployeeEquals e1 = new EmployeeEquals(1,"Deep");
  	EmployeeEquals e2 = new EmployeeEquals(2,"Deep");

  	System.out.println(e1.hashCode());
  	System.out.println(e1.equals(e2));
  	System.out.println(e1);
  }
}