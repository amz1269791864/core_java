package 原型;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

//        User user1 = new User();
//        User user2 = new User();
//
//        System.out.println(user1 == user2);
//        System.out.println(user1.getObj()==user2.getObj());


        //浅克隆
//        User user = new User();
//
//        User user1 = user.userClone();
//
//        System.out.println(user1 == user);
//        System.out.println(user1.getObj()==user.getObj());

        //深克隆
        User user = new User();

        User user1 = user.deepClone();

        System.out.println(user1 == user);
        System.out.println(user1.getObj()==user.getObj());

    }
}
