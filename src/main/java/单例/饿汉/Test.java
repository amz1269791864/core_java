package 单例.饿汉;

public class Test {

    public static void main(String[] args) {
        Obj obj = Obj.getObj();
        Obj obj1 = Obj.getObj();

        System.out.println(obj);
        System.out.println(obj1);
    }
}
