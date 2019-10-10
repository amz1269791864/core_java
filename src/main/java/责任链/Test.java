package 责任链;

public class Test {

    public static void main(String[] args) {
        Impl a = new Impl("A");
        Impl b = new Impl("B");
        Impl c = new Impl("C");

        a.setInter(b);
        b.setInter(c);
        a.test();
    }
}
