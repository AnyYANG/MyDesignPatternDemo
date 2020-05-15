package liuy.ObserverDesign;

/**
 * @author liuyang
 * @date 2020/5/15 10:41
 * @email liu.yang@autoyong.com
 * @
 */
public interface MyObserver {
    public void doing(long time, Baby baby);
}

class papa implements MyObserver {

    @Override
    public void doing(long time, Baby baby) {
        System.out.println("papa is coming! time"+time);

    }
}

class mama implements MyObserver {

    @Override
    public void doing(long time, Baby baby) {
        System.out.println("mama is coming! time"+time);
    }
}

class dog implements MyObserver {

    @Override
    public void doing(long time, Baby baby) {
        System.out.println("dog wangwang! time"+time);
    }
}