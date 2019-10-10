package 单例.饿汉;

public class Obj {

    String name;

    static Obj obj;

    static{
        obj = new Obj();
        obj.setName("你好");
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Obj getObj() {
        return obj;
    }


}
