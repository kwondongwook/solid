package solid.isp.bad;

public class BadSimplePrinter implements BadCopier {

    @Override
    public String print(int target) {
        return String.valueOf(target);
    }

    @Override
    public int scan(String target) {
        throw new UnsupportedOperationException();
    }
}
