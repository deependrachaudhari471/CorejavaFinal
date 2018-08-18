import java.util.*;
class PriorityQueueTest{
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue(new MyComparator());
		q.offer(new Employee("A"));
		q.offer(new Employee("X"));
		q.offer(new Employee("B"));
		q.offer(new Employee("A"));
        
        System.out.println(q);
	}
}
class MyComparator implements Comparator{
      public int compare(Object o1,Object o2){
      	Employee e1 = (Employee)o1;
      	Employee e2 = (Employee)o2;

      	return e1.getName().compareTo(e2.getName());
      }
}
class Employee{
	private String name;
	public Employee(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public String toString(){
		return name;
	}
}