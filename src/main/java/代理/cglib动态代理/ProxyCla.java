package 代理.cglib动态代理;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyCla implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getObj(Class cla){
        
        enhancer.setSuperclass(cla);

        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("执行前");

        Object invoke = methodProxy.invokeSuper(o, objects);

        System.out.println("执行后");

        return invoke;
    }
}
