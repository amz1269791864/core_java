package 代理.jdk动态代理;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        ClassLoader classLoader = Impl.class.getClassLoader();

        Class<?>[] interfaces = Impl.class.getInterfaces();

        Impl dtInterface = new Impl();

        ProxyClazz proxyClazz = new ProxyClazz(dtInterface);

        DTInterface o = (DTInterface)Proxy.newProxyInstance(classLoader, interfaces, proxyClazz);

        o.test();

    }
}
