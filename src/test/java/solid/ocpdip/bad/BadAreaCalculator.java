package solid.ocpdip.bad;

public class BadAreaCalculator {

    public double calculateSumOfAreas(Object... shapes) {
        double sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof BadCircle)
                sum += ((BadCircle) shape).calculateArea();
            else if (shape instanceof BadSquare)
                sum += ((BadSquare) shape).calculateArea();
        }
        return sum;
    }
}
