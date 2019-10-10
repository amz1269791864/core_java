package 代理.jdk动态代理;

public class Impl implements DTInterface {
    @Override
    public String test() {
        System.out.println("impl");
        return "ok";
    }
}
