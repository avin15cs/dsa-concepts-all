package Walmart.Singleton;

public class LazyInitialization {
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}

class Singleton{
    private static Singleton singleton;
    private Singleton(){


    }

    public static Singleton getInstance(){
        if(singleton==null)
            singleton=new Singleton();
        return singleton;
    }
}