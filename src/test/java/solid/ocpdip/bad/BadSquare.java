package solid.ocpdip.bad;

public class BadSquare {

    private final double side;

    public BadSquare(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}
