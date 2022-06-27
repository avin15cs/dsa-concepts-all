package Walmart.TestDesignPattern;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton.getInstance();
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}

class Singleton{
    private Singleton(){

    }

    private static Singleton obj;

    public static Singleton getInstance(){
        if(obj==null)
            obj=new Singleton();
        return obj;
    }
}