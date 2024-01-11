package solid.srp.good;

public class Employee {

    private Long id;
    private String name;
    private double workingHours;

    public Employee(Long id, String name, double workingHours) {
        this.id = id;
        this.name = name;
        this.workingHours = workingHours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
