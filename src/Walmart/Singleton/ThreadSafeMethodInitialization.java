package Walmart.Singleton;

public class ThreadSafeMethodInitialization {
    public static void main(String[] args) {
        ThreadSafeMethod.getInstance();
    }

}

class ThreadSafeMethod{
    private static ThreadSafeMethod obj;
    private ThreadSafeMethod(){

    }

    public static synchronized ThreadSafeMethod getInstance(){
        if(obj==null)
            obj=new ThreadSafeMethod();

        return obj;
    }
}
