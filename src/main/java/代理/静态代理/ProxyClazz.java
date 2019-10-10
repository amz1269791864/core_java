package 代理.静态代理;

public class ProxyClazz {

    JTIterface jtIterface = null;

    public ProxyClazz(JTIterface jtIterface) {
        this.jtIterface = jtIterface;
    }

    public String test(){
        System.out.println("执行前");
        String test = jtIterface.test();
        System.out.println("执行后");
        return test;
    }
}
