package solid.isp.bad;

public class BadSimpleCopier implements BadCopier {

    @Override
    public String print(int target) {
        return String.valueOf(target);
    }

    @Override
    public int scan(String target) {
        return Integer.parseInt(target);
    }
}
