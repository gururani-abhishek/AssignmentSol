package org.hsbc.question5.ui;


import org.hsbc.question5.exceptions.EmployeeAlreadyExistsException;
import org.hsbc.question5.exceptions.EmployeeNotFoundException;
import org.hsbc.question5.model.Employee;
import org.hsbc.question5.storagelayer.Storage;
import org.hsbc.question5.storagelayer.StorageFactory;

public class Application {
    public static void main(String[] args) {
        StorageFactory storageFactory = new StorageFactory();
        Storage storageObject = storageFactory.getStorage();

        User userObject = new User(storageFactory, storageObject);

        try { // -> won't trigger any exception
            userObject.acceptEmpDetailsAndStore(new Employee("emp1", "city1", 1000.1, 1));
            userObject.acceptEmpDetailsAndStore(new Employee("emp2", "city2", 1000.2, 2));
            userObject.acceptEmpDetailsAndStore(new Employee("emp3", "city3", 1000.3, 3));
        }
        catch (EmployeeAlreadyExistsException eObject) {
            System.out.println("employee already exists exception");
        }

        try {
            int empNo = 5; // will trigger employee not found exception
            userObject.displayEmpByEmpNo(empNo);
        }
        catch (EmployeeNotFoundException eObject) {
            System.out.println("Employee not found exception");
        }

    }
}
