import java.util.*;
class Employee implements Comparable<Employee>{
private int id;
private String name;

public Employee(int id,String name){
	this.id = id;
	this.name = name;
}

public void setId(int id){
	this.id = id;
}
public int getId(){
	return id;
}
public void setName(String name){
 this.name = name;
}
public String getName(){
	return name;
}

public int compareTo(Employee emp){
	
	if(this.getId() == emp.getId()){
		return 0;
	}else if(this.getId() > emp.getId()){
		return 1;
	}else{
		return -1;
	}
}


}
class FirstAndLastTreeSet{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Employee(1,"Deep"));
		ts.add(new Employee(5,"ccc"));
		ts.add(new Employee(4,"asasa"));

		Iterator it  = ts.iterator();
		while(it.hasNext()){
			Employee emp = (Employee)it.next();
			System.out.println(emp.getId()+"--"+emp.getName());
		}
	}
}