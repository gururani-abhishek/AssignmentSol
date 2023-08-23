package org.hsbc.question5.storagelayer;


import org.hsbc.question5.exceptions.EmployeeAlreadyExistsException;
import org.hsbc.question5.exceptions.EmployeeNotFoundException;
import org.hsbc.question5.model.Employee;

public class StorageImpl implements Storage{
    Employee[] employees = new Employee[100];
    public static int employeeCount = 0;

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
        try {
            if(employees[e.getEmpNo()] != null) {
                throw new EmployeeAlreadyExistsException("employee already exists");
            }
            employees[employeeCount] = e;
            employeeCount++;
        } catch (EmployeeAlreadyExistsException eObject) {
            throw new EmployeeAlreadyExistsException("employee already exists exception - " + eObject);
        }
    }

    @Override
    public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
        try {
            if(employees[empNo - 1] == null)
                throw new EmployeeNotFoundException("employee not found");
            return employees[empNo - 1];

        }
        catch (EmployeeNotFoundException eObject) {
            throw new EmployeeNotFoundException("employee not found - " + eObject);
        }
    }
}
