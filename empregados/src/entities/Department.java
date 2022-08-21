package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private Integer payday;
    private Address address;

    List<Employee> employees = new ArrayList<Employee>();

    public Department() {
    }

    public Department(String name, Integer payday, Address address) {
        this.name = name;
        this.payday = payday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayday() {
        return payday;
    }

    public void setPayday(Integer payday) {
        this.payday = payday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);

    }

public double payroll(){
    double payroll =0;
    for (Employee e : employees) {
        payroll += e.getSalary();
    }  
      
    return payroll;
}

public void  emplooyesName(){
   
    for (Employee e : employees) {
        System.out.println(e.getName());
    }  
      
   
}
}


