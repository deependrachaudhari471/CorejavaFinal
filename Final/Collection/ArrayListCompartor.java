import java.util.*;
class ArrayListCompartor{
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Dependra","Chudhari"));
		list.add(new Employee(1,"Deependra","Ahudhari"));
		list.add(new Employee(1,"Aaman","Chudhari"));
        orderBy oreder = new orderBy();
		Collections.sort(list,oreder);
		for(Object o : list){
			System.out.println(o);
		}

	}
}
class orderBy implements Comparator{
    public int compare(Object o1,Object o2){
    	Employee e1 = (Employee)o1;
    	Employee e2 = (Employee)o2;
         int i = e1.getEmpId().compareTo(e2.getEmpId());
    	if(i == 0){
    		if(e1.getEmpFName().compareTo(e2.getEmpFName()) == 0){
    		   return e1.getEmpLName().compareTo(e2.getEmpLName());
    		}else{
    			return e1.getEmpFName().compareTo(e2.getEmpFName());
    		}
    	}else{
    		return i;
    	}
    }
}
class Employee {
	private Integer empId;
	private String empFName;
	private String empLname;

	public Employee(Integer empId,String empFName,String empLname){
		this.empId = empId;
		this.empFName = empFName;
		this.empLname = empLname;
	}
	public Integer getEmpId(){
		return empId;
	}
	public String getEmpFName(){
		return empFName;
	}
	public String getEmpLName(){
		return empLname;
	}
	public String toString(){
		return empId+"---"+empFName+"---"+empLname;
	}

}