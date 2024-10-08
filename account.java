class Employee{
	int id=101;
	int salary=2000;
public void changeSalary(int percentage){
	int change_sal=(percentage/100)*salary;
	int new_sal=change_sal+salary;
	
}
public void doPrint(){
	System.out.println("employee Id: "+id);
	System.out.println("previous salary: "+salary);}

public static void main(String args[]){
	Employee e=new Employee();
	e.changeSalary(7);
	e.doPrint();
}
}
