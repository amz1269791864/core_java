package 代理.静态代理;

public class Test {

    public static void main(String[] args) {

        JTIterface jtIterface = new Impl();

        ProxyClazz proxyClazz = new ProxyClazz(jtIterface);

        proxyClazz.test();

    }
}
