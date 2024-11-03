package ProbleSolvingChallenge.DepartmenGrouping;

import java.util.ArrayList;
import java.util.List;

public class DepartmentData {
    private int totalEmployee;
    private List<Employee> listOfEmployee = new ArrayList<>();;

    public DepartmentData() {
    }
    public void addEmployye(Employee employee) {
        listOfEmployee.add(employee);
        totalEmployee++;
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    @Override
    public String toString() {
        return "DepartmentData{" +
                "totalEmployee=" + totalEmployee +
                ", listOfEmployee=" + listOfEmployee +
                '}';
    }
}
