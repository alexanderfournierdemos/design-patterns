package main;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployees(){

        List<Employee>  employees = new ArrayList<Employee>();

        Employee employeeFromDB = new Employee("1","John","Wich","JohnWick234@gmail.com");
        employees.add(employeeFromDB);


        return employees;
    }
}
