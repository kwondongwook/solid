package solid.ocpdip.bad;

public class BadCircle {

    private final double radius;

    public BadCircle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
