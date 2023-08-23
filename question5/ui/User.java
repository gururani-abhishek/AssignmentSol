package org.hsbc.question5.ui;

import org.hsbc.question5.exceptions.EmployeeAlreadyExistsException;
import org.hsbc.question5.exceptions.EmployeeNotFoundException;
import org.hsbc.question5.model.Employee;
import org.hsbc.question5.storagelayer.Storage;
import org.hsbc.question5.storagelayer.StorageFactory;

public class User {
    StorageFactory storageFactory;
    Storage storageObject;

    public User(StorageFactory storageFactory, Storage storageObject) {
        this.storageFactory = storageFactory;
        this.storageObject = storageObject;
    }

    public void acceptEmpDetailsAndStore(Employee emp) throws EmployeeAlreadyExistsException {
        try {
            storageObject.addEmployee(emp);
        }
        catch (EmployeeAlreadyExistsException eObject) {
            throw new EmployeeAlreadyExistsException(eObject);
        }
    }

    public void displayEmpByEmpNo(int empNo) throws EmployeeNotFoundException {

        try {
            Employee fetchedEmployee = storageObject.getEmployee(empNo);
            System.out.println(fetchedEmployee.getFirstName() + " " + fetchedEmployee.getCity() + " " + fetchedEmployee.getSalary() + " " + fetchedEmployee.getEmpNo());
        }
        catch (EmployeeNotFoundException eObject) {
            throw new EmployeeNotFoundException(eObject);
        }
    }
}
