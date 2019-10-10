package 责任链实现过滤器;

public class Test {
    public static void main(String[] args) {
        MyFilterImpl a = new MyFilterImpl("a");
        MyFilterImpl b = new MyFilterImpl("b");
        MyFilterImpl c = new MyFilterImpl("c");
        MyFilterChainImpl myFilterChain = new MyFilterChainImpl();
        myFilterChain.register(a);
        myFilterChain.register(b,0);
        myFilterChain.register(c);
        myFilterChain.chain();
    }
}
