package solid.isp.good;

public class SimpleScanner implements Scanner {

    @Override
    public int scan(String target) {
        return Integer.parseInt(target);
    }
}
