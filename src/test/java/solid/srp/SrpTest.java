package solid.srp;

import org.junit.jupiter.api.Test;
import solid.srp.bad.BadEmployee;
import solid.srp.good.Employee;
import solid.srp.good.PayCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SrpTest {

    double minimumHourlyWage = 10000;
    double newMinimumHourlyWage = 20000;

    @Test
    void SRP_위배() {
        BadEmployee employeeA = new BadEmployee(1L, "A", 7, minimumHourlyWage);
        BadEmployee employeeB = new BadEmployee(2L, "B", 7.5, minimumHourlyWage);
        BadEmployee employeeC = new BadEmployee(3L, "C", 8, minimumHourlyWage);
        assertEquals(employeeA.getWorkingHours() * minimumHourlyWage, employeeA.calculatePay());
        assertEquals(employeeB.getWorkingHours() * minimumHourlyWage, employeeB.calculatePay());
        assertEquals(employeeC.getWorkingHours() * minimumHourlyWage, employeeC.calculatePay());

        employeeA.setMinimumHourlyWage(newMinimumHourlyWage);
        employeeB.setMinimumHourlyWage(newMinimumHourlyWage);
        employeeC.setMinimumHourlyWage(newMinimumHourlyWage);
        assertEquals(employeeA.getWorkingHours() * newMinimumHourlyWage, employeeA.calculatePay());
        assertEquals(employeeB.getWorkingHours() * newMinimumHourlyWage, employeeB.calculatePay());
        assertEquals(employeeC.getWorkingHours() * newMinimumHourlyWage, employeeC.calculatePay());
    }

    @Test
    void SRP_준수() {
        Employee employeeA = new Employee(1L, "A", 7);
        Employee employeeB = new Employee(2L, "B", 7.5);
        Employee employeeC = new Employee(3L, "C", 8);

        PayCalculator payCalculator = new PayCalculator(minimumHourlyWage);
        assertEquals(employeeA.getWorkingHours() * minimumHourlyWage, payCalculator.calculatePay(employeeA));
        assertEquals(employeeB.getWorkingHours() * minimumHourlyWage, payCalculator.calculatePay(employeeB));
        assertEquals(employeeC.getWorkingHours() * minimumHourlyWage, payCalculator.calculatePay(employeeC));

        payCalculator.setMinimumHourlyWage(newMinimumHourlyWage);
        assertEquals(employeeA.getWorkingHours() * newMinimumHourlyWage, payCalculator.calculatePay(employeeA));
        assertEquals(employeeB.getWorkingHours() * newMinimumHourlyWage, payCalculator.calculatePay(employeeB));
        assertEquals(employeeC.getWorkingHours() * newMinimumHourlyWage, payCalculator.calculatePay(employeeC));
    }
}
