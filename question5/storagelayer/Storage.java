package org.hsbc.question5.storagelayer;


import org.hsbc.question5.exceptions.EmployeeAlreadyExistsException;
import org.hsbc.question5.exceptions.EmployeeNotFoundException;
import org.hsbc.question5.model.Employee;

public interface Storage {
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
    public Employee getEmployee(int empNo) throws EmployeeNotFoundException;
}
