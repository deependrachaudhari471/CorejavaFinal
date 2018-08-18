import java.util.*;
class HashMapUserDefinedDuplicateKey{
	public static void main(String[] args) {
		HashMap<Employee,String> m = new HashMap<Employee,String>();
        m.put(new Employee(101,"Dee","Chaudhari"),"Indore");
        m.put(new Employee(101,"Dee","Chaudhari"),"Bhopal");
        m.put(new Employee(102,"Hrshit","Soni"),"dewas");
        m.put(new Employee(103,"Naman","Soni"),"Satna");
        System.out.println(m);
		
	}
}

class Employee{
	private Integer empId;
	private String FName;
	private String LName;
	public Employee(Integer empId,String FName,String LName){
		this.empId = empId;
		this.FName = FName;
		this.LName = LName;
	}
	public String getFName(){
		return FName;
	}
	public String getLName(){
		return LName;
	}
	public Integer getEmpId(){
		return empId;
	}

    public int hashCode(){    
   	 int hashcode = 0;
   	 hashcode = empId;
     return hashcode;

   }

    public boolean equals(Object obj){
    	if(obj instanceof Employee){
    		Employee emp = (Employee)obj;
              return this.empId== emp.empId && this.FName.equals(emp.FName) && this.LName.equals(emp.LName);
    	}else{
    		return false;	
    	}
    }

	public String toString(){
		return empId +"---"+FName+"---"+LName;
	}
}