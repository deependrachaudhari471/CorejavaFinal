import java.util.*;
class CustomIterator implements Iterable<Employee>{
	List<Employee> list;
    public CustomIterator(){
    	list = ArrayList<Employee>();
    }
    public void addEmployee(Employee e){
        list.add(e);
    }

	public Iterator<Employee> iterator(){
		return (Iterator<Employee>)new MyIterator();
	}

	class MyIterator implements Iterator<Employee>{
      int index = 0;
      public boolean hasNext(){
      	if(index >= list.size()){
      		return false;
      	}else{
      		return true;
      	}
      }

      public Employee next(){
      	return list.get(index++);
      }
}

public static void main(String[] args) {
		CustomIterator m = new CustomIterator();
		m.addEmployee(new Employee("Deependra"));
		m.addEmployee(new Employee("Naman"));
		m.addEmployee(new Employee("Rahul"));
		CustomIterator it = m.iterator();
		while(it.hasNext()){
           System.out.println(it.next());
		}
	}
}


class Employee{
	private String empName;

	public Employee(String empName){
		this.empName = empName;
	}
	public String getname(){
		return empName;
	}
}