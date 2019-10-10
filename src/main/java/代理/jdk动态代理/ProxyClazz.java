package 代理.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyClazz implements InvocationHandler {

    Object dtInterface;

    public ProxyClazz(Object dtInterface) {
        this.dtInterface = dtInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("执行前");
        Object invoke = method.invoke(dtInterface,args);
        System.out.println(invoke);
        System.out.println("执行后");

        return invoke;
    }
}
