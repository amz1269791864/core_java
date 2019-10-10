package 原型;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import net.bytebuddy.implementation.bind.annotation.Super;

import java.io.*;

public class User implements Serializable,Cloneable{
     private String name;
     private Obj obj = new Obj();

    public Obj getObj() {
        return obj;
    }

    public void setObj(Obj obj) {
        this.obj = obj;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User userClone() throws CloneNotSupportedException {
		return (User)super.clone();
	}

    public  User deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);

        return (User) objectInputStream.readObject();


    }
}
