package ProbleSolvingChallenge.DepartmenGrouping;

import java.util.*;

public class DepartmentGrouping {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "BD"));
        employees.add(new Employee("Bob", "Tech"));
        employees.add(new Employee("Charlie", "HR"));
        employees.add(new Employee("David", "Tech"));
//        System.out.println(groupByDepartment(employees));
        Map<String, DepartmentData> result = groupByDepartment(employees);


        for (Map.Entry<String, DepartmentData> entry : result.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Total Employees: " + entry.getValue().getTotalEmployee());
            System.out.print("Employees: ");
            for (Employee emp : entry.getValue().getListOfEmployee()) {
                System.out.print(emp.getName() + " ");
            }
            System.out.println("\n");
        }
    }

    public static Map<String, DepartmentData> groupByDepartment(List<Employee> employees) {
        Map<String, DepartmentData> group = new HashMap<>();
        for (Employee employee : employees) {

            DepartmentData departmentData = group.get(employee.getDepartment());
            if (departmentData == null) {
                departmentData = new DepartmentData();
                group.put(employee.getDepartment(), departmentData);
            }
            departmentData.addEmployye(employee);

        }


        return group;
    }

}
