public class test {
    public static void main(String[] args) {
        String str = "董晨倩 铁艺华 马依铭 王熙敏 吴天宇 刘桂通 左守让 张雨东 倪思杰 薛耀榕 敖铭峥 `祁永康 王锐 高会龙 张荣生";

        String[] split = str.split(" +");

        for (String s : split) {
            System.out.println(s);
        }
        System.out.println(split.length);
    }
}
