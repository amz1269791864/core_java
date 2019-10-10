package 代理.cglib动态代理;

public class Test {
    public static void main(String[] args) {
        
        ProxyCla proxyCla = new ProxyCla();

        BeiDaiLi obj = (BeiDaiLi) proxyCla.getObj(BeiDaiLi.class);

        obj.test();
    }
}
