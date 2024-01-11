package solid.isp.good;

public class SimplePrinter implements Printer {

    @Override
    public String print(int target) {
        return String.valueOf(target);
    }
}
