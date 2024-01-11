package solid.ocpdip.bad;

public class BadRectangle {

    private final double width;
    private final double height;

    public BadRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}
