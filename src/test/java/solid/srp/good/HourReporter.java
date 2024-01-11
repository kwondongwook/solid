package solid.srp.good;

public class HourReporter {

    public String reportHours(Employee employee) {
        return "Employee{" +
                "id=" + employee.getId() +
                ", workingHours=" + employee.getWorkingHours() +
                '}';
    }
}
