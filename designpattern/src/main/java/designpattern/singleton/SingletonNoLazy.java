package designpattern.singleton;

public class SingletonNoLazy {

    //lazy loading : no
    //synchronized : yes
    //Use the classloader to instance the Object when this class be loaded.

    private static SingletonNoLazy singleton = new SingletonNoLazy();

    public SingletonNoLazy() {
    }

    public static SingletonNoLazy getInstance(){
        return singleton;
    }
}
