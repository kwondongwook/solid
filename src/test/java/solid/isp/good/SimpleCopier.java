package solid.isp.good;

public class SimpleCopier implements Printer, Scanner {

    @Override
    public String print(int target) {
        return String.valueOf(target);
    }

    @Override
    public int scan(String target) {
        return Integer.parseInt(target);
    }
}
