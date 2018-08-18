import java.util.*;
class ArrayListComparable{
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3,"Dependra","Chudhari"));
		list.add(new Employee(1,"Aman","Chudhari"));
		list.add(new Employee(2,"Naman","Chudhari"));
        
		Collections.sort(list);
		for(Object o : list){
			System.out.println(o);
		}

	}
}
class Employee implements Comparable{
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

	public int compareTo(Object obj){
		Employee emp = (Employee)obj;
		return this.empId.compareTo(emp.empId);
	}

	public String toString(){
		return empId+"---"+empFName+"---"+empLname;
	}

}