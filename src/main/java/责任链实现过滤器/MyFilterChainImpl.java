package 责任链实现过滤器;

import java.util.ArrayList;
import java.util.List;

public class MyFilterChainImpl implements MyFilterChain {

    List<MyFilter> list = new ArrayList<MyFilter>();

    public void register(MyFilter myFilter){
        list.add(myFilter);
    }

    public void register(MyFilter myFilter,int index){
        list.add(index,myFilter);
    }

    int index = 0;

    @Override
    public void chain() {

        if(index < list.size()){

            MyFilter myFilter = list.get(index);
            index++;
            myFilter.doFilter(this);
        }
    }
}
