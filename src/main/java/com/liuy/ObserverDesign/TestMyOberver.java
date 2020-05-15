package liuy.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyang
 * @date 2020/5/15 10:44
 * @email liu.yang@autoyong.com
 * @
 */

/**
 * 孩子哭了 爸爸妈妈和狗狗不同时间的反应使用观察者模式显示
 */
class Baby {
    List<MyObserver> observerList = new ArrayList<>();
    public void regigerObsever(MyObserver observer){
        observerList.add(observer);
    }
    public void wakeup() {
        System.out.println("嘤嘤嘤");
        observerList.forEach(o -> o.doing(System.currentTimeMillis(), this));
    }

}

public class TestMyOberver {
    public static void main(String[] args) {
     Baby  baby=new Baby();
     baby.regigerObsever(new papa());
     baby.regigerObsever(new mama());
     baby.regigerObsever(new dog());
     baby.wakeup();

    }
}
