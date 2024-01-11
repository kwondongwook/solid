package solid.isp.bad;

public class BadSimpleScanner implements BadCopier {

    @Override
    public String print(int target) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int scan(String target) {
        return Integer.parseInt(target);
    }
}
