package 责任链实现过滤器;

public class MyFilterImpl implements MyFilter {

    String name;

    public MyFilterImpl(String name) {
        this.name = name;
    }

    @Override
    public void doFilter(MyFilterChain myFilterChain) {
        System.out.println(name);
        myFilterChain.chain();
    }
}
