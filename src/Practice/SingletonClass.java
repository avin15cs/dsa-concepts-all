package Practice;

public class SingletonClass {
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
class Singleton{
    private static Singleton obj;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(obj==null)
            obj=new Singleton();
        return obj;
    }
}