package 单例.懒汉;

public class Obj {

    private static Obj obj = null ;


    public static Obj getObj() {
        if(obj == null)
            obj = new Obj();
        return obj;
    }
}
