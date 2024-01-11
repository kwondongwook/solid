package solid.srp.good;

public class PayCalculator {

    private double minimumHourlyWage;

    public PayCalculator(double minimumHourlyWage) {
        this.minimumHourlyWage = minimumHourlyWage;
    }

    public double getMinimumHourlyWage() {
        return minimumHourlyWage;
    }

    public void setMinimumHourlyWage(double minimumHourlyWage) {
        this.minimumHourlyWage = minimumHourlyWage;
    }

    public double calculatePay(Employee employee) {
        return employee.getWorkingHours() * minimumHourlyWage;
    }
}
