package solid.ocpdip.good;

public class AreaCalculator {

    public double calculateSumOfAreas(Shape... shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }
}
