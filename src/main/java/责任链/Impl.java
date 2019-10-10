package 责任链;

public class Impl extends AbstactCla implements Inter {


    private String name;

    public Impl(String name) {
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println(name);

        if(getInter()!= null){
            getInter().test();
        }
    }
}
