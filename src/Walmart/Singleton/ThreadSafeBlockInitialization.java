package Walmart.Singleton;

public class ThreadSafeBlockInitialization {
    public static void main(String[] args) {

    }
}

class ThreadSafeBlock{
    private static ThreadSafeBlock obj;
    private ThreadSafeBlock(){

    }
    public static ThreadSafeBlock getInstance(){
        if(obj==null){
            synchronized (ThreadSafeBlock.class){
                if(obj==null)
                    obj=new ThreadSafeBlock();
            }
        }

        return obj;
    }
}
