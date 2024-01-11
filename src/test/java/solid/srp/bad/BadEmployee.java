package solid.srp.bad;

public class BadEmployee {

    private Long id;
    private String name;
    private double workingHours;
    private double minimumHourlyWage;

    public BadEmployee(Long id, String name, double workingHours, double minimumHourlyWage) {
        this.id = id;
        this.name = name;
        this.workingHours = workingHours;
        this.minimumHourlyWage = minimumHourlyWage;
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

    public double getMinimumHourlyWage() {
        return minimumHourlyWage;
    }

    public void setMinimumHourlyWage(double minimumHourlyWage) {
        this.minimumHourlyWage = minimumHourlyWage;
    }

    public double calculatePay() {
        return workingHours * minimumHourlyWage;
    }

    public String reportHours() {
        return "Employee{" +
                "id=" + id +
                ", workingHours=" + workingHours +
                '}';
    }
}
