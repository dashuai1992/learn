package designpattern.singleton;

public class SingletonLazy {

    //lazy loading : yes
    //synchronized : yes (DCL double-checked locking)

    private static volatile SingletonLazy singletonLazy;

    public SingletonLazy() {
    }

    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            synchronized(SingletonLazy.class){
                if(singletonLazy == null)
                    singletonLazy = new SingletonLazy();
            }
        }
        return singletonLazy;
    }
}
