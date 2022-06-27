package Walmart.Singleton;

public class EagerInitialization {
    public static void main(String[] args) {
        Eager.getInstance();
    }
}
class Eager{
    private static Eager obj=new Eager();
    private Eager(){

    }

    public static Eager getInstance(){
        return obj;
    }
}