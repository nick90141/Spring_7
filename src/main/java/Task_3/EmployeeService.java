package Task_3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    private long nextId = 1;

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(long id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee createEmployee(Employee employee) {
        employee.setId(nextId);
        nextId++;
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(long id, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == id) {
                employees.set(i, updatedEmployee);
                updatedEmployee.setId(id);
                return updatedEmployee;
            }
        }
        return null;
    }

    public void deleteEmployee(long id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
}
